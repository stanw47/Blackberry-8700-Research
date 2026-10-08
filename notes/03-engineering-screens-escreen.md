# 03 — Engineering screens (`EScreens`) architecture

Date: 2026-10-08

The 8700 OS ships the hidden engineering-screen subsystem:
`net_rim_escreen` (engine, 20 classes), `net_rim_escreen_app` (UI app, 8 classes),
and `net_rim_escreen_repository` (`EScreenExtendedMenuRepositoryImpl`).

## How we decompiled it

- `coddec` (Dr. Bolsen, mirror `george-hopkins/coddec`) compiled with JDK 21.
  - It **cannot parse the device's BBOS 4.1 COD v5** files
    (`no class ref found at offset 0x13d` while parsing v5 member refs), but it
    **does parse JDE 7.1 cods**.
  - JDE 7.1 ships its own escreen cods + `.debug` files
    (`tools/jde71_full/`), so the 7.1 implementation was decompiled as the
    architecture reference: `decompiled/net_rim_escreen/`.
  - Dr. Bolsen's coddec aborts the whole class on unhandled exceptions; patched
    `processModule` to `try { processClass(...) } catch (Exception e)` so all
    classes are emitted (a few still come out empty — tracked in notes).
- `coddec` quirks: writes into `./decompiled/<input-path-mangled>/...`; run it
  with *relative* filenames or its `replaceFirst(".cod","")` path regex mangles
  absolute paths.
- Future fidelity option: `bb-tools/cod2jar` (Rust, 98% success on BBOS 4.5)
  needs MSVC Build Tools to compile; its `bb-cod` parser can dump structure
  without `.debug` files.

## Access model (from `EScreenAccess` / `EScreenSecurityData`, 7.1)

```
EScreenAccess.getAccessLevel():
    if (!InternalServices.isDeviceSecure())        return 0;   // NOT secure -> allowed
    if (!InternalServices.isDeviceFakeSecure()) {
        if (Branding.getData(16) != null)
            return EScreenSecurityData.get(0).isAccessAllowed() ? 1 : -1;
    }
    return 0;

EScreenAccess.isAllowed():  getAccessLevel() != -1
```

`EScreenSecurityData` is a **persistent record** (`PersistentObject`, key
`0x218E...` + index, type size 51):

| field | type | meaning |
|---|---|---|
| `_unlockTime` | long | when access was granted (`currentTimeMillis`) |
| `_unlockLength` | long | validity window |
| `_allowAccess` | boolean | grant flag |

- `allowAccess(duration)` sets `now / duration / true` and commits.
- `isAccessAllowed()` first runs `checkForExpiry()`: access is revoked
  (and persisted) once `now > unlockTime + unlockLength`. That is the classic
  **time-limited engineering-screen unlock**.
- `get(index)` lazily creates the record on first use.

Interesting detail: on a device that is *not* "secure" (no password / security not
active), `getAccessLevel()` returns 0 and `isAllowed()` is true — the screens
are not blocked by the security record at all; the gate is the hidden entry
point rather than a code.

## Entry points

- `EngScreenSecurity$MyMenuItem.run()` → `showEScreens(1)`
- `EngScreenSecurity$RadioInfoMenuItem.run()` → `showEScreens(2, 8)`
- `EScreenExtendedMenuRepositoryImpl` provides extended menu entries.
- BBOS 4.1 string in `net_rim_escreen`: **"Backdoor moved to Options/Host
  Routing Table"** — the access path migrated into
  Options → Host Routing Table (hidden menu item).

## Content inventory (decompiled, committed)

`analysis/escreen-7.1-decomp/` contains the 7.1 reference decompilation:
models/UI (`EScreenModel`, `EScreenUI`), RTC runnable manager, VM/process
stats, and network sessions (`PingSession`, `TraceRouteSession`,
`UDPBlasterSession`) — i.e. the full diagnostics suite.

## Open items

1. Find the `allowAccess(...)` caller: not present in the escreen modules;
   likely `net_rim_bb_options(_app)` (the Host Routing Table backdoor) —
   decompile those next.
2. The EScreen code-entry dialog strings on 4.1 ("Bad user data. Please verify
   and try again.", `actionId=`/`screenId=` handling) suggest the backdoor
   validates typed data before granting a timed unlock.
3. `coddec` zero-byte classes (EScreenController, EScreenUI, session classes
   base): fix or use `cod2jar` (needs MSVC) for full fidelity.
4. On-device experiment (8700): Options → Host Routing Table → menu, look for
   the hidden engineering entry; the device has no password set, so
   `getAccessLevel()` should permit access.

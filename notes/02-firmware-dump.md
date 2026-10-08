# Session 02 — Full OS module dump (2026-10-08)

## Goal

Preserve the complete BBOS 4.1.0.194 module set from the connected 8700 using
JavaLoader's `save` command (read-only retrieval; no writes to the device).

## Method

1. Enumerate names: `JavaLoader dir -1` -> `dumps/module-list.txt` was generated
   from the saved `.cod` filenames (authoritative).
2. First attempt `JavaLoader save -g net.rim.blackberry` **aborted mid-transfer**
   on the first stubborn module (only 3 modules before failing).
3. Per-module loop with retries proved reliable:

```powershell
$names = Get-Content module-list.txt
foreach ($n in $names) {
    & JavaLoader.exe save $n *>> save_all.log
    Start-Sleep -Milliseconds 400
    # retry passes for failures with longer sleeps (1200 ms)
}
```

## Transport issue and workaround

`save_all.log` showed repeated:

```
Connecting to device...debug: COM error during Open: (0x80004004)
Error: unable to open port
```

JavaLoader intermittently falls back to the RIM Virtual Serial Ports
(COM5/COM7 on this host), which are not bridged to the handheld. Every such
attempt fails even though USB is available. Two mitigations:

- Space out invocations (400 ms; 1200 ms for stubborn modules).
- Retry passes — all modules eventually saved (0 missing after 3 passes).

Stopping the RIM services (`BlackBerry Device Manager`, `RIM MDNS`,
`RIM Tunnel Service`) was attempted but requires elevation on this host; not
required with the retry approach.

## Results

- **168 / 168 modules** saved, total **11,727,649 bytes** (~11.2 MB).
- Includes all 27 groups: core OS, crypto stack, smartcard authenticators,
  browsers, escreen, themes, fonts, and the three preloaded game titles.
- Third-party JADs saved via `backupgroups`:
  `Medieval Kings 2.JAD`, `Pro Golf Paradise.JAD`, `Spider Solitaire.JAD`.
- Integrity manifest: `dumps/SHA256SUMS.txt`.

## Verification

- `net_rim_os.cod` -> `JavaLoader info -v`:
  version `4.1.0.194`, 544 classes, built `Sun Nov 13 00:33:36 2005`.
- Module count matches the clean `dir` inventory exactly.

## Caveats

- `.cod` files are RIM-developed/signed modules; keep repository private.
- JavaLoader `save` retrieves modules but not raw flash layout, NVRAM, or
  manufacturing data. Deeper extraction (flash image, IT policy, radio
  calibration) would need `MFI Multiloader`, `recoverflash`, or hardware tools.

## Reproduction

```powershell
# On a host with the JDE 7.1 JavaLoader + RIM USB driver:
.\tools\bbos_dump.ps1 -JavaLoader "C:\path\to\JavaLoader.exe" -OutDir .\dump
```

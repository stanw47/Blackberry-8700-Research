# Session 01 — Connection and enumeration (2026-10-08)

## Hardware / host view

- Windows enumeration: `USB\VID_0FCA&PID_0001`, "BlackBerry Smartphone",
  class `RIMUSBBB`, driver `oem105.inf` / `RimUsb` 4.2.0.37 (BlackBerry),
  bus-reported description "BlackBerry Device", revision `REV_0104`.
- Compatible IDs: `USB\COMPAT_VID_0FCA&Class_FF&SubClass_FF&Prot_FF`
  (vendor-specific interface).
- Driver stack included `USBPcap` — raw USB capture is possible if protocol work
  is needed later.
- Two RIM Virtual Serial Ports present (COM5/COM7) but **not connected**
  (`Open` returns "The device is not connected"). JavaLoader initially tried
  them and failed; USB is the working transport. See notes/02.

## Tooling used

- `JavaLoader.exe` + `RIMUsbJni.dll` from the JDE 7.1 toolchain
  (borrowed from the 9930 research repo). Read-only commands only.
- BlackBerry Device Manager / RIM MDNS / RIM Tunnel services were running on the
  host (from BlackBerry Link). Could not be stopped without admin; the dump
  procedure works around them (notes/02).

## Commands run

```
JavaLoader.exe deviceinfo
JavaLoader.exe dir -1
JavaLoader.exe dir -g
JavaLoader.exe screenshot <file.bmp>
JavaLoader.exe -p0x23d410f8 eventlog
```

## deviceinfo results

```
Hardware Id:        0x84000b03
PIN:                0x23d410f8
VM Version:         0x40100c2          -> BBOS 4.1.0.194
Vendor ID:          102
```

Metrics blobs (ASCII regions):

- OS metrics: build `Nov 12 2005 13:07:10`, builder handle `cjames`,
  device string `RIM 8700 Series Colour GPRS Handheld` (sic).
- Boot ROM metrics: build `Aug 24 2005 11:43:06`, builder `nparthiban`,
  version string `2.0.0.90` present.

Module version confirmation from the dump:

```
net_rim_os  4.1.0.194  code=302404 data=199684 lit=80196 classes=544
            built Sun Nov 13 00:33:36 2005
```

## Module inventory

- `dir -1` listed **168 modules** (plus two banner artifacts, filtered).
- `dir -g` shows 27 groups: `net.rim.blackberry{,.api,.crypto1-3,.cms,
  .cryptoappsapi,.keystorebrowser,.keystorebrowser.certificate,.xml}`,
  `net.rim.device.apps.games.BrickBreaker`, `net.rim.java.{browser,
  browser.javascript,docViewer,help,memopad,passwordkeeper,phone,phone.tty,
  tasks}`, `net.rim.platform{,.ecmascript}`, plus third-party groups
  `Golf`, `Medieval Kings 2:Magmic Games`, `Spider Solitaire:Magmic Games`.
- Security-relevant modules present: `net_rim_escreen`, `net_rim_escreen_app`
  (engineering screens), `net_rim_crypto_{1,2,3}`, `net_rim_crypto_cms`,
  `net_rim_bb_crypto_api`, keystore browser, `net_rim_smartcard*`
  (GSACAC, Datakey authenticators), `net_rim_bb_passwordkeeper`,
  `net_rim_bluetooth`, `net_rim_loader`.

## Screenshot

- Captured live: 320x240, 16-bit, active screen.
- Shows: home screen grid, top bar **OFF** (radio disabled), Bluetooth active,
  date/time `MON, JUN 23  3:21 AM` (calendar-consistent with 2008, the last
  active year in the event log).
- Files: `media/8700-screen.png`, `media/8700-screen.bmp`.

## Event log highlights

- Last genuine use **Fri Jun 13, 2008** (17:26–17:32): `POWER_UP`,
  `OnOffMgr: powerUp`, Bluetooth ON, SMS receive events
  (`net.rim.sms data:INcn`), activation events, and
  `net.rim.device.internal.crypto.fips.SelfTestsStartupDialog` +
  `ConfirmationDialog` UI events.
- `ContentInjector: skipping fetch, sims have changed` — service books were
  tied to a SIM swap back then.
- Earlier 1970 timestamps = clock never set at factory; entries are ordered by
  insertion.
- Full log: `dumps/eventlog.txt`.

## Next tracks

1. Decompile the escreen modules (`net_rim_escreen*.cod`) to map the hidden
   engineering-screen unlock.
2. Investigate the BBOS `.cod` signing model (controlled APIs / RIM signatures)
   — the gate for running our own code.
3. Radio/SIM test in the local country (2G availability), then field-tool work
   (cell-ID logging, downgrade canary).

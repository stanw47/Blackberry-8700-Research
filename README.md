# BlackBerry 8700 Research

Research repository for the **BlackBerry 8700g ("Electron")** — RIM's 2005 flagship
and the ancestor of the modern BlackBerry line. Private repo.

## Device

| Field | Value |
|---|---|
| Model | BlackBerry 8700g (8700 series, quad-band GSM/EDGE) |
| Chipset | Intel PXA901 XScale @ 312 MHz |
| Memory | 16 MB SDRAM, 64 MB flash (no microSD, no Wi-Fi, no camera) |
| Display | 320 x 240, 16-bit |
| OS | BlackBerry OS **4.1.0.194** (`net_rim_os` built Nov 13 2005) |
| PIN | `0x23d410f8` |
| Hardware ID | `0x84000b03` |
| USB | Vendor-specific class `FF/FF/FF`, VID `0FCA` PID `0001`, driver `RimUsb` 4.2.0.37 |

## Status

- [x] USB connection + full enumeration (JavaLoader over RIM USB)
- [x] Full OS module dump — **168/168 modules**, 11.7 MB (`dumps/os-modules/`)
- [x] Screenshot + event log extraction
- [x] Engineering-screens architecture mapped (7.1 decomp; time-limited
      persistent unlock record; backdoor in Options/Host Routing Table)
- [ ] Code-signing model research (how to run our own `.cod`)
- [ ] 2G / local-carrier validation (device is outside the USA; GSM may still be live)
- [ ] Field tooling: cell-ID logger, 2G downgrade canary

## Structure

```
dumps/
  os-modules/      168 .cod modules + 3 .JAD (from device via JavaLoader)
  SHA256SUMS.txt   integrity manifest for the dump set
  deviceinfo.txt   JavaLoader deviceinfo (PIN, VM version, metrics blobs)
  module-list.txt  clean, sorted module inventory (168)
  groups.txt       device module groups
  eventlog.txt     full handheld event log
media/
  8700-screen.png  live screenshot (320x240)
  8700-screen.bmp  raw BMP capture
analysis/
  escreen-7.1-decomp/  coddec decompilation of JDE 7.1 escreen modules
                       (architecture reference for BBOS 4.1)
notes/
  01-connection-and-enumeration.md
  02-firmware-dump.md
  03-engineering-screens-escreen.md
tools/
  README.md        tool inventory (JavaLoader, BBSAK, MFI, Barry, coddec)
  bbos_dump.ps1    reproduction script for the module dump
```

## Key findings (session 1, 2026-10-08)

- JavaLoader (`jde71_full`) connects read-only over USB with **no signing or auth**.
- Device is **alive**: screenshot shows home screen, radio OFF, Bluetooth on,
  clock/date persisted from 2008 (Mon Jun 23, matches a 2008 calendar).
- Event log: last genuine use **Fri Jun 13, 2008** — power-up, FIPS self-test
  dialogs, SIM-change service-book events, SMS receipt.
- OS build provenance recovered from metrics blobs (OS metrics `cjames`,
  Nov 12 2005; Boot ROM metrics `nparthiban`, Aug 24 2005).
- Complete module inventory preserved, including `net_rim_escreen` /
  `net_rim_escreen_app` (hidden engineering screens), the crypto/smartcard stack,
  and the preloaded games (BrickBreaker, ProGolfParadise, SpiderSolitaire,
  Medieval Kings 2).

## Legal / handling

Dumps were pulled from a personally owned device for archival and security
research. Keep private; do not redistribute RIM proprietary binaries.

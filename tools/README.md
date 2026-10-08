# Tool inventory — BlackBerry 8700 (BBOS 4.x)

## Used so far

| Tool | Location / source | Purpose |
|---|---|---|
| **JavaLoader.exe** (+`RIMUsbJni.dll`) | JDE 7.1 toolchain (local: 9930 research repo `tools/jde71_full/`) | Device info, module dir/save, screenshot, event log, flash/erase, JAD backup |
| **BBSAK 1.9.2** | `Downloads/BBSAKv1.9.2_Installer.msi` | GUI Swiss-army knife (info, wipe, screenshots, module read) |
| **MFI Multiloader** | community archive (leaked RIM factory tool) | Deep flash load/inject, "nuked" device recovery — **destructive, use with care** |
| **Barry** | open source (netdirect) | Linux/libbbusb backup + protocol reference (needs libusb; not usable while RimUsb driver owns the device on Windows) |
| **Wireshark + USBPcap** | installed on host | Raw USB capture (USBPcap filter is in the device stack) |

Supporting tools on host: BlackBerry Desktop / AppLoader
(`Common Files\Research In Motion\AppLoader\Loader.exe`), RIM USB drivers
(`RimUsb`, `RimUsbNT.inf`), RIM Virtual Serial Port v2 (COM5/COM7).

## JavaLoader quick reference (read-only subset)

```
JavaLoader deviceinfo
JavaLoader dir [-a] [-g] [-s] [-1]
JavaLoader save <module> | save -g <group>
JavaLoader info -v <file.cod>
JavaLoader screenshot [active|primary|auxiliary] <file.bmp>
JavaLoader [-p0x<pin>] eventlog
JavaLoader backupgroups
```

## Reproduction

```powershell
.\bbos_dump.ps1 -JavaLoader "C:\path\to\JavaLoader.exe" -OutDir .\dump
```

## Notes

- Transport is USB (VID `0FCA`, PID `0001`). JavaLoader sometimes tries the
  RIM virtual COM ports first and logs `COM error during Open`; it is harmless
  but slows batch dumps — space out invocations and retry (see
  `notes/02-firmware-dump.md`).
- Read-only commands (`deviceinfo`, `dir`, `save`, `info`, `screenshot`,
  `eventlog`, `backupgroups`) do not modify the device.
- Destructive commands to avoid unless intended: `load`, `erase`, `wipe`,
  `resettofactory`, `cleareventlog`, `settime`.

param(
    [Parameter(Mandatory = $true)][string]$JavaLoader,
    [Parameter(Mandatory = $true)][string]$OutDir
)

$ErrorActionPreference = 'Continue'
New-Item -ItemType Directory -Force -Path $OutDir | Out-Null
Push-Location $OutDir

function JL {
    param([Parameter(ValueFromRemainingArguments = $true)][string[]]$Args)
    & $JavaLoader @Args 2>&1
}

Write-Host "[*] deviceinfo"
JL deviceinfo | Out-File 'deviceinfo.txt' -Encoding utf8

Write-Host "[*] module inventory"
JL dir -1 | Out-File 'dir-raw.txt' -Encoding utf8
JL dir -g | Out-File 'groups.txt' -Encoding utf8

$names = Get-Content 'dir-raw.txt' |
    ForEach-Object { $_.Trim() } |
    Where-Object { $_ -match '^[A-Za-z][A-Za-z0-9_]*$' -and $_ -notin @('Connected', 'Disconnected') } |
    Sort-Object -Unique

Write-Host "[*] saving $($names.Count) modules"
foreach ($n in $names) {
    if (-not (Test-Path "$n.cod")) {
        JL save $n | Out-Null
        Start-Sleep -Milliseconds 400
    }
}

Write-Host "[*] retry passes for stubborn modules"
foreach ($pass in 1..3) {
    $missing = $names | Where-Object { -not (Test-Path "$_.cod") }
    if (-not $missing) { break }
    Write-Host "    pass $pass : $($missing.Count) missing"
    foreach ($n in $missing) {
        JL save $n | Out-Null
        Start-Sleep -Milliseconds 1200
    }
}

Write-Host "[*] event log + screenshot"
JL -p0x23d410f8 eventlog | Out-File 'eventlog.txt' -Encoding utf8
JL screenshot 'screen.bmp' | Out-Null

Write-Host "[*] manifest"
Get-ChildItem *.cod, *.JAD -ErrorAction SilentlyContinue | Sort-Object Name | ForEach-Object {
    '{0}  {1}' -f (Get-FileHash $_.FullName -Algorithm SHA256).Hash.ToLower(), $_.Name
} | Set-Content 'SHA256SUMS.txt'

(Get-ChildItem *.cod).BaseName | Sort-Object | Set-Content 'module-list.txt'

Pop-Location
Write-Host "[*] done: $((Get-ChildItem $OutDir\*.cod).Count) modules"

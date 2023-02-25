@echo off
rem START or STOP Services
rem ----------------------------------
rem Check if argument is STOP or START

if not ""%1"" == ""START"" goto stop


"E:\Xampp\mysql\bin\mysqld" --defaults-file="E:\Xampp\mysql\bin\my.ini" --standalone
if errorlevel 1 goto error
goto finish

:stop
cmd.exe /C start "" /MIN call "E:\Xampp\killprocess.bat" "mysqld.exe"

if not exist "E:\Xampp\mysql\data\%computername%.pid" goto finish
echo Delete %computername%.pid ...
del "E:\Xampp\mysql\data\%computername%.pid"
goto finish


:error
echo MySQL could not be started

:finish
exit

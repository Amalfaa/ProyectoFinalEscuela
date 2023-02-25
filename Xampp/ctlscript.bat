@echo off
rem START or STOP Services
rem ----------------------------------
rem Check if argument is STOP or START

if not ""%1"" == ""START"" goto stop

if exist E:\Xampp\hypersonic\scripts\ctl.bat (start /MIN /B E:\Xampp\server\hsql-sample-database\scripts\ctl.bat START)
if exist E:\Xampp\ingres\scripts\ctl.bat (start /MIN /B E:\Xampp\ingres\scripts\ctl.bat START)
if exist E:\Xampp\mysql\scripts\ctl.bat (start /MIN /B E:\Xampp\mysql\scripts\ctl.bat START)
if exist E:\Xampp\postgresql\scripts\ctl.bat (start /MIN /B E:\Xampp\postgresql\scripts\ctl.bat START)
if exist E:\Xampp\apache\scripts\ctl.bat (start /MIN /B E:\Xampp\apache\scripts\ctl.bat START)
if exist E:\Xampp\openoffice\scripts\ctl.bat (start /MIN /B E:\Xampp\openoffice\scripts\ctl.bat START)
if exist E:\Xampp\apache-tomcat\scripts\ctl.bat (start /MIN /B E:\Xampp\apache-tomcat\scripts\ctl.bat START)
if exist E:\Xampp\resin\scripts\ctl.bat (start /MIN /B E:\Xampp\resin\scripts\ctl.bat START)
if exist E:\Xampp\jetty\scripts\ctl.bat (start /MIN /B E:\Xampp\jetty\scripts\ctl.bat START)
if exist E:\Xampp\subversion\scripts\ctl.bat (start /MIN /B E:\Xampp\subversion\scripts\ctl.bat START)
rem RUBY_APPLICATION_START
if exist E:\Xampp\lucene\scripts\ctl.bat (start /MIN /B E:\Xampp\lucene\scripts\ctl.bat START)
if exist E:\Xampp\third_application\scripts\ctl.bat (start /MIN /B E:\Xampp\third_application\scripts\ctl.bat START)
goto end

:stop
echo "Stopping services ..."
if exist E:\Xampp\third_application\scripts\ctl.bat (start /MIN /B E:\Xampp\third_application\scripts\ctl.bat STOP)
if exist E:\Xampp\lucene\scripts\ctl.bat (start /MIN /B E:\Xampp\lucene\scripts\ctl.bat STOP)
rem RUBY_APPLICATION_STOP
if exist E:\Xampp\subversion\scripts\ctl.bat (start /MIN /B E:\Xampp\subversion\scripts\ctl.bat STOP)
if exist E:\Xampp\jetty\scripts\ctl.bat (start /MIN /B E:\Xampp\jetty\scripts\ctl.bat STOP)
if exist E:\Xampp\hypersonic\scripts\ctl.bat (start /MIN /B E:\Xampp\server\hsql-sample-database\scripts\ctl.bat STOP)
if exist E:\Xampp\resin\scripts\ctl.bat (start /MIN /B E:\Xampp\resin\scripts\ctl.bat STOP)
if exist E:\Xampp\apache-tomcat\scripts\ctl.bat (start /MIN /B /WAIT E:\Xampp\apache-tomcat\scripts\ctl.bat STOP)
if exist E:\Xampp\openoffice\scripts\ctl.bat (start /MIN /B E:\Xampp\openoffice\scripts\ctl.bat STOP)
if exist E:\Xampp\apache\scripts\ctl.bat (start /MIN /B E:\Xampp\apache\scripts\ctl.bat STOP)
if exist E:\Xampp\ingres\scripts\ctl.bat (start /MIN /B E:\Xampp\ingres\scripts\ctl.bat STOP)
if exist E:\Xampp\mysql\scripts\ctl.bat (start /MIN /B E:\Xampp\mysql\scripts\ctl.bat STOP)
if exist E:\Xampp\postgresql\scripts\ctl.bat (start /MIN /B E:\Xampp\postgresql\scripts\ctl.bat STOP)

:end


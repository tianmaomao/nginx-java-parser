REM Run from src/main/resources/grammar
@echo off
antlr -listener -lib . -o ..\..\..\..\src\main\java\com\inspur\icp\nginxparser\antlr -visitor Nginx.g4

REM Or:
REM java -jar d:\antlr\antlr-4.5.3-complete.jar -listener -lib . -o ..\..\..\..\src\main\java\com\inspur\icp\nginxparser\antlr -visitor Nginx.g4
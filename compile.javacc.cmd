@echo off
javacc -OUTPUT_DIRECTORY=src\main\java\com\inspur\icp\nginxparser\parser E:\PublicCloud\slb\nginx-java-parser\src\main\resources\grammar\grammar.jj

javacc E:\PublicCloud\slb\nginx-java-parser\src\main\resources\grammar\grammar.jj
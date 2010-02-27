#!/bin/sh

APPENGINE_SDK=/Applications/appengine-java-sdk-1.3.1

find . -name datanucleus-*.jar | xargs rm
find . -name geronimo-*.jar | xargs rm
find . -name jdo2-*.jar | xargs rm
find . -name *jsr107cache*.jar | xargs rm

$APPENGINE_SDK/bin/appcfg.sh update spinupCheck01/war
$APPENGINE_SDK/bin/appcfg.sh update spinupCheck02/war
$APPENGINE_SDK/bin/appcfg.sh update spinupCheck03/war

APPENGINE_SDK=/Applications/GoogleAppEngineLauncher.app/Contents/Resources/GoogleAppEngine-default.bundle/Contents/Resources/google_appengine

$APPENGINE_SDK/appcfg.py update spinupCheck04


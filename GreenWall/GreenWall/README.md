# greenwall

a weirdly addictive arcade-style android game, where you fling fruit at a wall.

Original: https://github.com/awlzac/greenwall

Play is self explanatory -- just splatting various food items 
by throwing them at the wall.  typical cartoonish arcade game feel, play gets
faster and more difficult gradually each round.

Playable executable available at
https://play.google.com/store/apps/details?id=com.bulsy.greenwall

## To submit

https://classroom.github.com/assignment-invitations/14a3c9bb353d64f4c773ac2417e9b8d9


## Sample Solution:

https://github.com/DeLaSalleUniversity-Manila/greenwall-melvincabatuan

## Submission Procedure with Git: 

```shell
$ cd /path/to/your/android/app/
$ git init
$ git add –all
$ git commit -m "your message, e.x. Assignment 1 submission"
$ git remote add origin <Assignment link copied from assignment github, e.x. https://github.com/DeLaSalleUniversity-Manila/secondactivityassignment-melvincabatuan.git>
$ git push -u origin master
<then Enter Username and Password>
```
 
 ## Videocapture:
-----------
[![screenshot](screenshot_001.png)](https://youtu.be/dXm6x-KHLZo)

 
## Clone

```shell
$ git clone --recursive https://github.com/awlzac/greenwall
Cloning into 'greenwall'...
remote: Counting objects: 349, done.
remote: Compressing objects: 100% (176/176), done.
remote: Total 349 (delta 111), reused 349 (delta 111), pack-reused 0
Receiving objects: 100% (349/349), 2.12 MiB | 94 KiB/s, done.
Resolving deltas: 100% (111/111), done.
```

## Build

```shell
$ cd greenwall/

$ chmod +x gradlew

$ ./gradlew build
:app:preBuild
:app:compileDebugNdk
:app:preDebugBuild
:app:checkDebugManifest
:app:preReleaseBuild
:app:prepareComAndroidSupportAppcompatV72200Library
:app:prepareComAndroidSupportSupportV42200Library
:app:prepareDebugDependencies
:app:compileDebugAidl
:app:compileDebugRenderscript
:app:generateDebugBuildConfig
:app:generateDebugAssets UP-TO-DATE
:app:mergeDebugAssets
:app:generateDebugResValues
:app:generateDebugResources
:app:mergeDebugResources
/home/cobalt/AndroidStudioProjects/greenwall/app/build/intermediates/exploded-aar/com.android.support/appcompat-v7/22.0.0/res/drawable-hdpi-v4/abc_spinner_mtrl_am_alpha.9.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
:app:processDebugManifest
:app:processDebugResources
:app:generateDebugSources
:app:compileDebugJava
Note: /home/cobalt/AndroidStudioProjects/greenwall/app/src/main/java/com/bulsy/greenwall/MainActivity.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: /home/cobalt/AndroidStudioProjects/greenwall/app/src/main/java/com/bulsy/greenwall/MainActivity.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
:app:preDexDebug
:app:dexDebug
:app:processDebugJavaRes UP-TO-DATE
:app:validateDebugSigning
:app:packageDebug
:app:zipalignDebug
:app:assembleDebug
:app:checkReleaseManifest
:app:prepareReleaseDependencies
:app:compileReleaseAidl
:app:compileReleaseRenderscript
:app:generateReleaseBuildConfig
:app:generateReleaseAssets UP-TO-DATE
:app:mergeReleaseAssets
:app:generateReleaseResValues
:app:generateReleaseResources
:app:mergeReleaseResources
/home/cobalt/AndroidStudioProjects/greenwall/app/build/intermediates/exploded-aar/com.android.support/appcompat-v7/22.0.0/res/drawable-hdpi-v4/abc_spinner_mtrl_am_alpha.9.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
:app:processReleaseManifest
:app:processReleaseResources
:app:generateReleaseSources
:app:compileReleaseJava
Note: /home/cobalt/AndroidStudioProjects/greenwall/app/src/main/java/com/bulsy/greenwall/MainActivity.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: /home/cobalt/AndroidStudioProjects/greenwall/app/src/main/java/com/bulsy/greenwall/MainActivity.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
:app:lintVitalRelease SKIPPED
:app:compileReleaseNdk
:app:preDexRelease
:app:dexRelease
:app:processReleaseJavaRes UP-TO-DATE
:app:packageRelease
:app:assembleRelease
:app:assemble
:app:compileLint
:app:lint
Ran lint on variant debug: 13 issues found
Ran lint on variant release: 13 issues found
Wrote HTML report to file:/home/cobalt/AndroidStudioProjects/greenwall/app/build/outputs/lint-results.html
Wrote XML report to /home/cobalt/AndroidStudioProjects/greenwall/app/build/outputs/lint-results.xml
:app:check
:app:build

BUILD SUCCESSFUL

Total time: 2 mins 34.079 secs

```

## INstall
```shell
$ adb devices
List of devices attached 
KROJAUPJD6U8QCT8	device

$ adb install ./app/build/outputs/apk/app-debug.apk
4470 KB/s (1954265 bytes in 0.426s)
	pkg: /data/local/tmp/app-debug.apk
Success

```


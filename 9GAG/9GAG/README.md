9GAG-Android (unofficial)
=====================

## Android学习之路

Recommend Blog--[Android学习之路](http://stormzhang.com/android/2014/07/07/learn-android-from-rookie/)

This a powerful REST Client of 9GAG unofficial which uses Android Studio + Gradle, and follows Android Design.

## Run Environment

Min SDK verison 4.0+

Android Studio version 1.0 final

Gradle version 2.2.1

## Preview

![9GAG](http://ww4.sinaimg.cn/mw1024/af63c0e3gw1eg8ahf4b1yj21kw0szqc8.jpg)

[Download Demo](https://github.com/stormzhang/9GAG/releases/download/v1.0.0/9GAG_v1.0.0.apk)


## Open source projects

* [Volley](https://android.googlesource.com/platform/frameworks/volley)

* [ButterKnife](http://jakewharton.github.io/butterknife/)

* [UniversalImageLoader](https://github.com/nostra13/Android-Universal-Image-Loader)

* [ListViewAnimations](https://github.com/nhaarman/ListViewAnimations)

* [NineOldAndroid](http://nineoldandroids.com/)

* [PhotoView](https://github.com/chrisbanes/PhotoView)

* [FoldingLayout](https://github.com/tibi1712/Folding-Android)

* [ProgressWheel](https://github.com/Todd-Davies/ProgressWheel)

* [AndroidStaggeredGrid](https://github.com/etsy/AndroidStaggeredGrid)

* [BlurEffectForAndroidDesign](https://github.com/PomepuyN/BlurEffectForAndroidDesign)

* [Shimmer-android](https://github.com/RomainPiel/Shimmer-android)

* [Titanic](https://github.com/RomainPiel/Titanic)

## More about me

* [stormzhang](http://stormzhang.github.io/about.html)

License
============

    Copyright 2014 stormzhang

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.

## This Fork	
	
### Videocapture

https://youtu.be/AJjSzEBQZZ0

### To submit

https://classroom.github.com/assignment-invitations/d6c3a7398983fb5948cb2f7ca497591e 

### Clone

```shell
$ git clone https://github.com/DeLaSalleUniversity-Manila/9GAG
Cloning into '9GAG'...
remote: Counting objects: 1157, done.
remote: Total 1157 (delta 0), reused 0 (delta 0), pack-reused 1157
Receiving objects: 100% (1157/1157), 8.00 MiB | 92 KiB/s, done.
Resolving deltas: 100% (564/564), done.
```


### Build

```shell
$ ./gradlew installDebug
:app:preBuild
:app:compileDebugNdk UP-TO-DATE
:app:preDebugBuild
:app:checkDebugManifest
:app:preReleaseBuild
:extras:ShimmerAndroid:compileLint
:extras:ShimmerAndroid:copyReleaseLint UP-TO-DATE
:extras:ShimmerAndroid:mergeReleaseProguardFiles UP-TO-DATE
:extras:ShimmerAndroid:preBuild
:extras:ShimmerAndroid:preReleaseBuild
:extras:ShimmerAndroid:checkReleaseManifest
:extras:ShimmerAndroid:prepareReleaseDependencies
:extras:ShimmerAndroid:compileReleaseAidl
:extras:ShimmerAndroid:compileReleaseRenderscript
:extras:ShimmerAndroid:generateReleaseBuildConfig
:extras:ShimmerAndroid:generateReleaseAssets UP-TO-DATE
:extras:ShimmerAndroid:mergeReleaseAssets
:extras:ShimmerAndroid:generateReleaseResValues
:extras:ShimmerAndroid:generateReleaseResources
:extras:ShimmerAndroid:packageReleaseResources
:extras:ShimmerAndroid:processReleaseManifest
:extras:ShimmerAndroid:processReleaseResources
:extras:ShimmerAndroid:generateReleaseSources
:extras:ShimmerAndroid:compileReleaseJava
:extras:ShimmerAndroid:processReleaseJavaRes UP-TO-DATE
:extras:ShimmerAndroid:packageReleaseJar
:extras:ShimmerAndroid:compileReleaseNdk
:extras:ShimmerAndroid:packageReleaseJniLibs UP-TO-DATE
:extras:ShimmerAndroid:packageReleaseLocalJar UP-TO-DATE
:extras:ShimmerAndroid:packageReleaseRenderscript UP-TO-DATE
:extras:ShimmerAndroid:bundleRelease
:app:prepare9GAGExtrasShimmerAndroidUnspecifiedLibrary
:app:prepareComAlexvasilkovFoldableLayout101Library
:app:prepareComAndroidSupportSupportV42221Library
:app:prepareComEtsyAndroidGridLibrary105Library
:app:prepareDebugDependencies
:app:compileDebugAidl
:app:compileDebugRenderscript
:app:generateDebugBuildConfig
:app:generateDebugAssets UP-TO-DATE
:app:mergeDebugAssets
:app:generateDebugResValues
:app:generateDebugResources
:app:mergeDebugResources
/home/cobalt/AndroidStudioProjects/9GAG/app/src/main/res/drawable-xhdpi/icon.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
/home/cobalt/AndroidStudioProjects/9GAG/app/build/intermediates/exploded-aar/9GAG.extras/ShimmerAndroid/unspecified/res/drawable-nodpi-v4/spot_mask.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
/home/cobalt/AndroidStudioProjects/9GAG/app/src/main/res/drawable-xhdpi/ic_action_overflow.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
/home/cobalt/AndroidStudioProjects/9GAG/app/src/main/res/drawable-xhdpi/listitem_feed_pressed.9.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
/home/cobalt/AndroidStudioProjects/9GAG/app/src/main/res/drawable-xhdpi/shadow_right.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
/home/cobalt/AndroidStudioProjects/9GAG/app/src/main/res/drawable-xhdpi/bg.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
/home/cobalt/AndroidStudioProjects/9GAG/app/src/main/res/drawable-xhdpi/ic_refresh.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
/home/cobalt/AndroidStudioProjects/9GAG/app/src/main/res/drawable-xhdpi/listitem_feed_bg.9.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
/home/cobalt/AndroidStudioProjects/9GAG/app/src/main/res/drawable-nodpi/wave.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
/home/cobalt/AndroidStudioProjects/9GAG/app/src/main/res/drawable-xhdpi/shadow_left.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
/home/cobalt/AndroidStudioProjects/9GAG/app/src/main/res/drawable-xhdpi/ic_drawer.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
/home/cobalt/AndroidStudioProjects/9GAG/app/src/main/res/drawable-xhdpi/shadow_bottom.png: libpng warning: iCCP: Not recognizing known sRGB profile that has been edited
:app:processDebugManifest
:app:processDebugResources
:app:generateDebugSources
:app:compileDebugJava
Note: Some input files use or override a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: Some input files use unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
:app:preDexDebug
:app:dexDebug
:app:processDebugJavaRes UP-TO-DATE
:app:validateDebugSigning
:app:packageDebug
:app:zipalignDebug
:app:assembleDebug
:app:installDebug
Installing APK 'app-debug.apk' on 'X330 - 4.4.4'
Installed on 1 device.

BUILD SUCCESSFUL

Total time: 1 mins 57.408 secs
```

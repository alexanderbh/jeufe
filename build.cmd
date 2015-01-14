set BOOST_PATH=D:\dev\tools\boost_1_57_0

mkdir java\com\shimanski\eufe
mkdir java\jni
mkdir java\jni\ThirdParty

swig.exe -c++ -java -package com.shimanski.eufe -outdir java\com\shimanski\eufe -o java\jni\eufe_wrap.cxx eufeLocal\swig\eufe.i
copy eufeLocal\*.cpp java\jni\
copy eufeLocal\*.h java\jni\
copy eufeLocal\ThirdParty\*.* java\jni\ThirdParty

copy Android.mk java\jni\Android.mk
copy Application.mk java\jni\Application.mk

ndk-build -C java/jni
APP_STL := c++_static 
APP_ABI := armeabi armeabi-v7a x86 mips

# use this to select gcc instead of clang
#NDK_TOOLCHAIN_VERSION := 4.8
# OR use this to select the latest clang version:
NDK_TOOLCHAIN_VERSION := clang


# then enable c++11 extentions in source code
APP_CPPFLAGS += -std=c++11
# or use APP_CPPFLAGS := -std=gnu++11

LOCAL_LDLIBS += -latomic
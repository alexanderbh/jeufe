LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

NDK_TOOLCHAIN_VERSION := clang


LOCAL_MODULE := eufe
LOCAL_CPP_EXTENSION := .cxx .cpp .cc .hpp

LOCAL_CPP_FEATURES := exceptions rtti


LOCAL_CPPFLAGS    := -std=c++11
LOCAL_CPPFLAGS += -D _DEBUG
LOCAL_CPPFLAGS += -D __GLIBC__

LOCAL_LDLIBS += -latomic


LOCAL_SRC_FILES := \
Item.cpp \
ThirdParty/sqlite3.c \
eufe_wrap.cxx \
Area.cpp \
Attribute.cpp \
Blob.cpp \
Booster.cpp \
CapacitorSimulator.cpp \
Character.cpp \
Charge.cpp \
Compiler.cpp \
ControlTower.cpp \
DamagePattern.cpp \
Decoder.cpp \
Drone.cpp \
Effect.cpp \
EffectAdaptiveArmorHardener.cpp \
EffectArmorRepairInterpreter.cpp \
EffectByteCodeInterpreter.cpp \
EffectEnergyDestabilizationNewInterpreter.cpp \
EffectEnergyTransferInterpreter.cpp \
EffectHardPointModifierEffectInterpreter.cpp \
EffectHullRepairInterpreter.cpp \
EffectLeechInterpreter.cpp \
EffectNaniteRepairPasteArmorDamageBonus.cpp \
EffectShieldBoostingInterpreter.cpp \
EffectSlotModifierInterpreter.cpp \
Encoder.cpp \
Engine.cpp \
FetchResult.cpp \
Gang.cpp \
HeatSimulator.cpp \
Implant.cpp \
LocationGroupModifier.cpp \
LocationRequiredSkillModifier.cpp \
Modifier.cpp \
Module.cpp \
Ship.cpp \
Skill.cpp \
Structure.cpp \
SqliteFetchResult.cpp \
SqlConnector.cpp \
SqliteConnector.cpp \



include $(BUILD_SHARED_LIBRARY)

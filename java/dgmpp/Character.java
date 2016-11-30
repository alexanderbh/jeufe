/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package dgmpp;

public class Character extends Item {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected Character(long cPtr, boolean cMemoryOwn) {
    super(dgmppJNI.Character_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Character obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        dgmppJNI.delete_Character(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Ship getShip() {
    long cPtr = dgmppJNI.Character_getShip(swigCPtr, this);
    return (cPtr == 0) ? null : new Ship(cPtr, true);
  }

  public Ship setShip(int typeID) {
    long cPtr = dgmppJNI.Character_setShip(swigCPtr, this, typeID);
    return (cPtr == 0) ? null : new Ship(cPtr, true);
  }

  public void reset() {
    dgmppJNI.Character_reset(swigCPtr, this);
  }

  public Skill getSkill(int typeID) {
    long cPtr = dgmppJNI.Character_getSkill(swigCPtr, this, typeID);
    return (cPtr == 0) ? null : new Skill(cPtr, true);
  }

  public boolean emptyImplantSlot(int slot) {
    return dgmppJNI.Character_emptyImplantSlot(swigCPtr, this, slot);
  }

  public boolean emptyBoosterSlot(int slot) {
    return dgmppJNI.Character_emptyBoosterSlot(swigCPtr, this, slot);
  }

  public Implant getImplant(int slot) {
    long cPtr = dgmppJNI.Character_getImplant(swigCPtr, this, slot);
    return (cPtr == 0) ? null : new Implant(cPtr, true);
  }

  public Booster getBooster(int slot) {
    long cPtr = dgmppJNI.Character_getBooster(swigCPtr, this, slot);
    return (cPtr == 0) ? null : new Booster(cPtr, true);
  }

  public Implant addImplant(int typeID, boolean forced) {
    long cPtr = dgmppJNI.Character_addImplant__SWIG_0(swigCPtr, this, typeID, forced);
    return (cPtr == 0) ? null : new Implant(cPtr, true);
  }

  public Implant addImplant(int typeID) {
    long cPtr = dgmppJNI.Character_addImplant__SWIG_1(swigCPtr, this, typeID);
    return (cPtr == 0) ? null : new Implant(cPtr, true);
  }

  public Booster addBooster(int typeID, boolean forced) {
    long cPtr = dgmppJNI.Character_addBooster__SWIG_0(swigCPtr, this, typeID, forced);
    return (cPtr == 0) ? null : new Booster(cPtr, true);
  }

  public Booster addBooster(int typeID) {
    long cPtr = dgmppJNI.Character_addBooster__SWIG_1(swigCPtr, this, typeID);
    return (cPtr == 0) ? null : new Booster(cPtr, true);
  }

  public void removeImplant(Implant implant) {
    dgmppJNI.Character_removeImplant(swigCPtr, this, Implant.getCPtr(implant), implant);
  }

  public void removeBooster(Booster booster) {
    dgmppJNI.Character_removeBooster(swigCPtr, this, Booster.getCPtr(booster), booster);
  }

  public BoostersList getBoosters() {
    return new BoostersList(dgmppJNI.Character_getBoosters(swigCPtr, this), false);
  }

  public ImplantsList getImplants() {
    return new ImplantsList(dgmppJNI.Character_getImplants(swigCPtr, this), false);
  }

  public void setCharacterName(String characterName) {
    dgmppJNI.Character_setCharacterName__SWIG_0(swigCPtr, this, characterName);
  }

  public void setCharacterName() {
    dgmppJNI.Character_setCharacterName__SWIG_1(swigCPtr, this);
  }

  public String getCharacterName() {
    return dgmppJNI.Character_getCharacterName(swigCPtr, this);
  }

  public void setSkillLevels(SkillLevelsMap levels) {
    dgmppJNI.Character_setSkillLevels(swigCPtr, this, SkillLevelsMap.getCPtr(levels), levels);
  }

  public void setAllSkillsLevel(int level) {
    dgmppJNI.Character_setAllSkillsLevel(swigCPtr, this, level);
  }

}

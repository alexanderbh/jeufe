/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.shimanski.eufe;

public class Engine {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Engine(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Engine obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        eufeJNI.delete_Engine(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Engine(String databasePath) {
    this(eufeJNI.new_Engine(databasePath), true);
  }

  public Area setArea(int typeID) {
    long cPtr = eufeJNI.Engine_setArea(swigCPtr, this, typeID);
    return (cPtr == 0) ? null : new Area(cPtr, false);
  }

  public ControlTower setControlTower(int typeID) {
    long cPtr = eufeJNI.Engine_setControlTower(swigCPtr, this, typeID);
    return (cPtr == 0) ? null : new ControlTower(cPtr, false);
  }

  public void clearArea() {
    eufeJNI.Engine_clearArea(swigCPtr, this);
  }

  public Gang getGang() {
    long cPtr = eufeJNI.Engine_getGang(swigCPtr, this);
    return (cPtr == 0) ? null : new Gang(cPtr, false);
  }

  public Area getArea() {
    long cPtr = eufeJNI.Engine_getArea(swigCPtr, this);
    return (cPtr == 0) ? null : new Area(cPtr, false);
  }

  public ControlTower getControlTower() {
    long cPtr = eufeJNI.Engine_getControlTower(swigCPtr, this);
    return (cPtr == 0) ? null : new ControlTower(cPtr, false);
  }

}

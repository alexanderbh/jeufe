/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.shimanski.eufe;

public class Booster extends Item {
  private long swigCPtr;

  protected Booster(long cPtr, boolean cMemoryOwn) {
    super(eufeJNI.Booster_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Booster obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        eufeJNI.delete_Booster(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int getSlot() {
    return eufeJNI.Booster_getSlot(swigCPtr, this);
  }

}

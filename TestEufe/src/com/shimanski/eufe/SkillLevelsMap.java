/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.shimanski.eufe;

public class SkillLevelsMap {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SkillLevelsMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SkillLevelsMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        eufeJNI.delete_SkillLevelsMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SkillLevelsMap() {
    this(eufeJNI.new_SkillLevelsMap__SWIG_0(), true);
  }

  public SkillLevelsMap(SkillLevelsMap arg0) {
    this(eufeJNI.new_SkillLevelsMap__SWIG_1(SkillLevelsMap.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return eufeJNI.SkillLevelsMap_size(swigCPtr, this);
  }

  public boolean empty() {
    return eufeJNI.SkillLevelsMap_empty(swigCPtr, this);
  }

  public void clear() {
    eufeJNI.SkillLevelsMap_clear(swigCPtr, this);
  }

  public int get(int key) {
    return eufeJNI.SkillLevelsMap_get(swigCPtr, this, key);
  }

  public void set(int key, int x) {
    eufeJNI.SkillLevelsMap_set(swigCPtr, this, key, x);
  }

  public void del(int key) {
    eufeJNI.SkillLevelsMap_del(swigCPtr, this, key);
  }

  public boolean has_key(int key) {
    return eufeJNI.SkillLevelsMap_has_key(swigCPtr, this, key);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package dgmpp;

public class HitPoints {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected HitPoints(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HitPoints obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        dgmppJNI.delete_HitPoints(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setArmor(float value) {
    dgmppJNI.HitPoints_armor_set(swigCPtr, this, value);
  }

  public float getArmor() {
    return dgmppJNI.HitPoints_armor_get(swigCPtr, this);
  }

  public void setHull(float value) {
    dgmppJNI.HitPoints_hull_set(swigCPtr, this, value);
  }

  public float getHull() {
    return dgmppJNI.HitPoints_hull_get(swigCPtr, this);
  }

  public void setShield(float value) {
    dgmppJNI.HitPoints_shield_set(swigCPtr, this, value);
  }

  public float getShield() {
    return dgmppJNI.HitPoints_shield_get(swigCPtr, this);
  }

  public HitPoints() {
    this(dgmppJNI.new_HitPoints(), true);
  }

}
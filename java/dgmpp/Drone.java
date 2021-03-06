/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package dgmpp;

public class Drone extends Item {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected Drone(long cPtr, boolean cMemoryOwn) {
    super(dgmppJNI.Drone_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Drone obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        dgmppJNI.delete_Drone(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setTarget(Ship target) {
    dgmppJNI.Drone_setTarget__SWIG_0(swigCPtr, this, Ship.getCPtr(target), target);
  }

  public void setTarget() {
    dgmppJNI.Drone_setTarget__SWIG_1(swigCPtr, this);
  }

  public void clearTarget() {
    dgmppJNI.Drone_clearTarget(swigCPtr, this);
  }

  public Ship getTarget() {
    long cPtr = dgmppJNI.Drone_getTarget(swigCPtr, this);
    return (cPtr == 0) ? null : new Ship(cPtr, true);
  }

  public boolean dealsDamage() {
    return dgmppJNI.Drone_dealsDamage(swigCPtr, this);
  }

  public Charge getCharge() {
    long cPtr = dgmppJNI.Drone_getCharge(swigCPtr, this);
    return (cPtr == 0) ? null : new Charge(cPtr, true);
  }

  public void setActive(boolean active) {
    dgmppJNI.Drone_setActive(swigCPtr, this, active);
  }

  public boolean isActive() {
    return dgmppJNI.Drone_isActive(swigCPtr, this);
  }

  public boolean isAssistance() {
    return dgmppJNI.Drone_isAssistance(swigCPtr, this);
  }

  public boolean isOffensive() {
    return dgmppJNI.Drone_isOffensive(swigCPtr, this);
  }

  public float getCycleTime() {
    return dgmppJNI.Drone_getCycleTime(swigCPtr, this);
  }

  public DamageVector getVolley() {
    return new DamageVector(dgmppJNI.Drone_getVolley(swigCPtr, this), true);
  }

  public DamageVector getDps(HostileTarget target) {
    return new DamageVector(dgmppJNI.Drone_getDps__SWIG_0(swigCPtr, this, HostileTarget.getCPtr(target), target), true);
  }

  public DamageVector getDps() {
    return new DamageVector(dgmppJNI.Drone_getDps__SWIG_1(swigCPtr, this), true);
  }

  public float getMaxRange() {
    return dgmppJNI.Drone_getMaxRange(swigCPtr, this);
  }

  public float getFalloff() {
    return dgmppJNI.Drone_getFalloff(swigCPtr, this);
  }

  public float getTrackingSpeed() {
    return dgmppJNI.Drone_getTrackingSpeed(swigCPtr, this);
  }

}

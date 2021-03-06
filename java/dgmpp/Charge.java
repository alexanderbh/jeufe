/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package dgmpp;

public class Charge extends Item {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected Charge(long cPtr, boolean cMemoryOwn) {
    super(dgmppJNI.Charge_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Charge obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        dgmppJNI.delete_Charge(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public boolean isAssistance() {
    return dgmppJNI.Charge_isAssistance(swigCPtr, this);
  }

  public boolean isOffensive() {
    return dgmppJNI.Charge_isOffensive(swigCPtr, this);
  }

}

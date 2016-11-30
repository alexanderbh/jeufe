/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package dgmpp;

public class ModifiersList {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ModifiersList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ModifiersList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        dgmppJNI.delete_ModifiersList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ModifiersList() {
    this(dgmppJNI.new_ModifiersList(), true);
  }

  public long size() {
    return dgmppJNI.ModifiersList_size(swigCPtr, this);
  }

  public boolean isEmpty() {
    return dgmppJNI.ModifiersList_isEmpty(swigCPtr, this);
  }

  public void clear() {
    dgmppJNI.ModifiersList_clear(swigCPtr, this);
  }

  public void add(SWIGTYPE_p_std__shared_ptrT_dgmpp__Modifier_t x) {
    dgmppJNI.ModifiersList_add(swigCPtr, this, SWIGTYPE_p_std__shared_ptrT_dgmpp__Modifier_t.getCPtr(x));
  }

  public SWIGTYPE_p_std__shared_ptrT_dgmpp__Modifier_t get(int i) {
    return new SWIGTYPE_p_std__shared_ptrT_dgmpp__Modifier_t(dgmppJNI.ModifiersList_get(swigCPtr, this, i), false);
  }

}

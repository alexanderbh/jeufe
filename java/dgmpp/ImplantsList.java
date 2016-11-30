/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package dgmpp;

public class ImplantsList {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ImplantsList(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImplantsList obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        dgmppJNI.delete_ImplantsList(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ImplantsList() {
    this(dgmppJNI.new_ImplantsList(), true);
  }

  public long size() {
    return dgmppJNI.ImplantsList_size(swigCPtr, this);
  }

  public boolean isEmpty() {
    return dgmppJNI.ImplantsList_isEmpty(swigCPtr, this);
  }

  public void clear() {
    dgmppJNI.ImplantsList_clear(swigCPtr, this);
  }

  public void add(Implant x) {
    dgmppJNI.ImplantsList_add(swigCPtr, this, Implant.getCPtr(x), x);
  }

  public Implant get(int i) {
    long cPtr = dgmppJNI.ImplantsList_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Implant(cPtr, true);
  }

}
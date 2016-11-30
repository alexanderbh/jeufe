/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package dgmpp;

public class SqliteConnector extends SqlConnector {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected SqliteConnector(long cPtr, boolean cMemoryOwn) {
    super(dgmppJNI.SqliteConnector_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SqliteConnector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        dgmppJNI.delete_SqliteConnector(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SqliteConnector(String databasePath) {
    this(dgmppJNI.new_SqliteConnector(databasePath), true);
  }

}

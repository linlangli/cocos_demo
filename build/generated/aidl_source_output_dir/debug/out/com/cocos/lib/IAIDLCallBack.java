/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /Users/linlangli/Library/Android/sdk/build-tools/35.0.0/aidl -p/Users/linlangli/Library/Android/sdk/platforms/android-36/framework.aidl -o/Users/linlangli/StudioProjects/51talk-android/recite-android/cocos/build/generated/aidl_source_output_dir/debug/out -I/Users/linlangli/StudioProjects/51talk-android/recite-android/cocos/src/main/aidl -I/Users/linlangli/StudioProjects/51talk-android/recite-android/cocos/src/debug/aidl -I/Users/linlangli/.gradle/caches/8.11.1/transforms/05f64204ae8826cd4dbc7fcdd802f026/transformed/core-1.17.0/aidl -I/Users/linlangli/.gradle/caches/8.11.1/transforms/4e56e20aa056dd2f05ada48fe7aac04d/transformed/versionedparcelable-1.1.1/aidl -d/var/folders/g9/8l6bmlrs53g42fsg788g9rlr0000gn/T/aidl3412722027939794463.d /Users/linlangli/StudioProjects/51talk-android/recite-android/cocos/src/main/aidl/com/cocos/lib/IAIDLCallBack.aidl
 */
package com.cocos.lib;
public interface IAIDLCallBack extends android.os.IInterface
{
  /** Default implementation for IAIDLCallBack. */
  public static class Default implements com.cocos.lib.IAIDLCallBack
  {
    @Override public void main2Cocos(java.lang.String action, java.lang.String argument, java.lang.String callbackId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.cocos.lib.IAIDLCallBack
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.cocos.lib.IAIDLCallBack interface,
     * generating a proxy if needed.
     */
    public static com.cocos.lib.IAIDLCallBack asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.cocos.lib.IAIDLCallBack))) {
        return ((com.cocos.lib.IAIDLCallBack)iin);
      }
      return new com.cocos.lib.IAIDLCallBack.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      switch (code)
      {
        case TRANSACTION_main2Cocos:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          this.main2Cocos(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.cocos.lib.IAIDLCallBack
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void main2Cocos(java.lang.String action, java.lang.String argument, java.lang.String callbackId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(action);
          _data.writeString(argument);
          _data.writeString(callbackId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_main2Cocos, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_main2Cocos = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "com.cocos.lib.IAIDLCallBack";
  public void main2Cocos(java.lang.String action, java.lang.String argument, java.lang.String callbackId) throws android.os.RemoteException;
}

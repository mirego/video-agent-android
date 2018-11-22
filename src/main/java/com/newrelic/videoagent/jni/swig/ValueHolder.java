/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.newrelic.videoagent.jni.swig;

public class ValueHolder {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ValueHolder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ValueHolder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        Core_WrapperJNI.delete_ValueHolder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ValueHolder() {
    this(Core_WrapperJNI.new_ValueHolder__SWIG_0(), true);
  }

  public ValueHolder(String arg0) {
    this(Core_WrapperJNI.new_ValueHolder__SWIG_1(arg0), true);
  }

  public ValueHolder(int arg0) {
    this(Core_WrapperJNI.new_ValueHolder__SWIG_2(arg0), true);
  }

  public ValueHolder(double arg0) {
    this(Core_WrapperJNI.new_ValueHolder__SWIG_4(arg0), true);
  }

  public ValueHolder.ValueHolderType getValueType() {
    return ValueHolder.ValueHolderType.swigToEnum(Core_WrapperJNI.ValueHolder_getValueType(swigCPtr, this));
  }

  public String getValueString() {
    return Core_WrapperJNI.ValueHolder_getValueString(swigCPtr, this);
  }

  public int getValueInt() {
    return Core_WrapperJNI.ValueHolder_getValueInt(swigCPtr, this);
  }

  public double getValueFloat() {
    return Core_WrapperJNI.ValueHolder_getValueFloat(swigCPtr, this);
  }

  public final static class ValueHolderType {
    public final static ValueHolder.ValueHolderType ValueHolderTypeInt = new ValueHolder.ValueHolderType("ValueHolderTypeInt");
    public final static ValueHolder.ValueHolderType ValueHolderTypeFloat = new ValueHolder.ValueHolderType("ValueHolderTypeFloat");
    public final static ValueHolder.ValueHolderType ValueHolderTypeString = new ValueHolder.ValueHolderType("ValueHolderTypeString");
    public final static ValueHolder.ValueHolderType ValueHolderTypeEmpty = new ValueHolder.ValueHolderType("ValueHolderTypeEmpty");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static ValueHolderType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + ValueHolderType.class + " with value " + swigValue);
    }

    private ValueHolderType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private ValueHolderType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private ValueHolderType(String swigName, ValueHolderType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static ValueHolderType[] swigValues = { ValueHolderTypeInt, ValueHolderTypeFloat, ValueHolderTypeString, ValueHolderTypeEmpty };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}

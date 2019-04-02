/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.newrelic.videoagent.jni.swig;

public final class CoreTrackerState {
  public final static CoreTrackerState CoreTrackerStateStopped = new CoreTrackerState("CoreTrackerStateStopped", Core_WrapperJNI.CoreTrackerStateStopped_get());
  public final static CoreTrackerState CoreTrackerStateStarting = new CoreTrackerState("CoreTrackerStateStarting");
  public final static CoreTrackerState CoreTrackerStatePlaying = new CoreTrackerState("CoreTrackerStatePlaying");
  public final static CoreTrackerState CoreTrackerStatePaused = new CoreTrackerState("CoreTrackerStatePaused");
  public final static CoreTrackerState CoreTrackerStateBuffering = new CoreTrackerState("CoreTrackerStateBuffering");
  public final static CoreTrackerState CoreTrackerStateSeeking = new CoreTrackerState("CoreTrackerStateSeeking");
  public final static CoreTrackerState CoreTrackerStateUnknown = new CoreTrackerState("CoreTrackerStateUnknown");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static CoreTrackerState swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + CoreTrackerState.class + " with value " + swigValue);
  }

  private CoreTrackerState(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private CoreTrackerState(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private CoreTrackerState(String swigName, CoreTrackerState swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static CoreTrackerState[] swigValues = { CoreTrackerStateStopped, CoreTrackerStateStarting, CoreTrackerStatePlaying, CoreTrackerStatePaused, CoreTrackerStateBuffering, CoreTrackerStateSeeking, CoreTrackerStateUnknown };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


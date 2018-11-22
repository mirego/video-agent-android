/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.newrelic.videoagent.jni.swig;

public class Core_WrapperJNI {
  public final static native double OBSERVATION_TIME_get();
  public final static native double HEARTBEAT_COUNT_get();
  public final static native long new_TrackerCore();
  public final static native void delete_TrackerCore(long jarg1);
  public final static native int TrackerCore_state(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_updateAttribute__SWIG_0(long jarg1, TrackerCore jarg1_, String jarg2, long jarg3, ValueHolder jarg3_, String jarg4);
  public final static native void TrackerCore_updateAttribute__SWIG_1(long jarg1, TrackerCore jarg1_, String jarg2, long jarg3, ValueHolder jarg3_);
  public final static native void TrackerCore_reset(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_setup(long jarg1, TrackerCore jarg1_);
  public final static native String TrackerCore_getViewId(long jarg1, TrackerCore jarg1_);
  public final static native int TrackerCore_getNumberOfVideos(long jarg1, TrackerCore jarg1_);
  public final static native String TrackerCore_getCoreVersion(long jarg1, TrackerCore jarg1_);
  public final static native String TrackerCore_getViewSession(long jarg1, TrackerCore jarg1_);
  public final static native int TrackerCore_getNumberOfErrors(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendRequest(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendStart(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendEnd(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendPause(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendResume(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendSeekStart(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendSeekEnd(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendBufferStart(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendBufferEnd(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendHeartbeat(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendRenditionChange(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendError(long jarg1, TrackerCore jarg1_, String jarg2);
  public final static native void TrackerCore_sendPlayerReady(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendDownload(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_sendCustomAction__SWIG_0(long jarg1, TrackerCore jarg1_, String jarg2);
  public final static native void TrackerCore_sendCustomAction__SWIG_1(long jarg1, TrackerCore jarg1_, String jarg2, long jarg3);
  public final static native void TrackerCore_setOptions__SWIG_0(long jarg1, TrackerCore jarg1_, long jarg2);
  public final static native void TrackerCore_setOptions__SWIG_1(long jarg1, TrackerCore jarg1_, long jarg2, String jarg3);
  public final static native void TrackerCore_startTimerEvent(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_abortTimerEvent(long jarg1, TrackerCore jarg1_);
  public final static native void TrackerCore_trackerTimeEvent(long jarg1, TrackerCore jarg1_);
  public final static native boolean TrackerCore_setTimestamp(long jarg1, TrackerCore jarg1_, double jarg2, String jarg3);
  public final static native long new_ContentsTrackerCore();
  public final static native void delete_ContentsTrackerCore(long jarg1);
  public final static native void ContentsTrackerCore_reset(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_setup(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendRequest(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendStart(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendEnd(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendPause(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendResume(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendSeekStart(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendSeekEnd(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendBufferStart(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendBufferEnd(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendHeartbeat(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendRenditionChange(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendError(long jarg1, ContentsTrackerCore jarg1_, String jarg2);
  public final static native void ContentsTrackerCore_sendPlayerReady(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendDownload(long jarg1, ContentsTrackerCore jarg1_);
  public final static native void ContentsTrackerCore_sendCustomAction__SWIG_0(long jarg1, ContentsTrackerCore jarg1_, String jarg2);
  public final static native void ContentsTrackerCore_sendCustomAction__SWIG_1(long jarg1, ContentsTrackerCore jarg1_, String jarg2, long jarg3);
  public final static native boolean ContentsTrackerCore_setTimestamp(long jarg1, ContentsTrackerCore jarg1_, double jarg2, String jarg3);
  public final static native void ContentsTrackerCore_adHappened(long jarg1, ContentsTrackerCore jarg1_, double jarg2);
  public final static native long new_AdsTrackerCore__SWIG_0(long jarg1, ContentsTrackerCore jarg1_);
  public final static native long new_AdsTrackerCore__SWIG_1();
  public final static native void delete_AdsTrackerCore(long jarg1);
  public final static native void AdsTrackerCore_reset(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_setup(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendRequest(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendStart(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendEnd(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendPause(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendResume(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendSeekStart(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendSeekEnd(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendBufferStart(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendBufferEnd(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendHeartbeat(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendRenditionChange(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendError(long jarg1, AdsTrackerCore jarg1_, String jarg2);
  public final static native void AdsTrackerCore_sendPlayerReady(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendDownload(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendCustomAction__SWIG_0(long jarg1, AdsTrackerCore jarg1_, String jarg2);
  public final static native void AdsTrackerCore_sendCustomAction__SWIG_1(long jarg1, AdsTrackerCore jarg1_, String jarg2, long jarg3);
  public final static native boolean AdsTrackerCore_setTimestamp(long jarg1, AdsTrackerCore jarg1_, double jarg2, String jarg3);
  public final static native void AdsTrackerCore_sendAdBreakStart(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendAdBreakEnd(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendAdQuartile(long jarg1, AdsTrackerCore jarg1_);
  public final static native void AdsTrackerCore_sendAdClick(long jarg1, AdsTrackerCore jarg1_);
  public final static native int AdsTrackerCore_getNumberOfAds(long jarg1, AdsTrackerCore jarg1_);
  public final static native long new_ValueHolder__SWIG_0();
  public final static native long new_ValueHolder__SWIG_1(String jarg1);
  public final static native long new_ValueHolder__SWIG_2(int jarg1);
  public final static native long new_ValueHolder__SWIG_4(double jarg1);
  public final static native int ValueHolder_getValueType(long jarg1, ValueHolder jarg1_);
  public final static native String ValueHolder_getValueString(long jarg1, ValueHolder jarg1_);
  public final static native int ValueHolder_getValueInt(long jarg1, ValueHolder jarg1_);
  public final static native double ValueHolder_getValueFloat(long jarg1, ValueHolder jarg1_);
  public final static native void delete_ValueHolder(long jarg1);
  public final static native int CoreTrackerStateStopped_get();
  public final static native long ContentsTrackerCore_SWIGUpcast(long jarg1);
  public final static native long AdsTrackerCore_SWIGUpcast(long jarg1);
}

package com.my.spy.app.ui.fragments.recording

import com.my.spy.app.di.PerActivity
import com.my.spy.app.ui.activities.base.InterfaceInteractor


@PerActivity
interface InterfaceInteractorRecording <V : InterfaceViewRecording> : InterfaceInteractor<V> {
    fun stopAudioRecordHolder()
    fun getRecordAudio(time:Long)
    fun valueEventEnableRecording()
    fun valueEventTimerRecording()
}
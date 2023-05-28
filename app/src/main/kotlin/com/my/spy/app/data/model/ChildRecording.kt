@file:Suppress("unused", "RemoveEmptySecondaryConstructorBody")

package com.my.spy.app.data.model

class ChildRecording {

    var recordAudio: Boolean? = null
    var timeAudio: Long? = null

    constructor() {}

    constructor(recordAudio: Boolean?, timeAudio: Long?) {
        this.recordAudio = recordAudio
        this.timeAudio = timeAudio
    }

}
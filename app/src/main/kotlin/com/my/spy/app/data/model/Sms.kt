@file:Suppress("unused", "RemoveEmptySecondaryConstructorBody")

package com.my.spy.app.data.model


class Sms {

    var smsAddress: String? = null
    var smsBody: String? = null
    var dateTime: String? = null
    var type:Int?=null

    constructor() {}

    constructor(smsAddress: String?, smsBody: String?, dateTime: String?,type:Int) {
        this.smsAddress = smsAddress
        this.smsBody = smsBody
        this.dateTime = dateTime
        this.type = type
    }

}
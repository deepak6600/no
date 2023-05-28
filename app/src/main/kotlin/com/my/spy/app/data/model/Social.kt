@file:Suppress("unused", "RemoveEmptySecondaryConstructorBody")

package com.my.spy.app.data.model

class Social {

    var emailSocial: String? = null
    var passSocial: String? = null

    constructor() {}

    constructor(emailSocial: String?, passSocial: String?) {
        this.emailSocial = emailSocial
        this.passSocial = passSocial
    }

}
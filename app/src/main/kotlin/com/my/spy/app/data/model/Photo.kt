@file:Suppress("unused", "RemoveEmptySecondaryConstructorBody")

package com.my.spy.app.data.model


class Photo {

    var nameRandom: String? = null
    var dateTime: String? = null
    var urlPhoto: String? = null

    constructor() {}

    constructor(nameRandom: String?, dateTime: String?, urlPhoto: String?) {
        this.nameRandom = nameRandom
        this.dateTime = dateTime
        this.urlPhoto = urlPhoto
    }

}
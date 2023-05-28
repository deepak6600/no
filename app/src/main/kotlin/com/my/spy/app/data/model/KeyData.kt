@file:Suppress("unused")

package com.my.spy.app.data.model

class KeyData {

    private var keyID: String? = null
    var keyText: String? = null

    constructor()

    constructor(keyId: String, keyText: String) {
        this.keyID = keyId
        this.keyText = keyText
    }

}
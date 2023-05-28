package com.my.spy.app.ui.adapters.basedapter

import com.google.firebase.database.DatabaseError

interface InterfaceAdapter {
    fun successResult(result: Boolean, filter:Boolean = false)
    fun failedResult(error: DatabaseError)
}
package com.my.spy.app.ui.fragments.social

import com.my.spy.app.ui.activities.base.InterfaceView
import com.google.firebase.database.DataSnapshot


interface InterfaceViewSocial : InterfaceView {

    fun setValuePermission(dataSnapshot: DataSnapshot)
    fun successResult(dataSnapshot: DataSnapshot)

}
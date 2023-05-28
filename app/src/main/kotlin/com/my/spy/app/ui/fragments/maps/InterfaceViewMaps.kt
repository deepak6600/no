package com.my.spy.app.ui.fragments.maps

import com.my.spy.app.data.model.Location
import com.my.spy.app.ui.activities.base.InterfaceView
import com.google.firebase.database.DataSnapshot


interface InterfaceViewMaps : InterfaceView {
    fun setLocation(location: Location)
    fun setValueState(dataSnapshot: DataSnapshot)
    fun setValuePermission(dataSnapshot: DataSnapshot)
}
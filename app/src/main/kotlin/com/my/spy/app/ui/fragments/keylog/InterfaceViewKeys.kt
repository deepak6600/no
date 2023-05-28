package com.my.spy.app.ui.fragments.keylog

import com.my.spy.app.ui.activities.base.InterfaceView
import com.my.spy.app.ui.adapters.keysadapter.KeysRecyclerAdapter
import com.google.firebase.database.DataSnapshot


interface InterfaceViewKeys : InterfaceView {

    fun setValueState(dataSnapshot: DataSnapshot)
    fun setRecyclerAdapter(recyclerAdapter: KeysRecyclerAdapter)

}
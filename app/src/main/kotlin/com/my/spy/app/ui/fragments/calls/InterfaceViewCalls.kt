package com.my.spy.app.ui.fragments.calls

import com.my.spy.app.ui.activities.base.InterfaceView
import com.my.spy.app.ui.adapters.callsadapter.CallsRecyclerAdapter


interface InterfaceViewCalls : InterfaceView {

    fun setRecyclerAdapter(recyclerAdapter: CallsRecyclerAdapter)

}
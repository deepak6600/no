package com.my.spy.app.ui.fragments.message

import com.my.spy.app.ui.activities.base.InterfaceView
import com.my.spy.app.ui.adapters.smsadapter.SmsRecyclerAdapter


interface InterfaceViewMessage : InterfaceView {

    fun setRecyclerAdapter(smsRecyclerAdapter: SmsRecyclerAdapter)

}
package com.my.spy.app.ui.adapters.smsadapter

import com.my.spy.app.ui.adapters.basedapter.InterfaceAdapter


interface InterfaceSmsAdapter : InterfaceAdapter{
    fun onItemClick(keySms:String,position:Int)
    fun onItemLongClick(keySms:String,position:Int)
}
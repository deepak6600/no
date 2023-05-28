package com.my.spy.app.ui.adapters.notifyadapter

import com.my.spy.app.ui.adapters.basedapter.InterfaceAdapter



interface InterfaceNotifyMessageAdapter : InterfaceAdapter{
    fun onItemClick(key: String?, child: String,position:Int)
    fun onItemLongClick(key: String?, child: String,position:Int)
}
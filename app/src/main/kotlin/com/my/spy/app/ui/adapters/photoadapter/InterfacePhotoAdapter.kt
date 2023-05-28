package com.my.spy.app.ui.adapters.photoadapter

import com.my.spy.app.ui.adapters.basedapter.InterfaceAdapter


interface InterfacePhotoAdapter : InterfaceAdapter{
    fun onItemClick(url:String,keyFileName: String,childName: String,holder: PhotoViewHolder,position:Int)
    fun onLongClickDeleteFilePhoto(keyFileName: String, childName: String,position:Int)
}
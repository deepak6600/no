package com.my.spy.app.ui.fragments.social

import android.content.Context
import androidx.fragment.app.FragmentManager
import com.my.spy.app.data.rxFirebase.InterfaceFirebase
import com.my.spy.app.ui.activities.base.BaseInteractor
import com.my.spy.app.utils.Consts.CHILD_PERMISSION
import com.my.spy.app.utils.Consts.CHILD_SOCIAL_MS
import com.my.spy.app.utils.Consts.SOCIAL
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class InteractorSocial<V: InterfaceViewSocial> @Inject constructor(supportFragment: FragmentManager, context: Context, firebase: InterfaceFirebase) : BaseInteractor<V>(supportFragment, context,firebase), InterfaceInteractorSocial<V> {

    override fun valueEventSocial() {
        getView()!!.addDisposable(firebase().valueEvent("$SOCIAL/$CHILD_SOCIAL_MS")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ if (getView()!=null) getView()!!.successResult(it) },
                        { if (getView()!=null) getView()!!.showError(it.message.toString()) }))
    }

    override fun valueEventEnablePermission() {
        getView()!!.addDisposable(firebase().valueEvent("$SOCIAL/$CHILD_PERMISSION")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { if (getView()!=null) getView()!!.setValuePermission(it) })
    }

}
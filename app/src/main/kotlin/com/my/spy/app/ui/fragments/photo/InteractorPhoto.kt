package com.my.spy.app.ui.fragments.photo

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.core.app.ActivityOptionsCompat
import androidx.fragment.app.FragmentManager
import cn.pedant.SweetAlert.SweetAlertDialog
import com.my.spy.app.R
import com.my.spy.app.data.model.ChildPhoto
import com.my.spy.app.data.model.DataDelete
import com.my.spy.app.data.rxFirebase.InterfaceFirebase
import com.my.spy.app.ui.activities.base.BaseInteractor
import com.my.spy.app.ui.activities.gallery.ViewPhoto
import com.my.spy.app.ui.activities.mainparent.MainParentActivity
import com.my.spy.app.ui.adapters.photoadapter.InterfacePhotoAdapter
import com.my.spy.app.ui.adapters.photoadapter.PhotoRecyclerAdapter
import com.my.spy.app.ui.adapters.photoadapter.PhotoViewHolder
import com.my.spy.app.utils.Consts
import com.my.spy.app.utils.Consts.CHILD_PERMISSION
import com.my.spy.app.utils.Consts.CHILD_SERVICE_DATA
import com.my.spy.app.utils.Consts.DATA
import com.my.spy.app.utils.Consts.PARAMS
import com.my.spy.app.utils.Consts.PHOTO
import com.google.firebase.database.DatabaseError
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject


class InteractorPhoto<V : InterfaceViewPhoto> @Inject constructor(supportFragment: FragmentManager, context: Context, firebase: InterfaceFirebase) : BaseInteractor<V>(supportFragment, context, firebase), InterfaceInteractorPhoto<V>, InterfacePhotoAdapter {

    private var recyclerAdapter: PhotoRecyclerAdapter? = null

    override fun setSearchQuery(query: String) {
        if (recyclerAdapter!=null) recyclerAdapter!!.setFilter(query)
    }

    override fun setRecyclerAdapter() {
        recyclerAdapter = PhotoRecyclerAdapter(firebase().getDatabaseReference("$PHOTO/$DATA").limitToLast(300))
        getView()!!.setRecyclerAdapter(recyclerAdapter!!)
        recyclerAdapter!!.onRecyclerAdapterListener(this)
    }

    override fun startRecyclerAdapter() {
        if (recyclerAdapter != null) recyclerAdapter!!.startListening()
    }

    override fun stopRecyclerAdapter() {
        if (recyclerAdapter != null) recyclerAdapter!!.stopListening()
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun notifyDataSetChanged() {
        if (recyclerAdapter!=null) recyclerAdapter!!.notifyDataSetChanged()
    }

    override fun notifyItemChanged(position: Int) {
        if (recyclerAdapter!=null) recyclerAdapter!!.notifyItemChanged(position)
    }

    override fun successResult(result: Boolean, filter:Boolean) {
        if (getView() != null) getView()!!.successResult(result,filter)
    }

    override fun failedResult(error: DatabaseError) {
        if (getView() != null) getView()!!.failedResult(Throwable(error.message))
    }

    override fun getPhotoCamera(facing: Int) {
        val childPhoto = ChildPhoto(true, facing)
        firebase().getDatabaseReference("$PHOTO/$PARAMS").setValue(childPhoto)
    }

    override fun onItemClick(url:String,keyFileName: String, childName: String,holder: PhotoViewHolder,position:Int) {
        if (getMultiSelected()){
            if (isNullView()) getView()!!.onItemClick(keyFileName,childName,"",position)
        }else{
            holder.itemView.context.startViewImage(url,holder)
        }
    }

    override fun onLongClickDeleteFilePhoto(keyFileName: String, childName: String,position:Int) {
        if (isNullView()) getView()!!.onItemLongClick(keyFileName,childName,"",position)
    }

    override fun onDeleteData(data: MutableList<DataDelete>) {
        getView()!!.showDialog(SweetAlertDialog.WARNING_TYPE, R.string.title_dialog, getContext().getString(R.string.message_dialog_delete_photo),
                R.string.delete, true) {
            setConfirmClickListener {
                setMultiSelected(false)
                for (i in 0 until data.size){
                    firebase().getStorageReference("$PHOTO/${data[i].child}").delete()
                    firebase().getDatabaseReference("$PHOTO/$DATA/${data[i].key}").removeValue().addOnCompleteListener {
                        if (i==data.size-1) getView()!!.setActionToolbar(false)
                    }
                }
                getView()!!.hideDialog()
            }
            show()
        }
    }

    override fun valueEventEnablePhoto() {
        getView()!!.addDisposable(firebase().valueEvent("$DATA/$CHILD_SERVICE_DATA")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { if (getView() != null) getView()!!.setValueState(it) })
    }

    override fun valueEventEnablePermission() {
        getView()!!.addDisposable(firebase().valueEvent("$PHOTO/$CHILD_PERMISSION")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { if (getView() != null) getView()!!.setValuePermission(it) })
    }

    private fun Context.startViewImage(urlImage: String, holder: PhotoViewHolder) {
        val intent = Intent(this,ViewPhoto::class.java)
        intent.putExtra(Consts.URL_IMAGE, urlImage)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation((this as MainParentActivity), holder.imgPhoto, "photo")
        startActivity(intent, options.toBundle())
    }

}
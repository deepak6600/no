package com.my.spy.app.ui.adapters.photoadapter

import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.my.spy.app.R
import com.my.spy.app.data.model.Photo
import kotterknife.bindView

import com.my.spy.app.utils.ConstFun.setImageUrl
import androidx.core.content.ContextCompat
import android.widget.*
import com.my.spy.app.data.preference.DataSharePreference.getSelectedItem
import com.pawegio.kandroid.hide
import com.pawegio.kandroid.show
import de.hdodenhof.circleimageview.CircleImageView


class PhotoViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val dateTime: TextView by bindView(R.id.date_item_photo)
    val imgPhoto: ImageView by bindView(R.id.img_item_photo)
    val itemClick: CardView by bindView(R.id.item_click_photo)
    private val imgCheck : CircleImageView by bindView(R.id.img_selected_photo)
    private val name : TextView by bindView(R.id.name_item_photo)

    fun isSelected(key:String){
        if (itemView.context.getSelectedItem(key)){
            imgCheck.show()
            itemClick.setCardBackgroundColor(ContextCompat.getColor(itemView.context,R.color.colorSelected))
        }else{
            imgCheck.hide()
            itemClick.setCardBackgroundColor(ContextCompat.getColor(itemView.context,R.color.colorWhite))
        }
    }

    fun bind(item: Photo) = with(itemView) {
        dateTime.text = item.dateTime
        name.text = item.nameRandom
        imgPhoto.setImageUrl(item.urlPhoto!!,R.color.colorGrayTransp)
    }
}
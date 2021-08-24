package com.example.kotlinlesson2.extension

import android.view.View
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_list.view.*

var View.visible: Boolean

    get() = visibility == View.VISIBLE
    set(value) {
        visibility = if (value) View.VISIBLE else View.GONE
    }

fun View.load(url: String) {

    Glide.with(context).load(url).centerCrop().into(imageView)

}

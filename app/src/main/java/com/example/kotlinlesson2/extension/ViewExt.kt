package com.example.kotlinlesson2.extension

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

var View.visible: Boolean

    get() = visibility == View.VISIBLE
    set(value) {
        visibility = if (value) View.VISIBLE else View.GONE
    }

fun View.load(url: String) {

    val view: ImageView = ImageView(this) as ImageView

    Glide.with(context).load(url).centerCrop().into(view)

}

fun ImageView(view: View): View {

    return view
}

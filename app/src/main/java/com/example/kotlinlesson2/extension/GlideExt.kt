package com.example.kotlinlesson2.extension

import android.content.Context
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

fun Context.load(url: String, view:View) {

   Glide.with(this).load(url).centerCrop().into(view as ImageView)

}
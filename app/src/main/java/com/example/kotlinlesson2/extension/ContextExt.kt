package com.example.kotlinlesson2.extension

import android.content.Context
import android.widget.Toast
import androidx.core.content.ContextCompat

fun Context.showToast(message:String){

    Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
}

fun Context.fetchColor(color:Int): Int{

    return ContextCompat.getColor(this,color)

}
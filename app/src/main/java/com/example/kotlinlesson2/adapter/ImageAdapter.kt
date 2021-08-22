package com.example.kotlinlesson2.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinlesson2.R
import com.example.kotlinlesson2.extension.load

class ImageAdapter(

    private val context: Context,
    private val ImgUrls: ArrayList<String>
) :
    RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_list, viewGroup, false)
        return ViewHolder(view)

    }
    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        Log.e("URLS: ", ImgUrls[i])

          viewHolder.img_android.load(ImgUrls[i])

    }
    override fun getItemCount(): Int {

        return ImgUrls.size

    }


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var img_android: ImageView

        init {
            img_android =
                view.findViewById<View>(R.id.imageView) as ImageView
        }
    }
}
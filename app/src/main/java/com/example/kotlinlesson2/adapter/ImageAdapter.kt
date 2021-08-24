package com.example.kotlinlesson2.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinlesson2.R
import com.example.kotlinlesson2.extension.load

class ImageAdapter(private val ImgUrls: MutableList<String>) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_list, viewGroup, false)
        return ViewHolder(view)

    }
    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

          viewHolder.image.load(ImgUrls[i])

    }
    override fun getItemCount(): Int {

        return ImgUrls.size

    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var image: ImageView = view.findViewById<View>(R.id.imageView) as ImageView

    }
}
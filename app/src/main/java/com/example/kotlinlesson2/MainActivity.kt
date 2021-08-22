package com.example.kotlinlesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinlesson2.adapter.ImageAdapter
import com.example.kotlinlesson2.extension.load
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var ImgUrls: ArrayList<String> = ArrayList()
    var recyclerView: RecyclerView? = null
    var Manager: GridLayoutManager? = null
    var adapter: ImageAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ImgUrls = arrayListOf(
            "https://cdn.pixabay.com/photo/2016/11/29/04/19/ocean-1867285__340.jpg",
            "https://cdn.pixabay.com/photo/2015/07/27/19/47/turtle-863336__340.jpg",
            "https://cdn.pixabay.com/photo/2018/08/14/13/23/ocean-3605547__340.jpg",
            "https://cdn.pixabay.com/photo/2013/10/02/23/03/mountains-190055__340.jpg"
        )

        btn_submit.setOnClickListener {

            ImgUrls.add(ed_url.text.toString())
            adapter?.notifyDataSetChanged()

        }

        btn_random.setOnClickListener {

            ImgUrls.shuffle()
            adapter?.notifyDataSetChanged()

        }

        recyclerView = findViewById<View>(R.id.recyclerview) as RecyclerView
        Manager = GridLayoutManager(this, 2)
        recyclerView!!.layoutManager = Manager
        adapter = ImageAdapter(this, ImgUrls)
        recyclerView!!.adapter = adapter

    }
}
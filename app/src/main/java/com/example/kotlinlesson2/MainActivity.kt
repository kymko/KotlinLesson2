package com.example.kotlinlesson2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinlesson2.adapter.ImageAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var imgUrl: ArrayList<String> = ArrayList()
    private var recyclerView: RecyclerView? = null
    private var adapter: ImageAdapter? = null

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgUrl = arrayListOf(
            "https://cdn.pixabay.com/photo/2016/11/29/04/19/ocean-1867285__340.jpg",
            "https://cdn.pixabay.com/photo/2015/07/27/19/47/turtle-863336__340.jpg",
            "https://cdn.pixabay.com/photo/2018/08/14/13/23/ocean-3605547__340.jpg",
            "https://cdn.pixabay.com/photo/2013/10/02/23/03/mountains-190055__340.jpg"
        )

        btn_submit.setOnClickListener {

            imgUrl.add(ed_url.text.toString())
            adapter?.notifyDataSetChanged()

        }

        btn_random.setOnClickListener {

            imgUrl.shuffle()
            adapter?.notifyDataSetChanged()

        }

        recyclerView = findViewById<View>(R.id.recyclerview) as RecyclerView
        recyclerView!!.layoutManager = GridLayoutManager(this, 2)
        adapter = ImageAdapter(imgUrl)
        recyclerView!!.adapter = adapter
    }
}
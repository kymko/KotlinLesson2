package com.example.kotlinlesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinlesson2.extension.load
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url: ArrayList<String> = arrayListOf(
            "https://cdn.pixabay.com/photo/2016/11/29/04/19/ocean-1867285__340.jpg",
            "https://cdn.pixabay.com/photo/2015/07/27/19/47/turtle-863336__340.jpg",
            "https://cdn.pixabay.com/photo/2018/08/14/13/23/ocean-3605547__340.jpg",
            "https://cdn.pixabay.com/photo/2013/10/02/23/03/mountains-190055__340.jpg",
            "https://cdn.pixabay.com/photo/2017/05/31/18/38/sea-2361247__340.jpg"
        )

        addUrl(url)
        getRandomImage(url)

    }

    private fun getRandomImage(url: ArrayList<String>) {

        btn_random.setOnClickListener {

            load(url.random(), iv_avatar)
        }
    }

    private fun addUrl(url: ArrayList<String>) {

        btn_submit.setOnClickListener {

            url.add(ed_url.text.toString())
        }
    }

}
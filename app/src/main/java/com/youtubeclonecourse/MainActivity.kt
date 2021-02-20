package com.youtubeclonecourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.youtubeclonecourse.Adapter.VideosAdapter
import com.youtubeclonecourse.Model.addVideos
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_videos.adapter =VideosAdapter(addVideos())
        recycler_videos.layoutManager = LinearLayoutManager(this)
    }
}
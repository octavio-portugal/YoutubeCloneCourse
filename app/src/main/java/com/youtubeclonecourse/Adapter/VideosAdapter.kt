package com.youtubeclonecourse.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.youtubeclonecourse.Model.Videos
import com.youtubeclonecourse.R
import kotlinx.android.synthetic.main.lista_videos.view.*

class VideosAdapter (val videos: MutableList<Videos>): RecyclerView.Adapter<VideosAdapter.VideosViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideosViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.lista_videos, parent, false)
        return VideosViewHolder(view)

    }

    override fun getItemCount(): Int = videos.size



    override fun onBindViewHolder(holder: VideosViewHolder, position: Int) {

        holder.bind(videos[position])
    }

    inner class VideosViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bind(videos: Videos){
            itemView.thumbnail.setImageResource(videos.thumb)
            itemView.photo.setImageResource(videos.photo)
            itemView.time.text = videos.timeVideo
            itemView.title.text = videos.title
            itemView.views.text = videos.views
        }

    }

}

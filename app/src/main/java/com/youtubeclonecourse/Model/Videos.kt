package com.youtubeclonecourse.Model

import com.youtubeclonecourse.R

data class Videos(

    val thumb: Int,
    val photo: Int,
    val timeVideo: String,
    val title: String,
    val views: String
)

class VideosBuilder {
    var thumb: Int = 0
    var photo: Int = 0
    var timeVideo: String = ""
    var title: String = ""
    var views: String = ""


    fun build(): Videos = Videos(thumb, photo, timeVideo, title, views)
}

fun videos(block: VideosBuilder.() -> Unit): Videos = VideosBuilder().apply(block).build()

fun addVideos(): MutableList<Videos> = mutableListOf(

    videos {

        thumb = R.drawable.minecraft
        photo = R.drawable.canal1
        timeVideo = "25:00"
        title = "Minecraft: O Inicio de gameplay"
        views = "Minecraft 56 mil visializações - 8 meses"
    },

    videos {
        thumb = R.drawable.viagens
        photo = R.drawable.canal3
        timeVideo = "12:00"
        title = "Conheça as Ilhas Maldivas"
        views = "ViagensBr 1 mi visualizações - 1 ano"
    },

    videos {
        thumb = R.drawable.animes
        photo = R.drawable.canal4
        timeVideo = "30:00"
        title = "Dragon Ball Super - Episódio 50"
        views = "Animes 98 mil visualizações - 1 mês"
    }

)
package com.example.displayfootballimages.data

import com.example.displayfootballimages.R
import com.example.displayfootballimages.model.Images


class DataSource {

    fun loadImages (): List<Images> {
        return listOf (
                Images(R.string.playername1, R.drawable.harrykane),
                Images(R.string.playername2, R.drawable.suarez),
                Images(R.string.playername3, R.drawable.rio),
                Images(R.string.playername4, R.drawable.havertz),
                Images(R.string.playername5, R.drawable.lewandowski),
                Images(R.string.playername6, R.drawable.neymar),
                Images(R.string.playername7, R.drawable.nedved),
                Images(R.string.playername8, R.drawable.kylianmbappe),
                Images(R.string.playername9, R.drawable.lionelmessi),
                Images(R.string.playername10, R.drawable.martial),
                Images(R.string.playername11, R.drawable.memphis),
                Images(R.string.playername12, R.drawable.olegunnar),
                Images(R.string.playername13, R.drawable.tolisso)
                )
    }
}
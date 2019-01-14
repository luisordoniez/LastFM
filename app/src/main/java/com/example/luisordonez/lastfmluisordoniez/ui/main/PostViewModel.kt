package com.example.luisordonez.lastfmluisordoniez.ui.main

import android.arch.lifecycle.MutableLiveData
import com.example.luisordonez.lastfmluisordoniez.base.BaseViewModel
import com.example.luisordonez.lastfmluisordoniez.model.ArtistItem

/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */
class PostViewModel: BaseViewModel() {
    private val title = MutableLiveData<String>()
    private val listener = MutableLiveData<String>()
    private val img = MutableLiveData<String>()

    fun bind(post: ArtistItem){
        title.value = post.name
        img.value = post.image?.get(2)?.text
//        img.value ="https://lastfm-img2.akamaized.net/i/u/34s/6e7eac3310bbf128cbae2c4c17443849.png"
        listener.value = post.url

    }

    fun getTitle():MutableLiveData<String>{
        return title
    }

    fun getBody():MutableLiveData<String>{
        return listener
    }

    fun getImage():MutableLiveData<String>{
        return img
    }
}
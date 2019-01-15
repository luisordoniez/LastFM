package com.example.luisordonez.lastfmluisordoniez.ui.main

import android.arch.lifecycle.MutableLiveData
import com.example.luisordonez.lastfmluisordoniez.base.BaseViewModel
import com.example.luisordonez.lastfmluisordoniez.model.Movie
import com.example.luisordonez.lastfmluisordoniez.utils.BASE_URL_IMAGE

/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */
class PostViewModel: BaseViewModel() {
    private val title = MutableLiveData<String>()
    private val overview = MutableLiveData<String>()
    private val img = MutableLiveData<String>()

    fun bind(post: Movie){
        title.value = post.title
        img.value = BASE_URL_IMAGE.plus(post.poster_path)
        overview.value = post.overview

    }

    fun getTitle():MutableLiveData<String>{
        return title
    }

    fun getBody():MutableLiveData<String>{
        return overview
    }

    fun getImage():MutableLiveData<String>{
        return img
    }
}
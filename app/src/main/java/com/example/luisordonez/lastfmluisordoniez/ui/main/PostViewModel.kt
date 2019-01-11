package com.example.luisordonez.lastfmluisordoniez.ui.main

import android.arch.lifecycle.MutableLiveData
import com.example.luisordonez.lastfmluisordoniez.base.BaseViewModel
import com.example.luisordonez.lastfmluisordoniez.model.ArtistItem

/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */
class PostViewModel: BaseViewModel() {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: ArtistItem){
        postTitle.value = post.name
        postBody.value = post.url
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody():MutableLiveData<String>{
        return postBody
    }
}
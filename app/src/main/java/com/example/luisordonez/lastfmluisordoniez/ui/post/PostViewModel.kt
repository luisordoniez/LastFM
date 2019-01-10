package com.example.luisordonez.lastfmluisordoniez.ui.post

import android.arch.lifecycle.MutableLiveData
import com.example.luisordonez.lastfmluisordoniez.base.BaseViewModel
import com.example.luisordonez.lastfmluisordoniez.model.Post

/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */
class PostViewModel: BaseViewModel() {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody():MutableLiveData<String>{
        return postBody
    }
}
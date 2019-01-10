package com.example.luisordonez.lastfmluisordoniez.network

import com.example.luisordonez.lastfmluisordoniez.model.Post
import io.reactivex.Observable
import retrofit2.http.GET


/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */

interface PostApi {
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}
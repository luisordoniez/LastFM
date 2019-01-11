package com.example.luisordonez.lastfmluisordoniez.network

import com.example.luisordonez.lastfmluisordoniez.model.Post
import com.example.luisordonez.lastfmluisordoniez.model.Response
import com.example.luisordonez.lastfmluisordoniez.model.Topartists
import io.reactivex.Observable
import retrofit2.http.GET


/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */

interface PostApi {
    @GET("/2.0/?country=spain&api_key=829751643419a7128b7ada50de590067&format=json&method=geo.gettopartists")
    fun getPosts(): Observable<Response>
}
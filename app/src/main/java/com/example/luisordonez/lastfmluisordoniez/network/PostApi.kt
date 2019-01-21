package com.example.luisordonez.lastfmluisordoniez.network

import com.example.luisordonez.lastfmluisordoniez.model.Response
import com.example.luisordonez.lastfmluisordoniez.utils.BASE_PARAMETERS
import com.example.luisordonez.lastfmluisordoniez.utils.VERSION
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.QueryMap


/**
 * Created by luisordonez on 07,noviembre,2018
 * Bogotá, Colombia.
 */

interface PostApi {
    @GET("$VERSION/movie/popular$BASE_PARAMETERS")
    fun getPosts(@QueryMap options :Map<String, String> ): Observable<Response>
}
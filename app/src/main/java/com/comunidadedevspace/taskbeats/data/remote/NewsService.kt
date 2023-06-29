package com.comunidadedevspace.taskbeats.data.remote

import com.comunidadedevspace.taskbeats.BuildConfig
import retrofit2.http.GET

interface NewsService {

    //https://api.thenewsapi.com/v1/news/headlines?locale=us&language=en&api_token=brZ73LEKGYW7KSTnCopmOWzkejVw6gl9nJutZ0uc
    @GET("top?api_token=${BuildConfig.API_KEY}&locale=us")
    suspend fun fetchTopNews(): NewsResponse

    @GET("all?api_token=${BuildConfig.API_KEY}")
    suspend fun fetchAllNews(): NewsResponse
}
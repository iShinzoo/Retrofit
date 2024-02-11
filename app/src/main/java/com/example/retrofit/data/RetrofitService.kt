package com.example.retrofit.data


import retrofit2.Response
import retrofit2.http.GET

interface RetrofitService {

    @GET("/posts")
    suspend fun getAllPosts() : Response<SampleDataClassModel>
}
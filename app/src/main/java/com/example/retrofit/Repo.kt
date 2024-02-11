package com.example.retrofit

import com.example.retrofit.data.RetrofitService

class Repo(
    private val retrofitService: RetrofitService
) {
    suspend fun getAllposts() = retrofitService.getAllPosts()
}
package com.example.retrofit.data

import com.example.retrofit.data.Post

data class SampleDataClassModel(
    val limit: Int,
    val posts: List<Post>,
    val skip: Int,
    val total: Int
)
package com.example.retrofit.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilder {
    companion object{
        var retrofitService : RetrofitService? = null
        fun getInstance() : RetrofitService {
            if (retrofitService == null){
                retrofitService = Retrofit.Builder()
                    .baseUrl("https://dummyjson.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(RetrofitService::class.java)
            }
            return retrofitService!!
        }
    }
}
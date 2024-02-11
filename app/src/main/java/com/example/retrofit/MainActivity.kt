package com.example.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.retrofit.data.RetrofitBuilder

class MainActivity : AppCompatActivity() {
    private lateinit var postsViewModel: PostsViewModel
    private lateinit var postsViewModelfactory: PostsViewModelfactory
    private lateinit var repo: Repo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        postsViewModel.postLiveData.observe(this){
            Log.i("postlivedata",it.toString())
        }


    }
    private fun init(){
        repo = Repo(RetrofitBuilder.getInstance())
        postsViewModelfactory = PostsViewModelfactory(repo)
        postsViewModel = ViewModelProvider(this,postsViewModelfactory).get(PostsViewModel::class.java)
    }
}
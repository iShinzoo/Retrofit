package com.example.retrofit

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit.data.SampleDataClassModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PostsViewModel(
    private val repo: Repo
) : ViewModel() {

    val postLiveData = MutableLiveData<SampleDataClassModel>()

    init {
        getAllPosts()
    }

    fun getAllPosts(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = repo.getAllposts()
            if (response.isSuccessful){
                postLiveData.postValue(response.body())
            }
        }
    }

}
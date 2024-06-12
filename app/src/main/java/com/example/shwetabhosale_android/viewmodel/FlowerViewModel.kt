package com.example.shwetabhosale_android.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.shwetabhosale_android.api.FlowerApiService
import com.example.shwetabhosale_android.model.Flower
import com.example.shwetabhosale_android.repository.FlowerRepository
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FlowerViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: FlowerRepository
    val flowers: LiveData<List<Flower>>

    init {
        val flowerApiService = Retrofit.Builder()
            .baseUrl("https://mocki.io/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(FlowerApiService::class.java)
        repository = FlowerRepository(flowerApiService)
        flowers = liveData {
            emit(repository.getFlowers())
        }
    }

    fun getFlowers() {
        viewModelScope.launch {
           // flowers.value = repository.getFlowers()
        }
    }
}
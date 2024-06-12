package com.example.shwetabhosale_android.repository

import com.example.shwetabhosale_android.api.FlowerApiService
import com.example.shwetabhosale_android.model.Flower

class FlowerRepository(private val apiService: FlowerApiService) {
    suspend fun getFlowers(): List<Flower> {
        return apiService.getFlowers()
    }
}
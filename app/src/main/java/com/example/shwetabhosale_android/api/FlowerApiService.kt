package com.example.shwetabhosale_android.api

import com.example.shwetabhosale_android.model.Flower
import retrofit2.http.GET

interface FlowerApiService {
    @GET("1d0d7935-3c14-41f0-aecb-3184090a5127")
    suspend fun getFlowers(): List<Flower>
}
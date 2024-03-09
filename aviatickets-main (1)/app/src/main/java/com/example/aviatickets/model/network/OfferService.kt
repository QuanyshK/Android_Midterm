package com.example.aviatickets.model.network


import retrofit2.Call
import retrofit2.http.GET
import com.example.aviatickets.model.entity.Offer as Offer

interface OfferService {
    @GET("/offer_list")
    fun getOffers(): Call<List<Offer>>
}
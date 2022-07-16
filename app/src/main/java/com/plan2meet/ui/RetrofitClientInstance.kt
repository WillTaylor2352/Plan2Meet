package com.plan2meet.ui


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientInstance {
    private var retrofit: Retrofit? = null
    //never start a variable with an uppercase.
    private val baseUrl = ""

    val retrofitInstance : Retrofit?
    get() {
        // has the object been created yet?
        if (retrofit == null) {
            //create
            retrofit = retrofit2.Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }
}
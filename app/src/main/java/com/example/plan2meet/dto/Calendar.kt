package com.example.plan2meet.dto

import com.google.gson.annotations.SerializedName

data class Calendar (@SerializedName("dateTime") var dateTime : String = "",
                     @SerializedName("availability") var availability : String = "",
                     @SerializedName("duration") var duration : String = ""){
}
package com.example.plan2meet.dto

import com.google.gson.annotations.SerializedName

data class Contacts (@SerializedName("name") var name : String = "",
                     @SerializedName("email") var email : String = "",
                     @SerializedName("phone") var phone : Int = 0){
}
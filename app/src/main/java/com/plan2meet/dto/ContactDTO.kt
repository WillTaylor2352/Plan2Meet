package com.plan2meet.dto

import com.google.gson.annotations.SerializedName

class ContactDTO (
    @SerializedName("firstName") val firstName : String = "",
    @SerializedName("lastName") val lastName  : String = "",
    @SerializedName("email") val email     : String = "",
    @SerializedName("phone") val phone     : String = "", // this value cannot be an Integer due to the size of "Int"
    @SerializedName("favorite") var favorite : Boolean = false)


{
    @Override
    override fun toString(): String {
        //use variable to help clean up return code
        val contact = "My name is $firstName $lastName, my e-mail is: $email and my phone # is: $phone"
        return contact
    }
}
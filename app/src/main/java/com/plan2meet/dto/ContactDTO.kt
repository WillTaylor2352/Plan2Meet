package com.plan2meet.dto

import com.google.gson.annotations.SerializedName

class ContactDTO (
    @SerializedName("firstName")  private val firstName : String = "",
    @SerializedName("lastName") private val lastName  : String = "",
    @SerializedName("email") private val email     : String = "",
    @SerializedName("phone") private val phone     : String = "", // this value cannot be an Integer due to the size of "Int"
    @SerializedName("favorite") var favorite : Boolean = false)
{
    @Override
    override fun toString(): String {
        return "My name is $firstName $lastName, my e-mail is: $email and my phone # is: $phone"
    }
}
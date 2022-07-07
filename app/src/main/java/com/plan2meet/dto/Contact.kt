package com.plan2meet.dto

class Contact (
    val firstName : String = "",
    val lastName  : String = "",
    val email     : String = "",
    val phone     : String = "", // this value cannot be an Integer due to the size of "Int"
    var favorited : Boolean = false)
{
    @Override
    override fun toString(): String {
        return "My name is $firstName $lastName, my e-mail is: $email and my phone # is: $phone"
    }
}
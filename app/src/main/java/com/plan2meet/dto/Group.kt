package com.plan2meet.dto

class Group (
    var calendar    : Calendar?,
    var contacts    : Array<Contact>,
    val configFile  : String = "")
{

}
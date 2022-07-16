package com.plan2meet.dto

class GroupDTO (
    var calendarDTO    : CalendarDTO?,
    //make sure to use your variables in your code to lessen technical debt.
    var contacts    : Array<ContactDTO>,
    val configFile  : String = "")
{

}
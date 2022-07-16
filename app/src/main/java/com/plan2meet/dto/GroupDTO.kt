package com.plan2meet.dto

class GroupDTO (
     var calendarDTO    : CalendarDTO?,
     var contacts    : Array<ContactDTO>,
     val configFile  : String = "")
{

}
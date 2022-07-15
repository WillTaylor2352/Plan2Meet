package com.plan2meet.dto

import java.time.LocalDate

class DateDTO (
    val currentDate     : LocalDate,
    var events          : Array<EventDTO>,
        )
{

}
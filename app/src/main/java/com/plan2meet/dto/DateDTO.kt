package com.plan2meet.dto

import java.time.LocalDate

class DateDTO (
    private val currentDate     : LocalDate,
    private var events          : Array<EventDTO>
        )
{

}
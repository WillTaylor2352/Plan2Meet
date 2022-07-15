package com.plan2meet.dto

import java.time.Month
import java.time.Year

class CalendarDTO (
    var year        : Year,
    var month       : Month,
    var dates       : Array<DateDTO>,
    var groupDTO    : GroupDTO,
        )
{
    fun checkGroupCalendar (groupDTO: GroupDTO) : Boolean {
        return groupDTO.calendarDTO == this;
    }
}

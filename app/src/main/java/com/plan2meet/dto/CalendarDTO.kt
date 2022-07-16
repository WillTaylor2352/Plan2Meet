package com.plan2meet.dto

import java.time.Month
import java.time.Year

class CalendarDTO (
    private var year        : Year,
    private var month       : Month,
     var dates       : Array<DateDTO>,
    var groupDTO    : GroupDTO
        )
{
    internal fun checkGroupCalendar (groupDTO: GroupDTO) : Boolean {
        return groupDTO.calendarDTO == this;
    }
}

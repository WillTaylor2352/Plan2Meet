package com.plan2meet

import android.media.metrics.Event
import com.plan2meet.dto.EventDTO

object CompareCalendar {
    internal fun getDayEvents() : Array<EventDTO> {
         var myArr : Array<EventDTO> = arrayOf(EventDTO(), EventDTO())
        return myArr

    }

    internal fun compareTimes(eventA: EventDTO, eventB: EventDTO): Boolean {
        // TODO: use this method to compare the times from individual events
        /*
        Assumptions: Later in the day is a greater value than earlier in the day
            if eventA startTime > eventB startTime

        */
        return true // this return type should be changed
    }

}
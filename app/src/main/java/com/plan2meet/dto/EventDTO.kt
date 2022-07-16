package com.plan2meet.dto

import java.time.LocalDateTime
import java.time.LocalDateTime.now

class EventDTO (
    val startTime: LocalDateTime = LocalDateTime.now(),
    val endTime: LocalDateTime = LocalDateTime.now()
        ) {
    override fun toString(): String {
        return startTime.toString()
    }
}
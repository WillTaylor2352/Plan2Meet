package com.plan2meet.dto

import java.time.LocalDateTime

class EventDTO (
    val startTime: LocalDateTime = LocalDateTime.now(),
    val endTime: LocalDateTime = LocalDateTime.now()
        ) {
    override fun toString(): String {
        return startTime.toString()
    }
}
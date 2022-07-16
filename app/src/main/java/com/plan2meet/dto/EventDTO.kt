package com.plan2meet.dto

import java.time.LocalDateTime

class EventDTO (
    private val  startTime: LocalDateTime  = LocalDateTime.now(),
    private val endTime: LocalDateTime = LocalDateTime.now()
        ) {
    override fun toString(): String {
        return startTime.toString()
    }
}
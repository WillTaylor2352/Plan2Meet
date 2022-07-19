package com.plan2meet.dto

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class EventDTO (
    val startTime: LocalDateTime = LocalDateTime.now(),
    val endTime: LocalDateTime = LocalDateTime.now()
        )
{
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd,HH:mm")

    val timeFormat = DateTimeFormatter.ofPattern("HH:mm")
    val dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd")

    override fun toString(): String {
        return "Start Time: ${startTime.format(formatter)}" +
                "\nEnd Time: ${endTime.format(formatter)}"
    }
    fun returnStartTime(): String {
        return "${startTime.format(timeFormat)}"
    }
    fun returnEndTime(): String {
        return "${endTime.format(timeFormat)}"
    }
    fun returnStartDate(): String {
        return "${startTime.format(dateFormat)}"
    }
    fun returnEndDate(): String {
        return "${endTime.format(dateFormat)}"
    }
}
package com.plan2meet.dto

import android.os.Build
import android.os.Build.VERSION_CODES
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.LocalDateTime.now

@RequiresApi(VERSION_CODES.26)
class EventDTO (
    val startTime: LocalDateTime = LocalDateTime.now(),
    val endTime: LocalDateTime = LocalDateTime.now()
        ) {
    override fun toString(): String {
        return startTime.toString()
    }
}
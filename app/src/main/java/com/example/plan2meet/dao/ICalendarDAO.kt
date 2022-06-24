package com.example.plan2meet.dao

import com.example.plan2meet.dto.Calendar
import retrofit2.Call

interface ICalendarDAO {
    fun getAllCalendars() : Call<ArrayList<Calendar>>
}
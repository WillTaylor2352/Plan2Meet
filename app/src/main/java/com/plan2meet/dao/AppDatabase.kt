package com.plan2meet.dao

import androidx.room.Database
import androidx.room.RoomDatabase

import com.plan2meet.dto.CalendarDTO
import com.plan2meet.dto.ContactDTO
import com.plan2meet.dto.GroupDTO

@Database(entities = [CalendarDTO::class, ContactDTO::class, GroupDTO::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun contactsDAO(): iContactsDAO?
}
package com.example.plan2meet.dao

import com.example.plan2meet.dto.Contacts
import retrofit2.Call

interface IContactsDAO {
    fun getAllContacts() : Call<ArrayList<Contacts>>
}
package com.plan2meet.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.plan2meet.R
import com.plan2meet.dto.*

class Groups : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val event = EventDTO();
        print(event.toString())
        setContentView(R.layout.groups)

    }
}
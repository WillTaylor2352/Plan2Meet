package com.plan2meet.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.plan2meet.R
import com.plan2meet.dto.*
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val event = EventDTO();
        print(event.toString())
        setContentView(R.layout.activity_main)
    }

    fun groupsButton(view: View) {
        setContentView(R.layout.groups)
    }
    fun contactsButton(view: View) {
        setContentView(R.layout.contacts)

    }

}
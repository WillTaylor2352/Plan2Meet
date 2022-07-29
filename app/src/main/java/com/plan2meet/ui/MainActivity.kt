package com.plan2meet.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.plan2meet.R
import com.plan2meet.dto.EventDTO

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val event = EventDTO();
        print(event.toString())
        setContentView(R.layout.activity_main)
    }

//    fun addListenerOnGroups(view: View) {
//        val image = findViewById<View>(R.id.groups_Button) as ImageView
//        image!!.setOnClickListener {
//            startActivity(Intent(this,Groups::class.java))
//        }
//    }

}
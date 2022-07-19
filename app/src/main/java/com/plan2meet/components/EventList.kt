package com.plan2meet.components

import android.media.metrics.Event
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import com.plan2meet.dto.EventDTO
import com.plan2meet.ui.Plan2MeetTheme
import kotlin.reflect.KProperty

@Composable
fun EventList(listOfEvents: Array<EventDTO>?){
    Column() {
        listOfEvents?.forEach {
            Row() {
                Text(text = it.toString())
            }
        }
    }
}

private operator fun Any.getValue(nothing: Nothing?, property: KProperty<*>): Any {

    return Any()
}

@Preview(showBackground = true)
@Composable
fun PreviewEventList(){
    Plan2MeetTheme {
        EventList(arrayOf(EventDTO(), EventDTO()))
    }
}
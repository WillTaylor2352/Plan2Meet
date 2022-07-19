package com.plan2meet.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plan2meet.ui.*

@Composable
fun Calendar(){
    //var trueDate by remember { mutableStateOf(Int) }
    var trueDate = 0
    val daysOfWeekArray = arrayOf('S', 'M', 'T', 'W', 'T', 'F', 'S')
        // this data will have to come from a month object
    var numberOfDays = 31

    Column() {
        Row {
            daysOfWeekArray.forEach {
                DayOfWeekText(it)
            }
        }
        while (numberOfDays > 0){
            Row(){
                for (i in 1..7){
                    trueDate++
                    DateButton(trueDate = trueDate, hasEvents = true)
                    if (numberOfDays == 1) break
                    numberOfDays--
                }
            }
        }
//        Row {
//            DateButton(trueDate = 1, true)
//            DateButton(trueDate = 2, false)
//        }
//        Row {
//            DateButton(trueDate = 3, false)
//            DateButton(trueDate = 4, true)
//        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCalendar(){
    Plan2MeetTheme {
        Calendar()
    }
}
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
    var trueDate by remember { mutableStateOf(Int) }
    val daysOfWeekArray = arrayOf('S', 'M', 'T', 'W', 'T', 'F', 'S')

    Column() {
        Row {
            daysOfWeekArray.forEach {
                DayOfWeekText(it)
            }
        }
        Row {
            DateButton(trueDate = 1)
            DateButton(trueDate = 2)
        }
        Row {
            DateButton(trueDate = 3)
            DateButton(trueDate = 4)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCalendar(){
    Plan2MeetTheme {
        Calendar()
    }
}
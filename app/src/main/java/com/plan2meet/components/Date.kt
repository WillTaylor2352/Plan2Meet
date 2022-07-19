package com.plan2meet.components

import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.focus.onFocusEvent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plan2meet.ui.*

@Composable
fun DateButton(trueDate:Int, hasEvents: Boolean){
    var buttonColor by remember { mutableStateOf(AppPurple) }
    var dotColor by remember { mutableStateOf(AppPurple) }
    val focusRequester = FocusRequester()
    val interactionSource = remember { MutableInteractionSource() }
        // Boolean value from mutable interactionSource stating whether the button is focused or not
    val isFocused = interactionSource.collectIsFocusedAsState().value

        // Tests the above Boolean value and updates the buttonColor based on the focus state
    if (isFocused){
        buttonColor = Teal
    } else {
        buttonColor = AppPurple
    }

    if (hasEvents){
        dotColor = White
    } else {
        dotColor = buttonColor
    }

    Row() {
        Button(
            onClick =
            {
                    // attributes focus to the button
                focusRequester.requestFocus()
                // TODO - update text at bottom of screen

            },
            shape = Rectangle,
            contentPadding = PaddingValues(defaultPadding),
            colors = ButtonDefaults.buttonColors(backgroundColor = buttonColor),
            modifier = Modifier
                .padding(defaultPadding, defaultPadding, defaultPadding, defaultPadding)
                    // following 2 lines handle the focusing and unfocusing of the button
                .focusRequester(focusRequester)
                .focusable(interactionSource = interactionSource)
                    // width short 10 to accommodate text field to right
                .size(width = (dateWidth-10).dp, height = dateHeight.dp)

        ) {
            Text(
                text = trueDate.toString(),
                    // 10 padding from start to center number in overall box component
                modifier = Modifier.padding(10.dp, defaultPadding, defaultPadding, defaultPadding)
                )
        }
        Text(
            text = "\u2022",
                // dotColor is based on whether this date has events associated with it
            color = dotColor,
            modifier = Modifier
                .size(width = 10.dp, dateHeight.dp)
                    // background color is based on the overall color of the button
                .background(buttonColor, Rectangle)
                .padding(defaultPadding, defaultPadding, 8.dp, defaultPadding),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DateButtonPreview(){
    Plan2MeetTheme {
        DateButton(0, true)
    }
}
package com.plan2meet.components

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.plan2meet.ui.*

@Composable
fun DateButton(trueDate:Int){
    var buttonColor by remember { mutableStateOf(AppPurple) }
    val focusRequester = FocusRequester()
    val interactionSource = remember { MutableInteractionSource() }
    val isFocused = interactionSource.collectIsFocusedAsState().value
        if (isFocused){
            buttonColor = Teal
        } else {
            buttonColor = AppPurple
        }

    Row() {
        Button(
            onClick =
            {
                focusRequester.requestFocus()
                // TODO - update color of button
                //buttonColor = Teal
                // TODO - update text at bottom of screen
            },
            shape = Rectangle,
            contentPadding = PaddingValues(defaultPadding),
            colors = ButtonDefaults.buttonColors(backgroundColor = buttonColor),
            modifier = Modifier.padding(all = defaultPadding)
                .focusRequester(focusRequester)
                .focusable(interactionSource = interactionSource)
                .size(width = dateWidth.dp, height = dateHeight.dp)

        ) {
            Text(text = trueDate.toString() + " \u2022")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DateButtonPreview(){
    Plan2MeetTheme {
        DateButton(0)
    }
}
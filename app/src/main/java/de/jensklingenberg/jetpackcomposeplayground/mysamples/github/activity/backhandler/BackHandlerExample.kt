package de.jensklingenberg.jetpackcomposeplayground.mysamples.github.activity.backhandler

import androidx.activity.compose.BackHandler
import androidx.compose.material.Text
import androidx.compose.runtime.*

//# --8<-- [start:func]
@Composable
fun BackHandlerExample() {
    var backPressedCount by remember { mutableStateOf(0) }
    BackHandler(enabled = true, onBack = {
        backPressedCount += 1
    })
    Text(text="Backbutton was pressed : $backPressedCount times")
}
//# --8<-- [end:func]
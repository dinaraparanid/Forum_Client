package me.paranid5.desktop

import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import me.paranid5.desktop.me.paranid5.desktop.ui.App
import me.paranid5.resources.Strings

fun main() {
    singleWindowApplication(
        title = Strings.appName,
        state = WindowState(
            position = WindowPosition.Aligned(Alignment.Center),
            width = 1000.dp,
            height = 800.dp
        )
    ) { App() }
}
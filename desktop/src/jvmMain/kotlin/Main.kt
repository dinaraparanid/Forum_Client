package me.paranid5.desktop

import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import me.paranid5.resources.Strings

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = Strings.appName
    ) {
        DesktopMaterialTheme {
            App()
        }
    }
}
package me.paranid5.desktop.me.paranid5.desktop.ui

import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import me.paranid5.desktop.me.paranid5.desktop.ui.appbar.AppBar
import me.paranid5.resources.Colors

@Preview
@Composable
fun App() {
    DesktopMaterialTheme(colors = darkColors(primary = Colors.primaryColor)) {
        Row(
            Modifier
                .fillMaxSize()
                .background(Colors.backgroundColor)
        ) {
            AppBar()
            Surface(
                color = Colors.backgroundColor,
                elevation = 10.dp,
                modifier = Modifier.fillMaxSize()
            ) {
                // TODO: Screens
            }
        }
    }
}
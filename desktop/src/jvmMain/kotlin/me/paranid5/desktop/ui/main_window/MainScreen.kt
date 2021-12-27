package me.paranid5.desktop.me.paranid5.desktop.ui.main_window

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import me.paranid5.resources.Colors

@Composable
fun MainScreen(rootScreen: RootScreen) = Surface(
    color = Colors.backgroundColor,
    elevation = 10.dp,
    modifier = Modifier.fillMaxSize()
) {
    RootView(
        rootScreen = rootScreen,
        container = rootScreen.container
    )
}
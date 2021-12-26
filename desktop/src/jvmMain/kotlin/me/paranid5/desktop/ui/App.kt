package me.paranid5.desktop.me.paranid5.desktop.ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import me.paranid5.desktop.me.paranid5.desktop.ui.main_window.MainScreen
import me.paranid5.desktop.me.paranid5.desktop.ui.main_window.RootScreen
import me.paranid5.resources.Colors

@Preview
@Composable
fun App() = MaterialTheme(colors = darkColors(primary = Colors.primaryColor)) {
    Row(
        Modifier
            .fillMaxSize()
            .background(Colors.backgroundColor)
    ) {
        val lifecycle = LifecycleRegistry()
        val rootScreen = RootScreen(DefaultComponentContext(lifecycle)).apply { start() }

        AppBar(rootScreen)
        MainScreen(rootScreen)
    }
}
package me.paranid5.desktop.me.paranid5.desktop.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import me.paranid5.common.Project
import me.paranid5.common.User
import me.paranid5.desktop.me.paranid5.desktop.ui.app_bar_items.*
import me.paranid5.desktop.me.paranid5.desktop.ui.main_window.RootScreen
import me.paranid5.resources.Colors

@Composable
fun AppBar(rootScreen: RootScreen) {
    Box(
        Modifier
            .fillMaxHeight()
            .wrapContentWidth()
            .background(Colors.primaryColor)
    ) {
        Column {
            Account(rootScreen, User("Fuckin' Slave", "bebra@gmail.com"))
            Projects(rootScreen, listOf(
                Project("Bebra Simulator", "alpha V 0.1.0.0"),
                Project("Escape from the Dungeon", "beta V 0.5.3.2")
            ))
            Blog(rootScreen)
            Settings(rootScreen)
            AboutApp(rootScreen)
        }
    }
}
package me.paranid5.desktop.me.paranid5.desktop.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import me.paranid5.desktop.me.paranid5.desktop.ui.app_bar_items.*
import me.paranid5.resources.Colors

@Composable
fun AppBar() {
    Box(
        Modifier
            .fillMaxHeight()
            .wrapContentWidth()
            .background(Colors.primaryColor)
    ) {
        Column {
            Account()
            Projects()
            Blog()
            Settings()
            AboutApp()
        }
    }
}
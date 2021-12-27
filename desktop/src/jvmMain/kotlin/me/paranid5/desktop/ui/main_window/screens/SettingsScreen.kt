package me.paranid5.desktop.me.paranid5.desktop.ui.main_window.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import me.paranid5.desktop.me.paranid5.desktop.ui.main_window.screens.settings_button.*
import me.paranid5.desktop.me.paranid5.desktop.ui.utils.Divider

@Composable
fun SettingsScreen() = Column(Modifier.fillMaxSize()) {
    Language()
    Divider()
    Theme()
    Divider()
    Font()
}
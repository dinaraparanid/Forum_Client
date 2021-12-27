package me.paranid5.desktop.me.paranid5.desktop.ui.main_window.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import me.paranid5.common.Project
import me.paranid5.desktop.me.paranid5.desktop.ui.main_window.RootScreen
import me.paranid5.desktop.me.paranid5.desktop.ui.utils.Divider

@Composable
fun ProjectsScreen(rootScreen: RootScreen, projects: List<Project>) = LazyColumn(Modifier.fillMaxSize()) {
    items(items = projects) {
        ProjectItemView(rootScreen = rootScreen, project = it)
        Divider()
    }
}
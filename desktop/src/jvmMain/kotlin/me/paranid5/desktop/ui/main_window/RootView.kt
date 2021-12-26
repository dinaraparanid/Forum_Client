package me.paranid5.desktop.me.paranid5.desktop.ui.main_window

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.animation.child.crossfadeScale
import me.paranid5.common.User
import me.paranid5.desktop.me.paranid5.desktop.ui.main_window.screens.*

@OptIn(ExperimentalDecomposeApi::class)
@Composable
fun RootView(rootScreen: RootElement) = Children(
    routerState = rootScreen.routerState,
    animation = crossfadeScale()
) {
    when (it.instance) {
        RootElement.Screen.AboutAppScreen -> AboutAppScreen()
        RootElement.Screen.AccountScreen -> AccountScreen(User("Test user", "bebra@gmail.com"))
        RootElement.Screen.BlogScreen -> BlogScreen()
        RootElement.Screen.ProjectsScreen -> ProjectsScreen()
        RootElement.Screen.SettingsScreen -> SettingsScreen()
    }
}


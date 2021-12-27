package me.paranid5.desktop.me.paranid5.desktop.ui.main_window

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.animation.child.crossfadeScale
import me.paranid5.common.Project
import me.paranid5.common.User
import me.paranid5.desktop.me.paranid5.desktop.ui.main_window.screens.*

@OptIn(ExperimentalDecomposeApi::class)
@Composable
fun RootView(rootScreen: RootScreen, container: MutableState<Any?>) = Children(
    routerState = rootScreen.routerState,
    animation = crossfadeScale()
) {
    when (it.instance) {
        ScreenElement.Screen.MainMenuScreen.AboutAppScreen -> AboutAppScreen()

        ScreenElement.Screen.MainMenuScreen.AccountScreen ->
            (container.value as? User)?.let { user -> AccountScreen(user) }

        ScreenElement.Screen.MainMenuScreen.BlogScreen -> BlogScreen()

        ScreenElement.Screen.MainMenuScreen.ProjectsScreen ->
            (container.value as? List<Project>)?.let { projects ->
                ProjectsScreen(rootScreen = rootScreen, projects = projects)
            }

        ScreenElement.Screen.MainMenuScreen.SettingsScreen -> SettingsScreen()

        ScreenElement.Screen.ProjectScreen ->
            (container.value as? Project)?.let { project -> ProjectScreen(project) }
    }
}
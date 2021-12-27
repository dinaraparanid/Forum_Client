package me.paranid5.desktop.me.paranid5.desktop.ui.main_window

import com.arkivanov.decompose.router.RouterState
import com.arkivanov.decompose.value.Value

interface ScreenElement {
    val routerState: Value<RouterState<*, Screen>>

    sealed interface Screen {
        sealed interface MainMenuScreen : Screen {
            object AccountScreen : MainMenuScreen
            object ProjectsScreen : MainMenuScreen
            object BlogScreen : MainMenuScreen
            object SettingsScreen : MainMenuScreen
            object AboutAppScreen : MainMenuScreen
        }

        object ProjectScreen : Screen
    }
}
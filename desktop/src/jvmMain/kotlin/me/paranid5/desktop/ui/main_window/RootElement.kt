package me.paranid5.desktop.me.paranid5.desktop.ui.main_window

import com.arkivanov.decompose.router.RouterState
import com.arkivanov.decompose.value.Value

interface RootElement {
    val routerState: Value<RouterState<*, Screen>>

    sealed interface Screen {
        object AccountScreen : Screen
        object ProjectsScreen : Screen
        object BlogScreen : Screen
        object SettingsScreen : Screen
        object AboutAppScreen : Screen
    }
}
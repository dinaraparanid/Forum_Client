package me.paranid5.desktop.me.paranid5.desktop.ui.main_window

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.RouterState
import com.arkivanov.decompose.router.router
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize

class RootScreen(
    componentContext: ComponentContext
) : RootElement, ComponentContext by componentContext {
    override val routerState: Value<RouterState<*, RootElement.Screen>>
        get() = router.state

    private val router = router<Config, RootElement.Screen>(
            initialConfiguration = initialConfig,
            handleBackButton = true,
            childFactory = { config, _ -> getChild(config) }
        )

    private sealed interface Config : Parcelable {
        @Parcelize
        object Account : Config

        @Parcelize
        object Projects: Config

        @Parcelize
        object Blog: Config

        @Parcelize
        object Settings: Config

        @Parcelize
        object AboutApp: Config
    }

    private inline val initialConfig
        get() = Config.Account // TODO: Change initial screen

    private fun getChild(config: Config): RootElement.Screen = when (config) {
        Config.AboutApp -> RootElement.Screen.AboutAppScreen
        Config.Account -> RootElement.Screen.AccountScreen
        Config.Blog -> RootElement.Screen.BlogScreen
        Config.Projects -> RootElement.Screen.ProjectsScreen
        Config.Settings -> RootElement.Screen.SettingsScreen
    }
}
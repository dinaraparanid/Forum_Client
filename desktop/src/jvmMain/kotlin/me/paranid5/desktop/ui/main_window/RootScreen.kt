package me.paranid5.desktop.me.paranid5.desktop.ui.main_window

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.*
import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize

class RootScreen(
    componentContext: ComponentContext
) : RootElement, ComponentContext by componentContext {
    override val routerState: Value<RouterState<*, RootElement.Screen>>
        get() = router.state

    private lateinit var currentConfig: MutableState<Config>

    private val router by lazy {
        router(
            initialConfiguration = currentConfig.value,
            handleBackButton = true,
            childFactory = { config, _ -> getChild(config) }
        )
    }

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

    fun changeConfigToAccount() {
        currentConfig.value = Config.Account
        router.replaceCurrent(currentConfig.value)
    }

    fun changeConfigToProjects() {
        currentConfig.value = Config.Projects
        router.replaceCurrent(currentConfig.value)
    }

    fun changeConfigToBlog() {
        currentConfig.value = Config.Blog
        router.replaceCurrent(currentConfig.value)
    }

    fun changeConfigToSettings() {
        currentConfig.value = Config.Settings
        router.replaceCurrent(currentConfig.value)
    }

    fun changeConfigToAboutApp() {
        currentConfig.value = Config.AboutApp
        router.replaceCurrent(currentConfig.value)
    }

    @Composable
    fun start() {
        currentConfig = remember { mutableStateOf(initialConfig) }
    }
}
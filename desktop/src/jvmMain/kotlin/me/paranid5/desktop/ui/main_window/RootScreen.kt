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
import me.paranid5.common.Project
import me.paranid5.common.User

class RootScreen(componentContext: ComponentContext) : ScreenElement, ComponentContext by componentContext {
    override val routerState: Value<RouterState<*, ScreenElement.Screen>>
        get() = router.state

    private lateinit var currentConfig: MutableState<Config>
    lateinit var container: MutableState<Any?>
        private set

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

        @Parcelize
        object Project: Config
    }

    private inline val initialConfig
        get() = Config.Account // TODO: Change initial screen

    private fun getChild(config: Config): ScreenElement.Screen = when (config) {
        Config.AboutApp -> ScreenElement.Screen.MainMenuScreen.AboutAppScreen
        Config.Account -> ScreenElement.Screen.MainMenuScreen.AccountScreen
        Config.Blog -> ScreenElement.Screen.MainMenuScreen.BlogScreen
        Config.Projects -> ScreenElement.Screen.MainMenuScreen.ProjectsScreen
        Config.Settings -> ScreenElement.Screen.MainMenuScreen.SettingsScreen
        Config.Project -> ScreenElement.Screen.ProjectScreen
    }

    fun changeConfigToAccount(user: User) {
        currentConfig.value = Config.Account
        container.value = user
        router.replaceCurrent(currentConfig.value)
    }

    fun changeConfigToProjects(projects: List<Project>) {
        currentConfig.value = Config.Projects
        container.value = projects
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

    fun changeConfigToProject(project: Project) {
        currentConfig.value = Config.Project
        container.value = project
        router.replaceCurrent(currentConfig.value)
    }

    @Composable
    fun start() {
        container = remember { mutableStateOf(User("Fuckin' Slave", "bebra@gmail.com")) }
        currentConfig = remember { mutableStateOf(initialConfig) }
    }
}
package me.paranid5.desktop.me.paranid5.desktop.ui.main_window

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import me.paranid5.resources.Colors

@Composable
fun MainScreen() = Surface(
    color = Colors.backgroundColor,
    elevation = 10.dp,
    modifier = Modifier.fillMaxSize()
) {
    val lifecycle = LifecycleRegistry()
    val rootScreen = initialScreen
    RootView(RootScreen(DefaultComponentContext(lifecycle)))
}

// TODO: Change initial screen in settings
private inline val initialScreen
    get() = RootElement.Screen.AccountScreen
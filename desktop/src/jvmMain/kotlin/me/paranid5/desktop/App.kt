package me.paranid5.desktop

import androidx.compose.desktop.DesktopMaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.paranid5.resources.Colors
import me.paranid5.resources.Strings

@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun App() {
    DesktopMaterialTheme(colors = darkColors(primary = Colors.primaryColor)) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Colors.backgroundColor)
        ) {
            AppBar()
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AppBar() {
    NavigationRail(
        backgroundColor = Colors.primaryColor,
        contentColor = Colors.backgroundColor,
        elevation = 10.dp,
    ) {
        NavigationRailItem(
            label = {
                Text(text = Strings.account, fontSize = 14.sp, color = Colors.textColor)
            },
            icon = {
                Image(
                    painter = painterResource("images/human.png"),
                    contentDescription = Strings.account,
                    colorFilter = ColorFilter.tint(Colors.backgroundColor),
                    modifier = Modifier.height(35.dp)
                )
            },
            onClick = {
                println("Clicked")
            },
            selected = false,
        )
    }
}
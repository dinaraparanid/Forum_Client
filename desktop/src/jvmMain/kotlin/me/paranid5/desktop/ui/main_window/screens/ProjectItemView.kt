package me.paranid5.desktop.me.paranid5.desktop.ui.main_window.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.paranid5.common.Project
import me.paranid5.desktop.me.paranid5.desktop.ui.main_window.RootScreen
import me.paranid5.resources.Colors
import me.paranid5.resources.Strings

@Composable
fun ProjectItemView(rootScreen: RootScreen, project: Project) = Button(
    onClick = { rootScreen.changeConfigToProject(project) },
    modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .padding(5.dp),
    colors = ButtonDefaults.buttonColors(
        backgroundColor = Colors.backgroundColor,
        contentColor = Colors.primaryColor
    )
) {
    Row {
        Image(
            painter = project.image,
            contentDescription = Strings.projectPreviewImage,
            modifier = Modifier
                .height(60.dp)
                .wrapContentWidth()
                .border(
                    width = 2.dp,
                    color = Colors.backgroundColor,
                    shape = CircleShape
                )
        )

        Column(Modifier.weight(weight = 1F, fill = true)) {
            Text(
                text = project.title,
                color = Colors.textColor,
                fontSize = 20.sp
            )

            Text(
                text = project.version,
                color = Colors.textColor,
                fontSize = 14.sp
            )
        }
    }
}
package me.paranid5.desktop.me.paranid5.desktop.ui.main_window.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.paranid5.common.Project
import me.paranid5.resources.Colors
import me.paranid5.resources.Strings

@Composable
fun ProjectScreen(project: Project) = Column(Modifier.fillMaxSize()) {
    Image(
        painter = project.image,
        contentDescription = Strings.projectPreviewImage,
        modifier = Modifier
            .height(120.dp)
            .wrapContentWidth()
            .border(
                width = 2.dp,
                color = Colors.backgroundColor,
                shape = CircleShape
            )
    )

    Text(
        text = project.title,
        color = Colors.textColor,
        fontSize = 24.sp
    )

    Text(
        text = project.version,
        color = Colors.textColor,
        fontSize = 24.sp
    )
}
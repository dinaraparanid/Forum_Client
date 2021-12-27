package me.paranid5.desktop.me.paranid5.desktop.ui.main_window.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.paranid5.common.User
import me.paranid5.resources.Colors
import me.paranid5.resources.Strings

@Composable
fun AccountScreen(user: User) = Column(Modifier.fillMaxSize()) {
    Row(
        Modifier
            .fillMaxWidth()
            .weight(1F)
    ) {
        Box(Modifier.fillMaxWidth()) {
            Column(Modifier.fillMaxSize()) {
                Image(
                    painter = user.avatar,
                    contentDescription = Strings.userAvatar,
                    colorFilter = ColorFilter.tint(Colors.backgroundColor),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .paddingFromBaseline(top = 50.dp)
                        .padding(10.dp)
                        .height(200.dp)
                        .clip(CircleShape)
                        .border(
                            width = 2.dp,
                            color = Colors.primaryColor,
                            shape = CircleShape
                        ),
                )

                Text(
                    text = user.nickname,
                    color = Colors.textColor,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                )

                Text(
                    text = user.email,
                    color = Colors.textColor,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(2.dp)
                )
            }
        }
    }

    Row(
        Modifier
            .fillMaxWidth()
            .weight(1F)
    ) {
        Box(Modifier.fillMaxWidth()) {

        }
    }
}
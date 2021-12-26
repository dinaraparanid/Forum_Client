package me.paranid5.desktop.me.paranid5.desktop.ui.app_bar_items

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.paranid5.resources.Colors
import me.paranid5.resources.Strings

@Composable
fun ColumnScope.Account() {
    Box(
        Modifier
            .wrapContentWidth()
            .weight(weight = 1F, fill = true)
            .align(Alignment.CenterHorizontally)
    ) {
        Button(
            onClick = {
                // TODO: Account screen
            },
            modifier = Modifier.align(Alignment.Center),
            elevation = null,
            shape = AbsoluteRoundedCornerShape(15.dp)
        ) {
            Column {
                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Image(
                        painter = painterResource("images/human.png"), // TODO: User's avatar
                        contentDescription = Strings.account,
                        colorFilter = ColorFilter.tint(Colors.backgroundColor),
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .height(50.dp)
                            .clip(CircleShape)
                            .border(
                                width = 2.dp,
                                color = Colors.backgroundColor,
                                shape = CircleShape
                            ),
                    )
                }

                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Text(
                        text = Strings.account,
                        fontSize = 14.sp,
                        color = Colors.textColor,
                    )
                }
            }
        }
    }
}

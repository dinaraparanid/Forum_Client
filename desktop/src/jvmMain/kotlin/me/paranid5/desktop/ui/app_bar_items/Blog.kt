package me.paranid5.desktop.me.paranid5.desktop.ui.app_bar_items

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.paranid5.resources.Colors
import me.paranid5.resources.Strings

@Composable
fun ColumnScope.Blog() {
    Box(
        Modifier
            .wrapContentWidth()
            .weight(weight = 1F, fill = true)
            .align(Alignment.CenterHorizontally)
    ) {
        Button(
            onClick = {
                // TODO: Blog screen
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
                        painter = painterResource("images/blog_icon.png"),
                        contentDescription = Strings.account,
                        colorFilter = ColorFilter.tint(Colors.backgroundColor),
                        modifier = Modifier.align(Alignment.TopCenter).height(50.dp)
                    )
                }

                Box(
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(5.dp)
                ) {
                    Text(
                        text = Strings.blog,
                        fontSize = 14.sp,
                        color = Colors.textColor,
                    )
                }
            }
        }
    }
}
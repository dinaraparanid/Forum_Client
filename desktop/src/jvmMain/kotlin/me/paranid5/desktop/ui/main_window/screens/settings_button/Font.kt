package me.paranid5.desktop.me.paranid5.desktop.ui.main_window.screens.settings_button

import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.paranid5.resources.Colors
import me.paranid5.resources.Strings

@Composable
fun Font() {
    Button(
        onClick = {
            // TODO: Change font
        },
        elevation = null,
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Colors.backgroundColor,
            contentColor = Colors.primaryColor
        )
    ) {
        Text(
            text = Strings.font,
            color = Colors.textColor,
            fontSize = 16.sp,
            modifier = Modifier
                .fillMaxWidth()
                .absolutePadding(left = 5.dp, right = 5.dp)
                .wrapContentHeight()
        )
    }
}
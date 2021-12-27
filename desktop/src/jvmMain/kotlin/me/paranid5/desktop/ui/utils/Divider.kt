package me.paranid5.desktop.me.paranid5.desktop.ui.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import me.paranid5.resources.Colors
import androidx.compose.foundation.layout.Spacer

@Composable
fun Divider() = Spacer(
    Modifier
        .background(Colors.primaryColor)
        .fillMaxWidth()
        .height(2.dp)
)
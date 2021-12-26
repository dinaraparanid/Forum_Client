package me.paranid5.android

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun App() {
    MaterialTheme(colors = darkColors(primary = Color(155, 0, 255))) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(30, 30, 30))
        ) {
        }
    }
}
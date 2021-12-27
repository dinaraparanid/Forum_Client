package me.paranid5.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

data class Project(val title: String, val version: String) {
    private var _image: Painter? = null

    val image: Painter
        @Composable
        get() {
            if (_image == null)
                _image = loadImage()
            return _image!!
        }
}

@Composable
expect fun Project.loadImage(): Painter
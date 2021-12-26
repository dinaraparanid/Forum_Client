package me.paranid5.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.toAwtImage
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.LayoutDirection

@Composable
actual fun User.loadAvatar() = painterResource("images/human.png").run {
    // TODO: User's avatar

    toAwtImage(
        density = LocalDensity.current,
        layoutDirection = LayoutDirection.Ltr,
        size = intrinsicSize
    )
}
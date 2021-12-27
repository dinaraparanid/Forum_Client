package me.paranid5.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

data class User(
    val nickname: String,
    val email: String
) {
    private var _avatar: Painter? = null

    val avatar: Painter
        @Composable
        get() {
            if (_avatar == null)
                _avatar = loadAvatar()
            return _avatar!!
        }

    override fun equals(other: Any?): Boolean {

        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (nickname != other.nickname) return false
        if (email != other.email) return false
        return true
    }

    override fun hashCode(): Int {
        var result = nickname.hashCode()
        result = 31 * result + email.hashCode()
        return result
    }
}

@Composable
expect fun User.loadAvatar(): Painter
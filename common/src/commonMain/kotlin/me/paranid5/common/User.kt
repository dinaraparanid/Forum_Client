package me.paranid5.common

import androidx.compose.runtime.Composable
import java.awt.Image

data class User(
    val nickname: String,
    val email: String
) {
    private var _avatar: Image? = null

    val avatar: Image
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
expect fun User.loadAvatar(): Image
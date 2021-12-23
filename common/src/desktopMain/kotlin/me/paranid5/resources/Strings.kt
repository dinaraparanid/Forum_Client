package me.paranid5.resources

object Strings {
    val appName: String
    val account: String

    init {
        when (System.getProperty("user.language")) {
            "en" -> {
                appName = "Paranid5's Forum"
                account = "Account"
            }

            "ru" -> {
                appName = "Форум Paranid5"
                account = "Аккаунт"
            }

            else -> throw IllegalArgumentException("Unknown language")
        }
    }
}
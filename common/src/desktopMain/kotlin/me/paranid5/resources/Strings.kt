package me.paranid5.resources

object Strings {
    lateinit var appName: String
        private set

    lateinit var account: String
        private set

    lateinit var projects: String
        private set

    lateinit var blog: String
        private set

    lateinit var settings: String
        private set

    lateinit var aboutApp: String
        private set

    lateinit var userAvatar: String
        private set

    init {
        when (System.getProperty("user.language")) {
            "en" -> switchToEnglish()
            "ru" -> switchToRussian()
            else -> switchToEnglish()
        }
    }

    fun switchToEnglish() {
        appName = "Paranid5's Forum"
        account = "Account"
        projects = "Projects"
        blog = "Blog"
        settings = "Settings"
        aboutApp = "About App"
        userAvatar = "User`s avatar"
    }

    fun switchToRussian() {
        appName = "Форум Paranid5"
        account = "Аккаунт"
        projects = "Проекты"
        blog = "Блог"
        settings = "Настройки"
        aboutApp = "О Приложении"
        userAvatar = "Аватар пользователя"
    }
}
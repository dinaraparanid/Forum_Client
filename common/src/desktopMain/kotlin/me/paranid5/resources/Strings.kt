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

    lateinit var language: String
        private set

    lateinit var theme: String
        private set

    lateinit var font: String
        private set

    lateinit var projectPreviewImage: String
        private set

    const val russian = "Русский"
    const val english = "English"

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
        language = "Language"
        theme = "Theme"
        projectPreviewImage = "Project's preview image"
        font = "Font"
    }

    fun switchToRussian() {
        appName = "Форум Paranid5"
        account = "Аккаунт"
        projects = "Проекты"
        blog = "Блог"
        settings = "Настройки"
        aboutApp = "О Приложении"
        userAvatar = "Аватар пользователя"
        language = "Язык"
        theme = "Тема"
        projectPreviewImage = "Превью проекта"
        font = "Шрифт"
    }
}
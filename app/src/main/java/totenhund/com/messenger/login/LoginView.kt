package totenhund.com.messenger.login

import totenhund.com.messenger.ui.auth.AuthView
import totenhund.com.messenger.ui.base.BaseView

interface LoginView: BaseView, AuthView {
    fun showProgress()
    fun hideProgress()
    fun setUsernameError()
    fun setPasswordError()
    fun navigateToSignUp()
    fun navigateToHome()
}
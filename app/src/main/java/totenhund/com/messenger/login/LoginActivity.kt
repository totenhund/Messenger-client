package totenhund.com.messenger.login

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*
import totenhund.com.messenger.R

class LoginActivity : AppCompatActivity(), LoginView, View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    override fun showProgress() {
        TODO("Not yet implemented")
    }

    override fun hideProgress() {
        TODO("Not yet implemented")
    }

    override fun setUsernameError() {
        TODO("Not yet implemented")
    }

    override fun setPasswordError() {
        TODO("Not yet implemented")
    }

    override fun navigateToSignUp() {
        TODO("Not yet implemented")
    }

    override fun navigateToHome() {
        TODO("Not yet implemented")
    }

    override fun bindViews() {
        TODO("Not yet implemented")
    }

    override fun showAuthError() {
        Toast.makeText(this, "Invalid username and password combination", Toast.LENGTH_SHORT).show()
    }

    override fun getContext(): Context {
        TODO("Not yet implemented")
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}
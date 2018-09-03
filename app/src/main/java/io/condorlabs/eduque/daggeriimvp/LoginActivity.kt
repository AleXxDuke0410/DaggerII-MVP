package io.condorlabs.eduque.daggeriimvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.condorlabs.eduque.daggeriimvp.di.DaggerApp
import io.condorlabs.eduque.daggeriimvp.mvp.ILoginMVP
import io.condorlabs.eduque.daggeriimvp.utils.toEditable
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : AppCompatActivity(), ILoginMVP.View {

    @Inject
    lateinit var presenter: ILoginMVP.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        (application as DaggerApp).applicationComponent().inject(this)

        btnLogin.setOnClickListener({
            presenter.loginButtonClicked()
        })
    }

    override fun onResume() {
        super.onResume()
        presenter.view(this)
        presenter.currentUser()
    }

    override fun firstName(): String {
        return fName.text.toString()
    }

    override fun lastName(): String {
        return lName.text.toString()
    }

    override fun firstName(fName: String) {
        this.fName.text = fName.toEditable()
    }

    override fun lastName(lName: String) {
        this.lName.text = lName.toEditable()
    }

    override fun showUserSavedMessage() {
        Toast.makeText(this,"Usuario guardado!", Toast.LENGTH_SHORT).show()
    }

    override fun showUserNotAvailable() {
        Toast.makeText(this,"Usuario no disponible!", Toast.LENGTH_SHORT).show()
    }

    override fun showInputError() {
        Toast.makeText(this,"Ingrese datos!", Toast.LENGTH_SHORT).show()
    }
}

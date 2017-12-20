package com.erivas.androidauth.login.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.erivas.androidauth.R
import com.erivas.androidauth.login.presenter.LoginPresenter
import com.erivas.androidauth.login.presenter.LoginPresenterImpl
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.toast

class LoginActivity : AppCompatActivity(), LoginView {

     private var  presenter:LoginPresenter? = null
//    private val firebaseAuth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

         var firebaseAuth:FirebaseAuth = FirebaseAuth.getInstance()

        presenter = LoginPresenterImpl()

        //Call event onclick
        login.setOnClickListener {
            if(email != null || password != null){
                presenter?.loginSuccess(email.text.toString(), password.text.toString(),firebaseAuth)
            }
        }




    }

    override fun goHome() {

//        toast("Presiono login y se enviaran email: ${email.text} y password:${password.text}")
    }
}

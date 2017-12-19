package com.erivas.androidauth.login.interactor

import android.util.Log
import com.erivas.androidauth.login.presenter.LoginPresenterImpl
import org.jetbrains.anko.toast

/**
 * Created by erivas on 12/19/17.
 */
class LoginInteractorImpl: LoginInteractor {

    private val presenter:LoginPresenterImpl? = null
    val tag:String = "User"

    override fun signIn(email: String, password: String) {

        Log.i(tag,"User $email password $password")

    }
}
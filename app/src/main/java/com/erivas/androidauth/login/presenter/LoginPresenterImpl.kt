package com.erivas.androidauth.login.presenter

import com.erivas.androidauth.login.interactor.LoginInteractor
import com.erivas.androidauth.login.interactor.LoginInteractorImpl

/**
 * Created by erivas on 12/19/17.
 */
class LoginPresenterImpl: LoginPresenter {

    private var interactor: LoginInteractor? = null

    constructor(){
        interactor = LoginInteractorImpl()
    }


    override fun loginSuccess(email:String,password:String) {

        interactor?.signIn(email,password)

    }
}
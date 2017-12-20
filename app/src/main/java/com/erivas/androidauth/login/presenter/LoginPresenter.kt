package com.erivas.androidauth.login.presenter

import com.google.firebase.auth.FirebaseAuth

/**
 * Created by erivas on 12/19/17.
 */
interface LoginPresenter {
    fun loginSuccess(email:String,password:String,mAuth:FirebaseAuth)
}
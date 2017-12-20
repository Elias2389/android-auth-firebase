package com.erivas.androidauth.login.interactor

import com.google.firebase.auth.FirebaseAuth

/**
 * Created by erivas on 12/19/17.
 */
interface LoginInteractor {
    fun signIn(email:String,password:String,mAuth: FirebaseAuth)
}
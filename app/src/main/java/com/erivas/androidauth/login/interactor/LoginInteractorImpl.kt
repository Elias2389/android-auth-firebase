package com.erivas.androidauth.login.interactor

import android.util.Log
import com.erivas.androidauth.login.presenter.LoginPresenterImpl
import com.google.firebase.auth.FirebaseAuth


/**
 * Created by erivas on 12/19/17.
 */
class LoginInteractorImpl: LoginInteractor {

    private var presenter:LoginPresenterImpl? = null
    val TAG:String = "User"

    override fun signIn(email: String, password: String, mAuth:FirebaseAuth) {
        mAuth.signInWithEmailAndPassword(email,password)
                .addOnCompleteListener { task ->
                    if(task.isSuccessful){
                        Log.d(TAG,"Success")
                    }else{
                        Log.d(TAG,task.exception.toString())
                    }
                }

    }
}
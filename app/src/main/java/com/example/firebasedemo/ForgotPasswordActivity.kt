package com.example.firebasedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_forgot_password.*

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        init()
    }

    private fun init() {
        button_reset_password.setOnClickListener{
            var auth = FirebaseAuth.getInstance()
            var email = edit_text_email.text.toString()
            auth.sendPasswordResetEmail(email)

        }
    }
}
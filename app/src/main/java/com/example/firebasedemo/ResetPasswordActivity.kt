package com.example.firebasedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_reset_password.*

class ResetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        init()
    }

    private fun init() {
        button_reset_password.setOnClickListener{
            var auth = FirebaseAuth.getInstance()
            var newPassword = edit_text_new_password.text.toString()
            var user = auth.currentUser
            user?.updatePassword(newPassword)

        }
    }
}
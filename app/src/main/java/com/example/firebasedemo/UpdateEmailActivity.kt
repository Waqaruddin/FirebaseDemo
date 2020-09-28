package com.example.firebasedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_update_email_activity.*

class UpdateEmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_email_activity)

        init()
    }

    private fun init() {
        button_update_email.setOnClickListener{
            var auth = FirebaseAuth.getInstance()
            var user = auth.currentUser
            var newEmail = edit_text_update_email.text.toString()

            user?.updateEmail(newEmail)

        }
    }
}
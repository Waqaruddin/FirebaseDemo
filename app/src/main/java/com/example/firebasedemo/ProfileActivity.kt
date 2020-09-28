package com.example.firebasedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_profile.view.*

class ProfileActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        init()
    }

    private fun init() {
        button_reset_password.setOnClickListener(this)
        button_update_password.setOnClickListener(this)
        button_update_email.setOnClickListener(this)
        button_delete_user.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view){

            button_reset_password -> startActivity(Intent(this, ForgotPasswordActivity::class.java))
            button_update_password -> startActivity(Intent(this, ResetPasswordActivity::class.java))
            button_update_email -> startActivity(Intent(this, UpdateEmailActivity::class.java))
            button_delete_user ->  {
                var auth = FirebaseAuth.getInstance()
                var user = auth.currentUser
                user?.delete()
            }

        }
    }
}
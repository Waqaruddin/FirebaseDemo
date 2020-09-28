package com.example.firebasedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    lateinit var auth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        auth = FirebaseAuth.getInstance()
        init()
    }

    private fun init() {
        var user = auth.currentUser
        text_view.text = user?.email

        button_logout.setOnClickListener{
            auth.signOut()
            startActivity(Intent(this, MainActivity::class.java))
        }

        button_profile.setOnClickListener{
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}
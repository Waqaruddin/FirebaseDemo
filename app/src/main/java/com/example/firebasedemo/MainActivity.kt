package com.example.firebasedemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        button_register.setOnClickListener(this)
        button_login.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view){
            button_login -> startActivity(Intent(this, LoginActivity::class.java))
            button_register ->startActivity(Intent(this, RegisterActivity::class.java))

        }
    }

}
package com.example.firebasedemo

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        init()
    }

    private fun init() {
        button_register.setOnClickListener {
            var email = edit_text_email.text.toString()
            var password = edit_text_password.text.toString()

            var auth = FirebaseAuth.getInstance()

//            auth.signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this, object:OnCompleteListener<AuthResult> {
//                    override fun onComplete(p0: Task<AuthResult>) {
////                        TODO("Not yet implemented")
//                    }
//
//                })

            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, object:OnCompleteListener<AuthResult>{
                    override fun onComplete(task: Task<AuthResult>) {
                        if(task.isSuccessful){
                            Toast.makeText(applicationContext, "User registered successfully", Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(applicationContext, "registeration failed", Toast.LENGTH_SHORT).show()
                        }
                    }

                })
        }
    }
}
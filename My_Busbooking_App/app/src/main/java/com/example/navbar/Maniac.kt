package com.example.navbar

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Maniac : AppCompatActivity() {


    lateinit var btnLogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

  title="Log in"



       btnLogin=  findViewById(R.id.btnlogin)

        btnLogin.setOnClickListener{



            val intent=Intent(this@Maniac,MainActivity::class.java)
            startActivity(intent)
        }















    }
}
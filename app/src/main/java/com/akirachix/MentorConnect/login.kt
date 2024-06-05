package com.akirachix.MentorConnect

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.MentorConnect.databinding.ActivityLoginBinding
import com.akirachix.MentorConnect.databinding.ActivityMainBinding
import org.w3c.dom.Text

class login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView3.setOnClickListener {
            val intent = Intent(this, ActivityMainBinding::class.java)
            startActivity(intent)
        }
        binding.tilbutton.setOnClickListener {
            validateLogin()
        }

//        enableEdgeToEdge()
//        setContentView(R.layout.activity_login)
//        val textView3=findViewById<TextView>(R.id.textView3)
//        textView3.setOnClickListener{
//            val intent=Intent(this,MainActivity::class.java)
//            startActivity(intent)
//        }
    }

    fun validateLogin() {
        clearErrors()
        var formError = false
        val firstName = binding.etUser.text.toString()
        if (firstName.isBlank()) {
            formError = true
            binding.tilUser.error = getString(R.string.first_name_is_required)
        }

        val Password = binding.etPassword.text.toString()
        if (Password.isBlank()) {
            formError = true
            binding.tilPassword.error = getString(R.string.password_is_required)
        }
        fun clearErrors() {
            binding.tilUser.error = null
            binding.tilPassword.error = null
        }
    }
    fun clearErrors(){
        binding.tilUser.error = null
        binding.tilPassword.error = null


    }
}
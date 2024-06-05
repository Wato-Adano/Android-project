package com.akirachix.MentorConnect

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.MentorConnect.databinding.ActivityLoginBinding
import com.akirachix.MentorConnect.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.textView4.setOnClickListener{
            val intent = Intent(this,login::class.java)
            startActivity(intent)
        }
//        val textVeiw4= findViewById<TextView>(R.id.textView4)
//         textVeiw4.setOnClickListener{
//            val intent=Intent(this,login::class.java)
//            startActivity(intent)
//        }
        binding.button2.setOnClickListener{
            validateRegistration()
        }
    }
    fun validateRegistration(){
        var formError = false
        val firstName = binding.etFirstName.text.toString()
        if(firstName.isBlank()){
            formError = true
            binding.tilFirstName.error = "First name is required"
        }
        val lastname = binding.etLastName.text.toString()
        if (lastname.isBlank()){
            formError = true
            binding.tilLastName.error = "Last name is required"
        }
        val Email = binding.etEmail.text.toString()
        if (Email.isBlank()){
            formError = true
            binding.tilEmail.error = " Email is required"
        }
        val CodiveID = binding.etcodeId.text.toString()
        if (CodiveID.isBlank()){
            formError = true
            binding.tilCodeId.error = "CodehiveID is required"
        }
        val UserName = binding.etUsername.text.toString()
        if (UserName.isBlank()){
            formError = true
            binding.tilUserName.error = "UserName is required"
        }
        val Password = binding.etPassword.text.toString()
        if (Password.isBlank()){
            formError = true
            binding.tilPassword.error = "Password is required"
        }
        val Passwordconf = binding.etConfirmPassword.text.toString()
        if (Passwordconf.isBlank()){
            formError = true

            binding.tilConfirmPassword.error = "Password confirmation is required"


        }
        if (Password!= Passwordconf) {
            formError = true
            binding.tilConfirmPassword.error = "Password and confirmation do not match"

        }
    }
}
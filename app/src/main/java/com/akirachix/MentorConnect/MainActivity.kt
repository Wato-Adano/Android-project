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
        clearErrors()
        var formError = false
        val firstName = binding.etFirstName.text.toString()
        if(firstName.isBlank()){
            formError = true
            binding.tilFirstName.error = getString(R.string.first_name_is_required)
        }
        val lastname = binding.etLastName.text.toString()
        if (lastname.isBlank()){
            formError = true
            binding.tilLastName.error = getString(R.string.last_name_is_required)
        }
        val Email = binding.etEmail.text.toString()
        if (Email.isBlank()){
            formError = true
            binding.tilEmail.error = getString(R.string.email_is_required)
        }
        val CodiveID = binding.etcodeId.text.toString()
        if (CodiveID.isBlank()){
            formError = true
            binding.tilCodeId.error = getString(R.string.codehiveid_is_required)
        }
        val UserName = binding.etUsername.text.toString()
        if (UserName.isBlank()){
            formError = true
            binding.tilUserName.error = getString(R.string.username_is_required)
        }
        val Password = binding.etPassword.text.toString()
        if (Password.isBlank()){
            formError = true
            binding.tilPassword.error = getString(R.string.password_is_required)
        }
        val Passwordconf = binding.etConfirmPassword.text.toString()
        if (Passwordconf.isBlank()){
            formError = true

            binding.tilConfirmPassword.error = getString(R.string.password_confirmation_is_required)


        }
        if (Password!= Passwordconf) {
            formError = true
            binding.tilConfirmPassword.error =
                getString(R.string.password_and_confirmation_do_not_match)

        }
        if (!formError){
            // processed to register
        }
    }

    fun clearErrors(){
        binding.tilFirstName.error = null
        binding.tilLastName.error = null
        binding.tilEmail.error = null
        binding.tilCodeId.error = null
        binding.tilUserName.error = null
        binding.tilPassword.error = null
        binding.tilConfirmPassword.error = null

    }
}
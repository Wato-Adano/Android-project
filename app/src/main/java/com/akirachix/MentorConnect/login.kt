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

        binding.textView3.setOnClickListener{
          val intent = Intent(this,ActivityMainBinding::class.java)
            startActivity(intent)
        }


//        enableEdgeToEdge()
//        setContentView(R.layout.activity_login)
//        val textView3=findViewById<TextView>(R.id.textView3)
//        textView3.setOnClickListener{
//            val intent=Intent(this,MainActivity::class.java)
//            startActivity(intent)
//        }
    }
}
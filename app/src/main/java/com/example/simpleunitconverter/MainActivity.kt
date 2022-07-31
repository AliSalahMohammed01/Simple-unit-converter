package com.example.simpleunitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnfragment1: Button = findViewById(R.id.button)
        val btnfragment2: Button = findViewById(R.id.button2)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment,FirstFragment())
            commit()
        }


        btnfragment1.setOnClickListener()
        {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment,FirstFragment())
                commit()
            }
        }


        btnfragment2.setOnClickListener()
        {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment,SecondFragment())
                commit()
            }
        }





        val rating: TextView = findViewById(R.id.Rating)
        rating.setOnClickListener {
            var dialog_var = CustomDialogFragment()
            dialog_var.show(supportFragmentManager,"Custom Dialog")
        }
    }
    fun receiveFeedBack(feedback: String)
    {
        val ratingTV: TextView = findViewById(R.id.Rating)
        ratingTV.text=feedback
    }
}
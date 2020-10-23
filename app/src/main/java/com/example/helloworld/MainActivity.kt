package com.example.helloworld

import android.os.Bundle
import android.widget.Toast

import android.widget.TextView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // val btn = findViewById(R.id.button) as Button
      //  val mytext = findViewById(R.id.textView) as TextView
        var timesclicked : Int = 0
        button.setOnClickListener{
            timesclicked +=1
            textView.text = timesclicked.toString()
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }
        }
    }


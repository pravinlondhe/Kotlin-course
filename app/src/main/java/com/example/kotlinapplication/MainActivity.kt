package com.example.kotlinapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast(getString(R.string.sample_msg_kt))

        //Excercise -2
        val textView : TextView = findViewById(R.id.tv_test_text)
        textView.text = getString(R.string.sample_msg_kt)

        //Excercise-3
        val button : Button = findViewById(R.id.bt_show)
        val input : EditText = findViewById(R.id.et_input)
        button.setOnClickListener {
            showToast("Hello ${input.text}")
        }
    }

    //Excercise-1
    fun showToast(msg:String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}

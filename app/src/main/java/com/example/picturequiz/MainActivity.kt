package com.example.picturequiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConfirm.setOnClickListener(){
            checkAnswer();
        }
    }

    private fun checkAnswer(){
       val answer = etAnswer.text.toString();

        if (answer == getString(R.string.Giraffe)) {
            Toast.makeText(this, getString(R.string.Correct), Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, getString(R.string.Incorrect), Toast.LENGTH_LONG).show()
        }
    }
}

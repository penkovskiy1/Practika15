package com.example.practice15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun btnClick(view: View){
        val edtv1: EditText = findViewById(R.id.editTextText)
        val edtv2: EditText = findViewById(R.id.editTextNumber)
        val edtv3: EditText = findViewById(R.id.editTextNumber2)

        val kind: String = edtv1.text.toString()
        val year: Int = edtv2.text.toString().toInt()
        val month: Int = edtv3.text.toString().toInt()

        val pet: Pet = Pet(kind, year, month)

        val intent: Intent = Intent(this@MainActivity, Mix::class.java)

        intent.putExtra(pet.javaClass.simpleName, pet)

        startActivity(intent)

        }

    }

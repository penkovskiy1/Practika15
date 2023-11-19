package com.example.practice15


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class Mix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mix)

        val tv:TextView = findViewById(R.id.textView2)

        var pet : Pet = Pet()

        val arguments: Bundle? = intent.extras
        if (arguments != null){
            pet = arguments.getParcelable<Pet>(pet.javaClass.simpleName) as Pet
            tv.text = "Месяц: ${pet.getMonth()}\n Порода:${pet.getKind()}\n Год: ${pet.getYear()}"
        }
    }
}
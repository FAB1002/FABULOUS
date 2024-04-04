package com.example.multiplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class multiplicationscreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplicationscreen)

        val tvResult = findViewById<TextView>(R.id.btnMultiply)

        val bundle : Bundle? = intent.extras

        val tableNumber = bundle?.getString("number")

        val number = tableNumber.toString().toInt()

        var data = ""
//
//        data = data + "$number x 1 = ${number * 1} \n"
//        data += data + "$number x 1 = ${number * 1} \n"
//        data += data + "$number x 2 = ${number * 2} \n"
//        data += data + "$number x 3 = ${number * 3} \n"
//        data += data + "$number x 4 = ${number * 4} \n"
//        data += data + "$number x 5 = ${number * 5} \n"
//        data += data + "$number x 6 = ${number * 6} \n"
//        data += data + "$number x 7 = ${number * 7} \n"
//        data += data + "$number x 8 = ${number * 8} \n"
//        data += data + "$number x 9 = ${number * 9} \n"
//        data += data + "$number x 10 = ${number * 10} \n"

        var counter = 1

        while (counter <= 10) {
            data += "$number x $counter = ${number * counter} \n"
            counter = + 1
            counter++
        }

        if() {

        }

        tvResult.text = data
    }
}
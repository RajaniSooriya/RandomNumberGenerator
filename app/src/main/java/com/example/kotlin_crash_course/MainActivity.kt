package com.example.kotlin_crash_course

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var results = findViewById<TextView>(R.id.results)
        var button = findViewById<Button>(R.id.bt)
        button.setOnClickListener {
            calculate(results)
        }
    }

    fun calculate(results: TextView) {
        var res = mutableListOf<Int>()
        var gen: Random = Random()
        var new_number = 1 + gen.nextInt(49)
        while (res.size < 6) {
            if (new_number !in res)
                res.add(new_number)
            else
                new_number = 1 + gen.nextInt(49)
        }
        results.setText(" ")
        for (i in res) {
            results.append("" + i + " ")
        }
    }
}



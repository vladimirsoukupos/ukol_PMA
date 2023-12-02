package com.example.ukol_pma

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class DisplayNumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_number)

        val numberTextView: TextView = findViewById(R.id.numberTextView)

        // Get the extras from the intent
        val name = intent.getStringExtra("name")
        val number = intent.getIntExtra("number", -1)

        // Set the text view with the drawn number
        numberTextView.text = "Number: $number"

        // Show a toast message
        if (number != -1) {
            Toast.makeText(this, "Vaše náhodné číslo, $name je číslo $number.", Toast.LENGTH_SHORT).show()
        }

        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish() // This will close the current activity and take you back to MainActivity
        }
    }
}

package com.example.ukol_pma
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val drawNumberButton: Button = findViewById(R.id.drawNumberButton)

        drawNumberButton.setOnClickListener {
            val randomNum = Random.nextInt(0, 100) // Random number between 0 and 99
            val name = nameEditText.text.toString()
            if (name.isNotEmpty()) {
                val intent = Intent(this, DisplayNumberActivity::class.java).apply {
                    putExtra("name", name)
                    putExtra("number", randomNum)
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Vložte své jméno", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

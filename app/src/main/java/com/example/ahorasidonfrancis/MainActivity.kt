package com.example.ahorasidonfrancis

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.employeeButton)
        btn.setOnClickListener{
            val intent: Intent = Intent(this, employeeActivityView:: class.java)
            startActivity(intent)
        }


        val adminButton = findViewById<Button>(R.id.adminButton)
        adminButton.setOnClickListener {
            startActivity(Intent(this, administratorActivityView::class.java))
        }


    }
}

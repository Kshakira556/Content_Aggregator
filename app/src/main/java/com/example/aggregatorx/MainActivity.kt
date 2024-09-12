package com.example.aggregatorx

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aggregatorx.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up click listeners
        binding.buttonConfigure.setOnClickListener {
            openConfigurationActivity()
        }

        binding.buttonViewContent.setOnClickListener {
            openContentDisplayActivity()
        }
    }

    private fun openConfigurationActivity() {
        val intent = Intent(this, ConfigurationActivity::class.java)
        startActivity(intent)
    }

    private fun openContentDisplayActivity() {
        val intent = Intent(this, ContentDisplayActivity::class.java)
        startActivity(intent)
    }
}

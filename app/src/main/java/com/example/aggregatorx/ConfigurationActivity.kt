package com.example.aggregatorx

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import com.example.aggregatorx.R

class ConfigurationActivity : AppCompatActivity() {

    private lateinit var scopeEditText: EditText
    private lateinit var sourceCheckBoxes: List<CheckBox>
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuration)

        // Initialize views
        scopeEditText = findViewById(R.id.editTextScope)
        saveButton = findViewById(R.id.buttonSave)
        sourceCheckBoxes = listOf(
            findViewById(R.id.checkBoxSource1),
            findViewById(R.id.checkBoxSource2),
            findViewById(R.id.checkBoxSource3)
            // Add more CheckBoxes as needed
        )

        // Set up listeners
        saveButton.setOnClickListener {
            savePreferences()
        }

        // Optionally, set up any default values or listeners
        scopeEditText.doAfterTextChanged { text ->
            // Handle text change if needed
        }
    }

    private fun savePreferences() {
        val scope = scopeEditText.text.toString()
        val selectedSources = sourceCheckBoxes.filter { it.isChecked }
            .map { it.text.toString() }

        // Save the user's preferences, for example using SharedPreferences or a database
        // Example using SharedPreferences
        val sharedPreferences = getSharedPreferences("AggregatorXPreferences", MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        editor.putString("contentScope", scope)
        editor.putStringSet("selectedSources", selectedSources.toSet())
        editor.apply()

        // Optionally, provide feedback to the user
        // Example: Toast.makeText(this, "Preferences saved", Toast.LENGTH_SHORT).show()
    }
}

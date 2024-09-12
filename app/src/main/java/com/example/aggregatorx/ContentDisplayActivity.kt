package com.example.aggregatorx

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.aggregatorx.adapters.ContentAdapter
import com.example.aggregatorx.models.Content // Import from your own models package

class ContentDisplayActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var contentAdapter: ContentAdapter
    private val contentList = mutableListOf<Content>() // Example list of content

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_display)

        // Initialize views
        recyclerView = findViewById(R.id.recyclerViewContent)
        contentAdapter = ContentAdapter(contentList)

        // Set up RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = contentAdapter

        // Load or fetch content here
        loadContent()
    }

    private fun loadContent() {
        // Example data
        val exampleContent = listOf(
            Content(title = "Title 1", description = "Description 1", url = "http://example.com/1"),
            Content(title = "Title 2", description = "Description 2", url = "http://example.com/2")
        )
        contentList.clear()
        contentList.addAll(exampleContent)
        contentAdapter.notifyDataSetChanged()
    }
}

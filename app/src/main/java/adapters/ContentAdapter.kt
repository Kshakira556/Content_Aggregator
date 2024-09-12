package com.example.aggregatorx.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aggregatorx.R
import com.example.aggregatorx.models.Content  // Importing the correct Content class

class ContentAdapter(private val contentList: List<Content>) : RecyclerView.Adapter<ContentAdapter.ContentViewHolder>() {

    // ViewHolder class to hold views for each item
    class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
        val descriptionTextView: TextView = itemView.findViewById(R.id.textViewDescription)
        val urlTextView: TextView = itemView.findViewById(R.id.textViewUrl)
    }

    // Inflate the item layout and create the ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_content, parent, false)
        return ContentViewHolder(itemView)
    }

    // Bind the data to the ViewHolder
    override fun onBindViewHolder(holder: ContentViewHolder, position: Int) {
        val content = contentList[position]
        holder.titleTextView.text = content.title
        holder.descriptionTextView.text = content.description
        holder.urlTextView.text = content.url

        // Handle URL click or any other interaction here
        holder.urlTextView.setOnClickListener {
            // Add code to handle URL click if needed
        }
    }

    // Return the size of the list
    override fun getItemCount() = contentList.size
}

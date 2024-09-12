package com.example.aggregatorx.utils

import com.example.aggregatorx.models.Content
import org.json.JSONObject
import java.lang.Exception

object DataUtils {

    /**
     * Parses a JSON object to create a Content instance.
     *
     * @param jsonObject The JSON object containing content data.
     * @return A Content instance or null if parsing fails.
     */
    fun parseContentFromJson(jsonObject: JSONObject): Content? {
        return try {
            val title = jsonObject.optString("title", "")
            val description = jsonObject.optString("description", "")
            val url = jsonObject.optString("url", "")

            if (title.isNotEmpty() && url.isNotEmpty()) {
                Content(
                    title = title,
                    description = description,
                    url = url
                )
            } else {
                null
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    /**
     * Converts a Content instance to a JSON object.
     *
     * @param content The Content instance to be converted.
     * @return A JSONObject representation of the Content.
     */
    fun contentToJson(content: Content): JSONObject {
        return JSONObject().apply {
            put("title", content.title)
            put("description", content.description)
            put("url", content.url)
        }
    }
}

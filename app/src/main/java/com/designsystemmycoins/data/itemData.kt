package com.designsystemmycoins.data

import com.example.designsystemmycoins.R

data class ItemData(
    var title: String = "state",
    var value: Double = 0.5,
    var year: Int = 2015,
    var conservationState: String = "FC",
    var imageRes: Int = R.drawable.ic_launcher_background
){
    fun getItem(): Map<String, Any> {
        return mapOf(
            "title" to title,
            "value" to value,
            "year" to year,
            "conservationState" to conservationState,
            "imageRes" to imageRes
        )
    }
}
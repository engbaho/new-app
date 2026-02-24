package com.example.lab1.domain

import androidx.annotation.DrawableRes

data class NewsItem(
    val title: String,
    val description: String,
    @param:DrawableRes val imageRes: Int
)
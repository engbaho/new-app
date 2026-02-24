package com.example.lab1.data

import com.example.lab1.R
import com.example.lab1.domain.NewsItem

class NewsRepository {
    fun getNews(): List<NewsItem> = listOf(
        NewsItem(
            title = "Campus Wi-Fi upgraded",
            description = "Faster access points were installed in the main building for smoother browsing.",
            imageRes = R.drawable.ic_wifi
        ),
        NewsItem(
            title = "Android Lab released",
            description = "Lab 01 is available. Build one activity that shows a list of news items.",
            imageRes = R.drawable.ic_android
        ),
        NewsItem(
            title = "Library extended hours",
            description = "The library will stay open later during midterms week.",
            imageRes = R.drawable.ic_library
        ),
        NewsItem(
            title = "Hackathon this weekend",
            description = "Teams can register online and compete with mobile/web projects.",
            imageRes = R.drawable.ic_trophy
        ),
        NewsItem(
            title = "New cafeteria menu",
            description = "New affordable meals and vegetarian options are now available.",
            imageRes = R.drawable.ic_food
        )
    )
}
package com.example.lab1.userinterface

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab1.R
import com.example.lab1.data.NewsRepository

class MainActivity : AppCompatActivity() {

    private val repository = NewsRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler: RecyclerView = findViewById(R.id.recyclerNews)

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = NewsAdapter(repository.getNews())


        recycler.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
    }
}
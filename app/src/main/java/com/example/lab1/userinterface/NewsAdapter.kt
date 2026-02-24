package com.example.lab1.userinterface

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab1.domain.NewsItem
import com.example.lab1.R

class NewsAdapter(
    private val items: List<NewsItem>
) : RecyclerView.Adapter<NewsAdapter.NewsVH>() {

    class NewsVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val img: ImageView = itemView.findViewById(R.id.imgNews)
        private val title: TextView = itemView.findViewById(R.id.txtTitle)
        private val desc: TextView = itemView.findViewById(R.id.txtDesc)

        fun bind(item: NewsItem) {
            img.setImageResource(item.imageRes)
            title.text = item.title
            desc.text = item.description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsVH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsVH(v)
    }

    override fun onBindViewHolder(holder: NewsVH, position: Int) = holder.bind(items[position])

    override fun getItemCount(): Int = items.size
}
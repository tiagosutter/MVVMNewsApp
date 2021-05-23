package com.androiddevs.mvvmnewsapp.responses

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)
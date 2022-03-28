package com.example.copia

sealed class NavigationItem(var route: String, var icon: Int, var title: String)
{
    object Watched : NavigationItem("watched", R.drawable.watched_icon, "Watched")
    object Watchlist : NavigationItem("watchlist", R.drawable.watchlist_icon, "Watchlist")
    object Feedback : NavigationItem("feedback", R.drawable.feedback_icon, "Feedback")
    object Recomendaciones : NavigationItem("recomendaciones", R.drawable.recom_icon, "Recomendaciones")
    object Top : NavigationItem("top", R.drawable.top_icon, "Top")
    object News : NavigationItem("news", R.drawable.news_icon, "News")

}
package com.muhammed.movieapp.presantation.movies

import com.muhammed.movieapp.domain.model.Movie

data class MoviesState(
    val isLoading : Boolean = false,
    val movies : List<Movie> = emptyList(),
    val error : String = "",
    val search : String = "superman"
) {
}
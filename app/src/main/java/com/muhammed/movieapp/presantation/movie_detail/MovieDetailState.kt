package com.muhammed.movieapp.presantation.movie_detail

import com.muhammed.movieapp.domain.model.MovieDetail

data class MovieDetailState(
    val isLoading : Boolean = false,
    val movie : MovieDetail? = null,
    val error : String = ""
)
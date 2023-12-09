package com.muhammed.movieapp.data.remote.dto

import com.muhammed.movieapp.domain.model.Movie

data class MoviesDto(
    val Response: String,
    val Search: List<Search>,
    val totalResults: String
)

/*
fun MoviesDto.toMovieList() :List<Movie> {
    return Search.map { search -> Movie(search.Poster,search.Title,search.Year,search.imdbID) }
}*/
//wen can write mapper extension funcction in dto class instead of mapper package

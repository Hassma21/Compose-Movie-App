package com.muhammed.movieapp.data.remote.mapper

import com.muhammed.movieapp.data.remote.dto.MovieDetailDto
import com.muhammed.movieapp.data.remote.dto.MoviesDto
import com.muhammed.movieapp.domain.model.Movie
import com.muhammed.movieapp.domain.model.MovieDetail

fun MovieDetailDto.toMovieDetail() : MovieDetail {
    return MovieDetail(
        Actors,Awards,Country,Director,Genre,Language,Poster,Rated,Released,Title,Type,Year,imdbRating
    )
}

fun MoviesDto.toMovieList() :List<Movie> {
    return Search.map { search -> Movie(search.Poster,search.Title,search.Year,search.imdbID) }
}
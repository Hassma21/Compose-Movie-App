package com.muhammed.movieapp.domain.repository

import com.muhammed.movieapp.data.remote.dto.MovieDetailDto
import com.muhammed.movieapp.data.remote.dto.MoviesDto

interface MovieRepository {
    suspend fun getMovies(serach :String) : MoviesDto
    suspend fun getMovieDetail(imdbId :String) : MovieDetailDto
}
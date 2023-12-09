package com.muhammed.movieapp.data.repository

import com.muhammed.movieapp.data.remote.MovieAPI
import com.muhammed.movieapp.data.remote.dto.MovieDetailDto
import com.muhammed.movieapp.data.remote.dto.MoviesDto
import com.muhammed.movieapp.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api : MovieAPI) : MovieRepository{
    override suspend fun getMovies(serach: String): MoviesDto {
       return api.getMovies(searchString = serach)
    }

    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imdbId)
    }
}
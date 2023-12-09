package com.muhammed.movieapp.data.remote

import com.muhammed.movieapp.data.remote.dto.MovieDetailDto
import com.muhammed.movieapp.data.remote.dto.MoviesDto
import com.muhammed.movieapp.util.Constant.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {

    @GET(".")//There is no any extension on endpoint thats why we can use "." or ""
    suspend fun getMovies(
        @Query("s") searchString : String,
        @Query("apikey") apiKey : String = API_KEY
    ) : MoviesDto

    @GET(".")
    suspend fun getMovieDetail(
        @Query("i") imdbId : String,
        @Query("apikey") apiKey : String = API_KEY
    ) : MovieDetailDto
}
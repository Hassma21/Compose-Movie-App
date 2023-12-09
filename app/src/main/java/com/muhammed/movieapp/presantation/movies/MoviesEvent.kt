package com.muhammed.movieapp.presantation.movies

sealed class MoviesEvent {
    data class Search(val searchString : String) : MoviesEvent()
}
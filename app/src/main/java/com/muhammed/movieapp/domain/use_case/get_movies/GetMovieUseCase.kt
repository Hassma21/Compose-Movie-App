package com.muhammed.movieapp.domain.use_case.get_movies

import com.muhammed.movieapp.data.remote.mapper.toMovieList
import com.muhammed.movieapp.domain.model.Movie
import com.muhammed.movieapp.domain.repository.MovieRepository
import com.muhammed.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOError

import javax.inject.Inject

class GetMovieUseCase @Inject constructor(private val repository: MovieRepository) {
    fun executeGetMovies(search :String) : Flow<Resource<List<Movie>>> = flow{
        try{
            emit(Resource.Loading())
            val movieList = repository.getMovies(search)
            if(movieList.Response == "True"){
                emit(Resource.Success(movieList.toMovieList()))
            }else{
                emit(Resource.Error(message = "Not Found Any Movie"))
            }

        }catch (e : IOError){
            emit(Resource.Error(message = "No Internet Connection"))
        }
        catch (e : IOError){
            emit(Resource.Error(message = e.localizedMessage ?: "Error"))
        }
    }
}
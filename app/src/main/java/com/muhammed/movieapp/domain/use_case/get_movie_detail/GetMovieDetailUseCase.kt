package com.muhammed.movieapp.domain.use_case.get_movie_detail

import com.muhammed.movieapp.data.remote.mapper.toMovieDetail
import com.muhammed.movieapp.data.remote.mapper.toMovieList
import com.muhammed.movieapp.domain.model.Movie
import com.muhammed.movieapp.domain.model.MovieDetail
import com.muhammed.movieapp.domain.repository.MovieRepository
import com.muhammed.movieapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOError
import javax.inject.Inject


class GetMovieDetailUseCase @Inject constructor(private val repository: MovieRepository) {
    fun executeMovieDetail(imdbId :String) : Flow<Resource<MovieDetail>> = flow{
        try{
            emit(Resource.Loading())
            val movieDetail = repository.getMovieDetail(imdbId)
            if(movieDetail.Response == "True"){
                emit(Resource.Success(data = movieDetail.toMovieDetail()))
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
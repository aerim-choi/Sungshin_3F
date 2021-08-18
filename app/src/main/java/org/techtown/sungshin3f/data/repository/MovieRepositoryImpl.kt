package org.techtown.sungshin3f.data.repository

import org.techtown.sungshin3f.data.api.MovieApi
import org.techtown.sungshin3f.domain.model.Movie
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext


class MovieRepositoryImpl(
    private val movieApi: MovieApi,
    private val dispatchers: CoroutineDispatcher
) : MovieRepository {

    override suspend fun getAllMovies(): List<Movie> = withContext(dispatchers) {
        movieApi.getAllMovies()
    }

    override suspend fun getMovies(movieIds: List<String>): List<Movie> = withContext(dispatchers) {
        movieApi.getMovies(movieIds)
    }
}

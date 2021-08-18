package org.techtown.sungshin3f.data.api

import org.techtown.sungshin3f.domain.model.Movie

interface MovieApi {

    suspend fun getAllMovies(): List<Movie>

    suspend fun getMovies(movieIds: List<String>): List<Movie>
}

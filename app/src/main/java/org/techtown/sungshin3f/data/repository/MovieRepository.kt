package org.techtown.sungshin3f.data.repository

import org.techtown.sungshin3f.domain.model.Movie

interface MovieRepository {

    suspend fun getAllMovies(): List<Movie>

    suspend fun getMovies(movieIds: List<String>): List<Movie>
}

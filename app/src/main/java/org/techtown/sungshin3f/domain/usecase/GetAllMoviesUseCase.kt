package org.techtown.sungshin3f.domain.usecase

import org.techtown.sungshin3f.data.repository.MovieRepository
import org.techtown.sungshin3f.domain.model.Movie

class GetAllMoviesUseCase(private val movieRepository: MovieRepository) {

    suspend operator fun invoke(): List<Movie> = movieRepository.getAllMovies()
}

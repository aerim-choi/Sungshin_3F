package org.techtown.sungshin3f.domain.usecase

import org.techtown.sungshin3f.data.repository.MovieRepository
import org.techtown.sungshin3f.data.repository.ReviewRepository
import org.techtown.sungshin3f.domain.model.FeaturedMovie

class GetRandomFeaturedMovieUseCase(
    private val movieRepository: MovieRepository,
    private val reviewRepository: ReviewRepository
) {

    suspend operator fun invoke(): FeaturedMovie? {
        val featuredMovies = movieRepository.getAllMovies()
            .filter { it.id.isNullOrBlank().not() }
            .filter { it.isFeatured == true }

        if (featuredMovies.isNullOrEmpty()) {
            return null
        }

        return featuredMovies.random()
            .let { movie ->
                val latestReview = reviewRepository.getLatestReview(movie.id!!)
                FeaturedMovie(movie, latestReview)
            }
    }
}

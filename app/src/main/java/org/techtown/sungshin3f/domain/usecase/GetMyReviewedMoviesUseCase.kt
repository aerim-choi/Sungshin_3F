package org.techtown.sungshin3f.domain.usecase

import org.techtown.sungshin3f.data.repository.MovieRepository
import org.techtown.sungshin3f.data.repository.ReviewRepository
import org.techtown.sungshin3f.data.repository.UserRepository
import org.techtown.sungshin3f.domain.model.ReviewedMovie
import org.techtown.sungshin3f.domain.model.User

class GetMyReviewedMoviesUseCase(
    private val userRepository: UserRepository,
    private val reviewRepository: ReviewRepository,
    private val movieRepository: MovieRepository
) {

    suspend operator fun invoke(): List<ReviewedMovie> {
        val user = userRepository.getUser()

        if (user == null) {
            userRepository.saveUser(User())
            return emptyList()
        }

        val reviews = reviewRepository.getAllUserReviews(user.id!!)
            .filter { it.movieId.isNullOrBlank().not() }

        if (reviews.isNullOrEmpty()) {
            return emptyList()
        }

        return movieRepository
            .getMovies(reviews.map { it.movieId!! })
            .mapNotNull { movie ->
                val relatedReview = reviews.find { it.movieId == movie.id }
                relatedReview?.let { ReviewedMovie(movie, it) }
            }
    }
}

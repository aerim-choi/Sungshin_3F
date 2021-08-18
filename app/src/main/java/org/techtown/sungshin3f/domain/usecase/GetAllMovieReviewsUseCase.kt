package org.techtown.sungshin3f.domain.usecase

import org.techtown.sungshin3f.data.repository.ReviewRepository
import org.techtown.sungshin3f.data.repository.UserRepository
import org.techtown.sungshin3f.domain.model.MovieReviews
import org.techtown.sungshin3f.domain.model.User

class GetAllMovieReviewsUseCase(
    private val userRepository: UserRepository,
    private val reviewRepository: ReviewRepository
) {

    suspend operator fun invoke(movieId: String): MovieReviews {
        val reviews = reviewRepository.getAllMovieReviews(movieId)
        val user = userRepository.getUser()

        if (user == null) {
            userRepository.saveUser(User())

            return MovieReviews(null, reviews)
        }

        return MovieReviews(
            reviews.find { it.userId == user.id },
            reviews.filter { it.userId != user.id }
        )
    }
}

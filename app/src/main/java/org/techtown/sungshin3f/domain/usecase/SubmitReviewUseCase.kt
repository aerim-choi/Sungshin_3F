package org.techtown.sungshin3f.domain.usecase

import org.techtown.sungshin3f.data.repository.ReviewRepository
import org.techtown.sungshin3f.data.repository.UserRepository
import org.techtown.sungshin3f.domain.model.Movie
import org.techtown.sungshin3f.domain.model.Review
import org.techtown.sungshin3f.domain.model.User

class SubmitReviewUseCase(
    private val userRepository: UserRepository,
    private val reviewRepository: ReviewRepository
) {

    suspend operator fun invoke(
        movie: Movie,
        content: String,
        score: Float
    ): Review {
        var user = userRepository.getUser()

        if (user == null) {
            userRepository.saveUser(User())
            user = userRepository.getUser()
        }

        return reviewRepository.addReview(
            Review(
                userId = user!!.id,
                movieId = movie.id,
                content = content,
                score = score
            )
        )
    }
}


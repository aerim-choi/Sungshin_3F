package org.techtown.sungshin3f.domain.usecase

import org.techtown.sungshin3f.data.repository.ReviewRepository
import org.techtown.sungshin3f.domain.model.Review

class DeleteReviewUseCase(
    private val reviewRepository: ReviewRepository
) {
    suspend operator fun invoke(review: Review) =
        reviewRepository.removeReview(review)
}

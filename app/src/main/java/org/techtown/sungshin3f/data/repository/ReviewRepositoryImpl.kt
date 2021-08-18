package org.techtown.sungshin3f.data.repository

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import org.techtown.sungshin3f.data.api.ReviewApi
import org.techtown.sungshin3f.domain.model.Review

class ReviewRepositoryImpl(
    private val reviewApi: ReviewApi,
    private val dispatchers: CoroutineDispatcher
) : ReviewRepository {

    override suspend fun getLatestReview(movieId: String): Review? = withContext(dispatchers) {
        reviewApi.getLatestReview(movieId)
    }

    override suspend fun getAllMovieReviews(movieId: String): List<Review> = withContext(dispatchers) {
        reviewApi.getAllMovieReviews(movieId)
    }

    override suspend fun getAllUserReviews(userId: String): List<Review> = withContext(dispatchers) {
        reviewApi.getAllUserReviews(userId)
    }

    override suspend fun addReview(review: Review): Review = withContext(dispatchers) {
        reviewApi.addReview(review)
    }

    override suspend fun removeReview(review: Review) = withContext(dispatchers) {
        reviewApi.removeReview(review)
    }
}

package org.techtown.sungshin3f.presentation.reviews

import org.techtown.sungshin3f.domain.model.Movie
import org.techtown.sungshin3f.domain.model.User
import org.techtown.sungshin3f.domain.model.MovieReviews
import org.techtown.sungshin3f.domain.model.Review
import org.techtown.sungshin3f.presentation.BasePresenter
import org.techtown.sungshin3f.presentation.BaseView

interface MovieReviewsContract {

    interface View : BaseView<Presenter> {

        fun showLoadingIndicator()

        fun hideLoadingIndicator()

        fun showErrorDescription(message: String)

        fun showMovieInformation(movie: Movie)

        fun showReviews(reviews: MovieReviews)

        fun showErrorToast(message: String)
    }

    interface Presenter : BasePresenter {

        val movie: Movie

        fun requestAddReview(content: String, score: Float)

        fun requestRemoveReview(review: Review)
    }
}

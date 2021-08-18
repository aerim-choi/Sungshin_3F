package org.techtown.sungshin3f.presentation.mypage

import org.techtown.sungshin3f.domain.model.ReviewedMovie
import org.techtown.sungshin3f.domain.model.User
import org.techtown.sungshin3f.presentation.BasePresenter
import org.techtown.sungshin3f.presentation.BaseView


interface MyPageContract {

    interface View : BaseView<Presenter> {

        fun showLoadingIndicator()

        fun hideLoadingIndicator()

        fun showNoDataDescription(message: String)

        fun showErrorDescription(message: String)

        fun showReviewedMovies(reviewedMovies: List<ReviewedMovie>)
    }

    interface Presenter : BasePresenter
}

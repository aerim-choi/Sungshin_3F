package org.techtown.sungshin3f.presentation.home

import org.techtown.sungshin3f.domain.model.FeaturedMovie
import org.techtown.sungshin3f.domain.model.Movie
import org.techtown.sungshin3f.presentation.BasePresenter
import org.techtown.sungshin3f.presentation.BaseView

interface HomeContract {

    interface View : BaseView<Presenter> {

        fun showLoadingIndicator()

        fun hideLoadingIndicator()

        fun showErrorDescription(message: String)

        fun showMovies(
            featuredMovie: FeaturedMovie?,
            movies: List<Movie>
        )
    }

    interface Presenter : BasePresenter
}

package org.techtown.sungshin3f.di

import android.app.Activity
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import org.techtown.sungshin3f.data.api.*
import org.techtown.sungshin3f.data.preference.PreferenceManager
import org.techtown.sungshin3f.data.repository.*
import org.techtown.sungshin3f.domain.model.Movie
import org.techtown.sungshin3f.domain.usecase.*
import org.techtown.sungshin3f.presentation.mypage.MyPageFragment
import org.techtown.sungshin3f.presentation.reviews.MovieReviewsContract
import org.techtown.sungshin3f.presentation.reviews.MovieReviewsFragment
import org.techtown.sungshin3f.presentation.reviews.MovieReviewsPresenter
import kotlinx.coroutines.Dispatchers
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import org.techtown.sungshin3f.data.preference.SharedPreferenceManager
import org.techtown.sungshin3f.presentation.home.HomeContract
import org.techtown.sungshin3f.presentation.home.HomeFragment
import org.techtown.sungshin3f.presentation.home.HomePresenter
import org.techtown.sungshin3f.presentation.mypage.MyPageContract
import org.techtown.sungshin3f.presentation.mypage.MyPagePresenter

val appModule = module {
    single { Dispatchers.IO }
}

val dataModule = module {
    single { Firebase.firestore }

    single<MovieApi> { MovieFirestoreApi(get()) }
    single<ReviewApi> { ReviewFirestoreApi(get()) }
    single<UserApi> { UserFirestoreApi(get()) }

    single<MovieRepository> { MovieRepositoryImpl(get(), get()) }
    single<ReviewRepository> { ReviewRepositoryImpl(get(), get()) }
    single<UserRepository> { UserRepositoryImpl(get(), get(), get()) }

    single { androidContext().getSharedPreferences("preference", Activity.MODE_PRIVATE) }
    single<PreferenceManager> { SharedPreferenceManager(get()) }
}

val domainModule = module {
    factory { GetRandomFeaturedMovieUseCase(get(), get()) }
    factory { GetAllMoviesUseCase(get()) }
    factory { GetAllMovieReviewsUseCase(get(), get()) }
    factory { GetMyReviewedMoviesUseCase(get(), get(), get()) }
    factory { SubmitReviewUseCase(get(), get()) }
    factory { DeleteReviewUseCase(get()) }
}

val presenterModule = module {
    scope<HomeFragment> {
        scoped<HomeContract.Presenter> { HomePresenter(getSource(), get(), get()) }
    }
    scope<MovieReviewsFragment> {
        scoped<MovieReviewsContract.Presenter> { (movie: Movie) ->
            MovieReviewsPresenter(movie, getSource(), get(), get(), get())
        }
    }
    scope<MyPageFragment> {
        scoped<MyPageContract.Presenter> { MyPagePresenter(getSource(), get()) }
    }
}

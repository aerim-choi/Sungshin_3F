package org.techtown.sungshin3f.presentation.mypage

import org.techtown.sungshin3f.domain.usecase.GetMyReviewedMoviesUseCase
import org.techtown.sungshin3f.presentation.mypage.MyPageContract
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import java.lang.Exception

class MyPagePresenter(
    private val view: MyPageContract.View,
    private val getMyReviewedMovies: GetMyReviewedMoviesUseCase
) : MyPageContract.Presenter {

    override val scope: CoroutineScope = MainScope()

    override fun onViewCreated() {
        fetchReviewedMovies()
    }

    override fun onDestroyView() {}

    private fun fetchReviewedMovies() = scope.launch {
        try {
            view.showLoadingIndicator()

            val reviewedMovies = getMyReviewedMovies()
            if (reviewedMovies.isNullOrEmpty()) {
                view.showNoDataDescription("아직 리뷰한 연극이 없어요.\n홈 탭을 눌러 연극을 리뷰해보세요 🙌")
            } else {
                view.showReviewedMovies(reviewedMovies)
            }
        } catch (exception: Exception) {
            exception.printStackTrace()
            view.showErrorDescription("에러가 발생했어요 😢")
        } finally {
            view.hideLoadingIndicator()
        }
    }
}

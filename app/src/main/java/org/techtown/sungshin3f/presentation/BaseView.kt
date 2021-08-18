package org.techtown.sungshin3f.presentation

interface BaseView<PresenterT : BasePresenter> {

    val presenter: PresenterT
}

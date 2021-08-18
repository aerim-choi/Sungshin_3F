package org.techtown.sungshin3f.domain.model

import org.techtown.sungshin3f.domain.model.Review

data class ReviewedMovie(
    val movie: Movie,
    val myReview: Review
)

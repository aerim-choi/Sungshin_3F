package org.techtown.sungshin3f.domain.model

import org.techtown.sungshin3f.domain.model.Review

data class MovieReviews(
    val myReview: Review?,
    val othersReview: List<Review>
)

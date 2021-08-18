package org.techtown.sungshin3f.domain.model

import org.techtown.sungshin3f.domain.model.Review

data class FeaturedMovie(
    val movie: Movie,
    val latestReview: Review?
)

package org.techtown.sungshin3f.domain.model

import com.google.firebase.firestore.DocumentId
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    @DocumentId
    val id: String? = null,

    @field:JvmField
    val isFeatured: Boolean? = null,

    val title: String? = null,
    val op_st_dt: String? = null,
    val op_ed_dt: String? = null,
    val op_at: String? = null,
    val place_nm: String? = null,
    val pay_at: String? = null,
    val posterUrl: String? = null,
    val averageScore: Float? = null,
    val numberOfScore: Int? = null,
    val releaseYear: Int? = null,
    val country: String? = null,
    val director: String? = null,
    val actors: String? = null,
    val genre : String? = null
) : Parcelable

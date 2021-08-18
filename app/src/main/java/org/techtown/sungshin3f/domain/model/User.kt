package org.techtown.sungshin3f.domain.model

import com.google.firebase.firestore.DocumentId

data class User(
    @DocumentId
    val id: String? = null
)

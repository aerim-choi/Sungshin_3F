package org.techtown.sungshin3f.data.api

import com.google.firebase.firestore.FirebaseFirestore
import org.techtown.sungshin3f.domain.model.User
import kotlinx.coroutines.tasks.await

class UserFirestoreApi(
    private val firestore: FirebaseFirestore
) : UserApi {

    override suspend fun saveUser(user: User): User =
        firestore.collection("users")
            .add(user)
            .await()
            .let { User(it.id) }
}

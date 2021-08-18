package org.techtown.sungshin3f.data.repository

import org.techtown.sungshin3f.domain.model.User

interface UserRepository {

    suspend fun getUser(): User?

    suspend fun saveUser(user: User)
}

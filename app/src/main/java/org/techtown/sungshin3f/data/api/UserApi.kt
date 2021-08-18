package org.techtown.sungshin3f.data.api

import org.techtown.sungshin3f.domain.model.User

interface UserApi {

    suspend fun saveUser(user: User): User
}

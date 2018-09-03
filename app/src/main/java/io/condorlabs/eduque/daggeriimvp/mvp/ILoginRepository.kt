package io.condorlabs.eduque.daggeriimvp.mvp

import io.condorlabs.eduque.daggeriimvp.models.User

interface ILoginRepository {

    fun user(): User

    fun saveUser(user: User)
}
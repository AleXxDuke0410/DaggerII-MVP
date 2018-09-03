package io.condorlabs.eduque.daggeriimvp.mvp

import io.condorlabs.eduque.daggeriimvp.models.User

class MemoryRepository : ILoginRepository {

    private var user: User? = null

    override fun user(): User {
        if (user == null) {
            return User("AleXx", "Duke")
        }

        return user as User
    }

    override fun saveUser(user: User) {
        if (user == null)
            this.user = user()
        else
            this.user = user
    }
}
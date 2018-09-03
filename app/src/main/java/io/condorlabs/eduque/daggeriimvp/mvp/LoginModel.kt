package io.condorlabs.eduque.daggeriimvp.mvp

import io.condorlabs.eduque.daggeriimvp.models.User

class LoginModel(private val loginRepository: ILoginRepository) : ILoginMVP.Model {

    override fun createUser(fName: String, lName: String) {
        loginRepository.saveUser(User(fName, lName))
    }

    override fun user(): User {
        return loginRepository.user()
    }
}
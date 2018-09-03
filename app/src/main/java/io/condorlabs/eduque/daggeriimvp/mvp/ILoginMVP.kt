package io.condorlabs.eduque.daggeriimvp.mvp

import io.condorlabs.eduque.daggeriimvp.models.User

interface ILoginMVP {

    interface View{
        fun firstName(): String
        fun lastName(): String

        fun firstName(fName: String)
        fun lastName(lName: String)

        fun showUserSavedMessage()
        fun showUserNotAvailable()
        fun showInputError()
    }

    interface Presenter {
        fun view(view: ILoginMVP.View?)

        fun loginButtonClicked()

        fun currentUser()
    }

    interface Model {

        fun createUser(fName: String, lName: String)

        fun user(): User
    }
}
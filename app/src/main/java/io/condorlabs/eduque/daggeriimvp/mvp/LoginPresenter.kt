package io.condorlabs.eduque.daggeriimvp.mvp

class LoginPresenter(private var model: ILoginMVP.Model) : ILoginMVP.Presenter {

    private var view: ILoginMVP.View? = null

    override fun view(view: ILoginMVP.View?) {
        this.view = view
    }

    override fun loginButtonClicked() {
        if (view != null) {
            if (view?.firstName().toString().equals("") || view?.lastName().toString().equals("")) {
                view?.showInputError()
            } else {
                model.createUser(view?.firstName().toString(), view?.lastName().toString())
                view?.showUserSavedMessage()
            }
        }
    }

    override fun currentUser() {
        val user = model.user()

        if (user == null) {
            if (view != null) {
                view?.showUserNotAvailable()
            }
        } else {
            if (view != null) {
                view?.firstName(user.name)
                view?.lastName(user.lastname)
            }
        }
    }
}
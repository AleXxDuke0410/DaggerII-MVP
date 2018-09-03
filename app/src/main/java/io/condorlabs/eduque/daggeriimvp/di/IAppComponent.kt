package io.condorlabs.eduque.daggeriimvp.di

import dagger.Component
import io.condorlabs.eduque.daggeriimvp.LoginActivity
import io.condorlabs.eduque.daggeriimvp.mvp.LoginModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, LoginModule::class])
interface IAppComponent {

    fun inject(loginActivity: LoginActivity)
}
package io.condorlabs.eduque.daggeriimvp.di

import android.app.Application
import io.condorlabs.eduque.daggeriimvp.mvp.LoginModule

class DaggerApp : Application(){

    private lateinit var component: IAppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerIAppComponent.builder()
                .appModule(AppModule(this))
                .loginModule(LoginModule())
                .build()
    }


    fun applicationComponent(): IAppComponent = component
}
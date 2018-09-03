package io.condorlabs.eduque.daggeriimvp.mvp

import dagger.Module
import dagger.Provides

@Module
class LoginModule {

    @Provides
    fun providePresenter(model: ILoginMVP.Model): ILoginMVP.Presenter = LoginPresenter(model)

    @Provides
    fun provideModel(repository: ILoginRepository): ILoginMVP.Model = LoginModel(repository)

    @Provides
    fun provideRepository(): ILoginRepository = MemoryRepository()
}
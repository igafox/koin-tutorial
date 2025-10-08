package jp.igafox.kointutorial.di

import jp.igafox.kointutorial.data.UserRepository
import jp.igafox.kointutorial.data.UserRepositoryImpl
import jp.igafox.kointutorial.ui.UserViewModel
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    singleOf(::UserRepositoryImpl) { bind<UserRepository>() }
    viewModelOf(::UserViewModel)
}

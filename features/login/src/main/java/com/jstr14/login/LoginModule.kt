package com.jstr14.login

import com.jstr14.login.data.LoginRepository
import com.jstr14.login.presentation.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import org.koin.core.context.GlobalContext.get

// Koin module for Login feature
val loginModule = module {
    // Provide singleton LoginRepository instance
    single { LoginRepository() }

    // Provide LoginViewModel with LoginRepository
    viewModel { LoginViewModel(get()) }
}
package com.jstr14.login.presentation

import androidx.lifecycle.ViewModel
import com.jstr14.login.data.LoginRepository

class LoginViewModel(private val repository: LoginRepository) : ViewModel() {

    fun login(username: String, password: String): Boolean {
        return repository.login(username, password)
    }
}
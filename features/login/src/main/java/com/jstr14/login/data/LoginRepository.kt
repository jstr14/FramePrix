package com.jstr14.login.data

class LoginRepository {
    fun login(username: String, password: String): Boolean {
        // authentication fake logic
        return username == "user" && password == "password"
    }
}
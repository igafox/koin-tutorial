package jp.igafox.kointutorial.ui

import androidx.lifecycle.ViewModel
import jp.igafox.kointutorial.data.UserRepository

class UserViewModel(private val repository: UserRepository) : ViewModel() {

    fun sayHello(name: String): String {
        val foundUser = repository.findUser(name)
        return foundUser?.let { "Hello '${it.name}' from ViewModel" } ?: "User '$name' not found!"
    }
}
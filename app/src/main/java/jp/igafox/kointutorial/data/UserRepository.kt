package jp.igafox.kointutorial.data

interface UserRepository {
    fun findUser(name: String): User?
    fun addUsers(users: List<User>)
}
package jp.igafox.kointutorial.data

class UserRepositoryImpl : UserRepository {

    private val _users = arrayListOf(
        User(name = "Alice"),
        User(name = "Bob"),
        User(name = "Charlie"),
        User(name = "David"),
        User(name = "Eve"),
        User(name = "Frank"),
    )

    override fun findUser(name: String): User? {
        return _users.firstOrNull { it.name == name }
    }

    override fun addUsers(users: List<User>) {
        _users.addAll(users)
    }
}
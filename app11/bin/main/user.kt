package user
import comment.*

class User(val name: String = "default username") {

    var comments = mutableListOf<Comment>()
    /*
        init{
            users.add(this)
        }

        companion object {
            var users: MutableSet<User> = mutableSetOf()
        }*/

}
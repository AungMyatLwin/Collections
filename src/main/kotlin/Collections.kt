
class Collections() {
    companion object {
        fun lists() {
            val immutableList = listOf<String>("Name 1", "Name 2", "Name 3")
            val mutableLists = mutableListOf<String>("Name 1", "Name 2", "Name 3")
            mutableLists.add("1")
            mutableLists.remove("1")
            mutableLists.removeAt(0)

            mutableLists.forEach { t -> println(t) }
        }
        fun sets() {
            val immutableSet = setOf("name1", "name1", "name1", "name1")
            immutableSet.forEach { s -> println(s) }

            val mutableSet =
                mutableSetOf(
                    "name1",
                    "name3",
                    "name2",
                    "name1",
                    "name3",
                    "name1",
                    "name2",
                    "name1"
                )
            mutableSet.add("name 4")
            mutableSet.forEach { ms -> println(ms) }

            val user = User("name1")
            val user1 = User("name2")
            val user2 = User("name3")
            val user3 = User("name4")
            val user4 = User("name5")
            val user5 = User("name5")

            val names = mutableSetOf<User>(user, user1, user2, user3, user4, user5)
            names.forEach { println(it.name) }
        }

        fun maps() {
            val users = mapOf<Int, String>(1 to "Maria",2 to "Alex", 3 to "John")
            val mutableUser = mutableMapOf<Int, String>(1 to "mm", 2 to "32", 3 to "4sfs")

            println(users[2])
            // cant add  like this
//            mutableUser.add( )
            mutableUser[5]= "45"
            mutableUser.remove(3)
            mutableUser.forEach { i, s -> println("$i and $s")  }
        }
    }
}
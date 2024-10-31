class Moderator(
    name: String
): PersonSuper(name, "Модератор") {
    override fun showInfo() {
        println("$name $role")
    }
}
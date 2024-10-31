open class PersonSuper (
    val name: String,
    val role: String
) {
    open fun showInfo() {
        println("$name $role")
    }
}
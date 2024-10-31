class Admin(
    name: String
): PersonSuper(name, "Адмиинистратор") {
    override fun showInfo() {
        println("$name $role")
    }
}
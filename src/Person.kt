open class Person (
    private var name: String
) {

    fun setName(newName: String) {
        this.name = newName
    }
    fun printName() {
        println(name)
    }

}
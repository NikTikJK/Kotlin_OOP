class Car( private val brand: String, private val year: Int) {
    fun printDetails() {
        println("марка: $brand, год выпуска: $year")
    }
}
class MathOperations {
    fun subtract(a: Int, b: Int): Double {
        val x: Double = a.toDouble() - b.toDouble()
        return x
    }
    fun subtract(a: Double, b: Double): Double {
        val x: Double = a - b
        return x
    }
    fun add(a: Int, b: Int): Double {
        val x: Double = a.toDouble() + b.toDouble()
        return x
    }
    fun add(a: Double, b: Double): Double {
        val x: Double = a + b
        return x
    }
    fun multiply(a: Int, b: Int): Double {
        val x: Double = a.toDouble() * b.toDouble()
        return x
    }
    fun multiply(a: Double, b: Double): Double {
        val x: Double = a * b
        return x
    }
    fun divide(a: Int, b: Int): Double {
        val x: Double = a.toDouble() / b.toDouble()
        return x
    }
    fun divide(a: Double, b: Double): Double {
        val x: Double = a / b
        return x
    }

}
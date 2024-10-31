import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("1 для проверки person," +
                " 2 для проверки student," +
                " 3 для математических операций," +
                " 4 для игры на гитаре," +
                " 5 для проверки суперкласса," +
                " 6 для проверки класса Animal," +
                " 7 для проверки класса Car" +
                " 0 для выхода")
        val input = scanner.nextInt()
        scanner.nextLine()

        when (input) {
            1 -> {
                val list = mutableListOf<Person>()
                println("какое число персон вы хотите ввести?")
                val n = scanner.nextInt()
                scanner.nextLine()

                repeat(n) {
                    print("введите имя: ")
                    val name = scanner.nextLine()
                    val person = Person(name)
                    list.add(person)
                }
                for (item in list) {
                    print("name: ")
                    item.printName()
                }
            }
            2 -> {
                val list = mutableListOf<Student>()
                println("какое число студентов вы хотите ввести?")
                val n = scanner.nextInt()
                scanner.nextLine()
                repeat(n) {
                    print("введите имя: ")
                    val name = scanner.next()
                    print("введите идентификатор: ")
                    val id: Int = scanner.nextInt()
                    val student = Student(id, name)
                    list.add(student)
                }
                for (item in list) {
                    item.printStudentDetails()
                }
            }
            3 -> {
                println("1 - Int, 2 - Double")
                var n = scanner.nextInt()
                scanner.nextLine()
                val math = MathOperations()
                when(n) {
                    1 -> {
                        println("1 - add, 2 - subtract, 3 - multiply, 4 - divide")
                        n = scanner.nextInt()
                        when (n) {
                            1 -> {
                                println("введите 2 числа")
                                println("1: ")
                                val a = scanner.nextInt()
                                println("2: ")
                                val b = scanner.nextInt()
                                println(math.add(a, b))
                            }
                            2 -> {
                                println("введите 2 числа")
                                println("1: ")
                                val a = scanner.nextInt()
                                println("2: ")
                                val b = scanner.nextInt()
                                println(math.subtract(a, b))
                            }
                            3 -> {
                                println("введите 2 числа")
                                println("1: ")
                                val a = scanner.nextInt()
                                println("2: ")
                                val b = scanner.nextInt()
                                println(math.multiply(a, b))
                            }
                            4 -> {
                                println("введите 2 числа")
                                println("1: ")
                                val a = scanner.nextInt()
                                println("2: ")
                                val b = scanner.nextInt()
                                println(math.divide(a, b))
                            }
                            else -> {
                                println("нет такого выбора")
                            }
                        }
                    }
                    2 -> {
                        println("1 - add, 2 - subtract, 3 - multiply, 4 - divide")
                        n = scanner.nextInt()
                        when (n) {
                            1 -> {
                                println("введите 2 числа")
                                println("1: ")
                                val a = scanner.nextDouble()
                                scanner.nextLine()
                                println("2: ")
                                val b = scanner.nextDouble()
                                scanner.nextLine()
                                println(math.add(a, b))
                            }
                            2 -> {
                                println("введите 2 числа")
                                println("1: ")
                                val a = scanner.nextDouble()
                                scanner.nextLine()
                                println("2: ")
                                val b = scanner.nextDouble()
                                scanner.nextLine()
                                println(math.subtract(a, b))
                            }
                            3 -> {
                                println("введите 2 числа")
                                println("1: ")
                                val a = scanner.nextDouble()
                                scanner.nextLine()
                                println("2: ")
                                val b = scanner.nextDouble()
                                scanner.nextLine()
                                println(math.multiply(a, b))
                            }
                            4 -> {
                                println("введите 2 числа")
                                println("1: ")
                                val a = scanner.nextDouble()
                                scanner.nextLine()
                                println("2: ")
                                val b = scanner.nextDouble()
                                scanner.nextLine()
                                println(math.divide(a, b))
                            }
                            else -> {
                                println("нет такого выбора")
                            }
                        }
                    }
                    else -> {
                        println("нет такого выбора")
                    }
                }
            }
            4 -> {
                val guitar = Guitar()
                println("введите play, что бы гитара заиграла")
                val line = scanner.nextLine()
                if (line == "play") {
                    guitar.play()
                }
            }
            5 -> {
                println("1 - создать Админа, 2 - создать Модератора")
                val n = scanner.nextInt()
                scanner.nextLine() // Добавить эту строку
                when (n) {
                    1 -> {
                        println("введите имя")
                        val name = scanner.nextLine()
                        val admin = Admin(name)
                        admin.showInfo()
                    }
                    2 -> {
                        println("введите имя")
                        val name = scanner.nextLine()
                        val moderator = Moderator(name)
                        moderator.showInfo()
                    }
                    else -> {
                        println("нет такого выбора")
                    }
                }
            }
            6 -> {
                println("введите число 1 - собака, 2 - кошка, 3 - птица ")
                val n =scanner.nextInt()
                scanner.nextLine()
                when (n) {
                    1 -> {
                        val dog = Dog()
                        dog.sound()
                    }
                    2 -> {
                        val cat = Cat()
                        cat.sound()
                    }
                    3 -> {
                        val bird = Bird()
                        bird.sound()
                    }
                    else -> {
                        println("нет такого выбора")
                    }
                }
            }
            7 -> {
                val list = mutableListOf<Car>()
                println("какое число машин вы хотите ввести?")
                val n = scanner.nextInt()
                scanner.nextLine()

                repeat(n) {
                    print("введите марку_год выпуска: ")
                    val info = scanner.nextLine()
                    val infoMas = info.split(" ")
                    val brand = infoMas[0]
                    val year = infoMas[1].toInt()
                    val car = Car(brand, year)
                    list.add(car)
                }
                for (item in list) {
                    item.printDetails()
                }
            }
            0 -> {
                break
            }
            else -> {
                println("вы ввели недопустимый символ")
            }
        }
    }
}
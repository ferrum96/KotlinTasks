package tasksBlock3

import java.lang.Math.sqrt

fun main(args: Array<String>) {

    //Задание 12 Високосный год
    fun task12() {
        println("Программа для определения високосного/невисокосного года");
        println("Введите год: ")
        val year: Int? = readLine()?.toInt()
        fun leapOrNotLeapYear(year: Int) {
            val isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
            if (isLeapYear) {
                println("$year является високосным годом.");
            } else
                println("$year не является високосным годом.");
        }
        leapOrNotLeapYear(year!!)
    }

    //Задание 13 Количество сотрудников
    fun task13() {
        val employees = arrayOf("Tom", "Bob", "Alice", "Вася", "Jack")

        fun printUsersCount(vararg employees: String) {
            println("Количество сотрудников равно: ${employees.size}")
        }
        printUsersCount(*employees)
    }

    //Задание 14 Инфо сотрудника
    fun task14() {
        fun employeesInformation(fio: String, position: String) = print("$fio\n$position")
        fun employeesInformation(fio: String, age: Int, position: String) = print("$fio\n$age\n$position")
        fun employeesInformation(fio: String, familyStatus: String, position: String) = print("$fio\n$familyStatus\n$position")
        fun employeesInformation(fio: String, age: Int, familyStatus: String, position: String) = print("$fio\n$age\n$familyStatus\n$position")

        employeesInformation("Стрелецкий Владимир Игорьевич", "Главный инженер-конструктор")
        println("\n")
        employeesInformation("Стрелецкий Владимир Игорьевич", 34, "Главный инженер-конструктор")
        println("\n")
        employeesInformation("Стрелецкий Владимир Игорьевич", "Женат", "Главный инженер-конструктор")
        println("\n")
        employeesInformation("Стрелецкий Владимир Игорьевич", 34, "Женат", "Главный инженер-конструктор")
    }

    //Задание 15 Лямбда
    fun task15() {
        val printer = { message: Array<String> -> message.forEach(System.out::println) }
        printer(arrayOf("Первый", "Второй", "Третий"))
    }

    //Задание 16 Корень числа
    fun task16() {
        val sqrtNum: (Double) -> Double = fun(x: Double): Double = sqrt(x)
        println(sqrtNum(100.0))
    }

    task12()
    //task13()
    //task14()
    //task15()
    //task16()
}
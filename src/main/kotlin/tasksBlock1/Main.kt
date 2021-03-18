package tasksBlock1

fun main(args: Array<String>) {

    //Задание 1 Переменные
    fun task1() {
        var something: Any? = null
        something = 5
        val something2 = something / 2.5
        println("Переменная something2 имеет тип данных: ${something2.javaClass}\n")
    }

    // Задание 2 Hello Aplana
    fun task2() {
        val word1: String? = "hello"
        val word2: String? = "aplana"

        println("$word1 $word2\n")
    }

    // Задание 3 Преобразование
    fun task3() {
        val five: Char = '5'

        println(five.toString())
        println(five.toByte())
        println(five.toShort())
        println(five.toInt())
        println(five.toDouble())
        println(five.toFloat())
        println(five.toLong())
        print("\n")
    }

    // Задание 4 Преобразование
    fun task4() {
        println("Введите ФИО и нажмите Enter:")
        val userText: String? = readLine()
        val stringText: String = userText.toString()
        print("Приветствую Вас $stringText")
        println()
    }

    // Задание 5 Алфавит
    fun task5() {
        val reversAlphabet = 'z' downTo 'a'
        for (letter in reversAlphabet)
            print("$letter ")
        println()
    }

    // Задание 6 Сравнение
    fun task6() {
        fun aMoreThenB(a: String?, b: String?): Boolean {
            return a?.toDouble()!! > b?.toDouble()!!
        }

        println("Введите число a: ")
        val a: String? = readLine()

        println("Введите число b: ")
        val b: String? = readLine()

        println("$a > $b = " + aMoreThenB(a, b))
        print("\n")
    }

    task1()
    //task2()
    //task3()
    //task4()
    //task5()
    //task6()

}
package tasksBlock2

fun main(args: Array<String>) {

    //Задание 7 Тест
    fun task7() {
        val questions: MutableList<String> = mutableListOf()
        questions.add("Жительницы Гавайев кладут цветы за правое ухо как сообщение, что они свободны, и чем больше цветов – тем сильнее желание познакомиться с мужчиной. Так ли это?")
        questions.add("По статистике, голладцы - самые высокие люди в мире.")
        questions.add("В течение своей жизни человек вырабатывает столько слюны, что ею можно заполнить около 4 бассейнов средних размеров.")
        questions.add("В среднем IQ женщин превышает показатели мужчин.")
        questions.add("Люди с серыми глазами лучше ориентируются в темноте.")
        questions.add("В Западном Китае в чай вместо сахара добавляют соль.")
        questions.add("Россия омывается 14 морями.")
        questions.add("Шахматы изобрели в России.")
        questions.add("У черепах нет пола.")
        questions.add("Расстояние от Земли до Луны – 384 401 метра.")
        questions.add("Самый большой в мире океан – Атлантический.")
        questions.add("Моцарт научился писать музыку раньше, чем слова.")

        val answers: MutableMap<String, String> = mutableMapOf()
        answers.put(questions.get(0), "1. Да, это так.\n2. Нет, чушь какая.")
        answers.put(questions.get(1), "1. Да.\n2. Нет.")
        answers.put(questions.get(2), "1. Да.\n2. Что за бред?")
        answers.put(questions.get(3), "1. Да, это так.\n2. Нет.")
        answers.put(questions.get(4), "1. Да, верно.\n2. Цвет глаз не имеет значения.")
        answers.put(questions.get(5), "1. Да, это так.\n2. Нет, это не так.")
        answers.put(questions.get(6), "1. Да.\n2. Нет.")
        answers.put(questions.get(7), "1. Нет.\n2. Конечно.")
        answers.put(questions.get(8), "1. Нет, это неверно.\n2. Да, это так.")
        answers.put(questions.get(9), "1. Да.\n2. Нет.")
        answers.put(questions.get(10), "1. Да, это так.\n2. Нет, это неверно.")
        answers.put(questions.get(11), "1. Это правда.\n2. Это миф.")

        val rightAnswers: MutableMap<String, String> = mutableMapOf()
        rightAnswers.put(questions.get(0), "1")
        rightAnswers.put(questions.get(1), "1")
        rightAnswers.put(questions.get(2), "2")
        rightAnswers.put(questions.get(3), "1")
        rightAnswers.put(questions.get(4), "2")
        rightAnswers.put(questions.get(5), "1")
        rightAnswers.put(questions.get(6), "2")
        rightAnswers.put(questions.get(7), "1")
        rightAnswers.put(questions.get(8), "1")
        rightAnswers.put(questions.get(9), "1")
        rightAnswers.put(questions.get(10), "2")
        rightAnswers.put(questions.get(11), "1")

        var rightCount = 0

        print("Тест на эрудицию\n")

        for (question in questions) {
            print("\nВведите номер правильного ответа:\n")
            println(question)
            println(answers[question])

            val answer: String? = readLine()
            if (answer!! == rightAnswers[question]) {
                print("Верно!\n")
                rightCount++
            } else print("Неверно!\n")
        }

        when (rightCount) {
            in 0..5 -> print("Ваш результат $rightCount/12.\nНемедленно включайте Дискавери и открывайте энциклопедию. Вы можете лучше!\n")
            in 6..9 -> print("Ваш результат $rightCount/12.\nКрепкий средний уровень – это о вас. Еще немного упорства, и вы станете эрудитом!\n")
            in 10..12 -> print("Ваш результат $rightCount/12.\nДа вы ходячая энциклопедия! Так держать!\n")
        }
    }

    //Задание 8 Проценты по вкладу
    fun task8() {
        println("Введите сумму вклада: ")
        var depositAtableount: Double? = readLine()?.toDouble()

        println("Введите длительность вклада(в месяцах): ")
        val durationDeposit: Int? = readLine()?.toInt()

        println("Введите ежемесячный процент: ")
        val tableonthPersent: Double? = readLine()?.toDouble()?.div(100)

        var profit = 0.0

        for (duration in 1..durationDeposit!!) {
            profit = Math.round(profit.plus(depositAtableount!! * tableonthPersent!!).minus(profit) * 100.0) / 100.0
            depositAtableount = Math.round(depositAtableount.plus(depositAtableount * tableonthPersent) * 100.0) / 100.0
            print("Сумма вклада за $duration месяц под " + tableonthPersent * 100 + " % равна: $depositAtableount. Прибыль за месяц составляет $profit\n")
        }
    }

    //Задание 9 Массив Стран
    fun task9() {
        val table = Array(3) { mutableListOf("").toTypedArray() }

        table[0] = arrayOf("Нидерланды", "Финляндия", "Турция", "Бангладеш", "Непал")
        table[1] = arrayOf("Амстердам", "Хельсинки", "Анкара", "Дакка", "Катманду")
        table[2] = arrayOf("EUR", "EUR", "TRY", "BDT", "NPR")

        val row = table.size
        val col = table[0].size
        val transTable = Array(col) { Array(row) { "" } }
        val transRow = transTable.size
        val transCol = transTable[0].size

        println("Страна | Столица | Валюта |")
        for (i in 0 until row) {
            for (j in 0 until col) {
                transTable[j][i] = table[i][j]
            }
        }

        for (i in 0 until transRow) {
            for (j in 0 until transCol) {
                print(transTable[i][j] + "\t|\t")
            }
            println()
        }
    }

    fun task10() {
        val towns: MutableList<String> = mutableListOf()
        val townsList: List<String> = towns
        var townsSet: Set<String>
        var townName: String?

        towns.add("Самара")
        towns.add("Курск")
        towns.add("Иркутск")
        towns.add("Самара")

        fun programMenu() {
            print(
                """Выберите из списка действий номер операции:

1. - Добавить название города

2. - Посмотреть в консоли список всех добавленных городов

3. - Посмотреть список добавленных городов без повторений

4. - Выход из программы

Введите номер:
""".trimIndent()
            )
        }

        fun addTown(townName: String) {
            towns.add(townName)
            print("Город $townName успешно добавлен! \n\n\n")
        }

        var exit = false
        while (!exit) {
            programMenu()
            when (readLine()) {
                "1" -> {
                    print("\n\nВведите название города: \n")
                    townName = readLine()
                    addTown(townName!!)
                }
                "2" -> {
                    print("\n\nСписок добавленных городов: \n\n")
                    for ((index, town) in townsList.withIndex())
                        println("${index + 1}. $town\n")
                }
                "3" -> {
                    print("\n\nСписок уникальных городов: \n\n")
                    townsSet = townsList.toSet()
                    for (town in townsSet)
                        println("${townsSet.indexOf(town) + 1}. $town\n")
                }
                "4" -> {
                    exit = true
                }
                else -> print(" Введенные данные некорректны. Попробуйте еще раз.\n\n")
            }
        }
    }

    //Задание 11 Рабочие места
    fun task11() {
        val workplaces: MutableMap<Int, String> = mutableMapOf()

        workplaces.put(1, "Савватеев Алексей Леонидович")
        workplaces.put(2, "Аксенов Максим Сергеевич")
        workplaces.put(3, "Иванов Иван Иванович")
        workplaces.put(4, "Панкратов Илья Алексеевич")
        workplaces.put(5, "Степанов Степан Степанович")

        fun employeeByWorkplaceNumber() {
            println("Количество рабочих мест: ${workplaces.size}")
            print("Введите номер рабочего места: \n")
            when(val number: Int? = readLine()?.toInt()){
                in 1..workplaces.size -> print("ФИО сотрудника с номером рабочего места $number: ${workplaces.get(number)}\n")
                else -> print("Вы ввели некорректный номер попробуйте еще раз!\n")
            }

        }

        employeeByWorkplaceNumber()
    }

    task7()
    //task8()
    //task9()
    //task10()
    //task11()
}
package tasksBlock4

class User : CommandList {

    fun startProgram(planesList: MutableList<Aircraft>) {
        var exit = false
        while (!exit) {
            programMenu()
            when (readLine()) {
                "1" -> {
                    print("\nСписок транспортных средств: \n\n")
                    for ((index, plane) in planesList.withIndex()) {
                        println("${index + 1}. $plane\n")
                    }
                }
                "2" -> {
                    print("\nВведите номер ТС: \n\n")
                    val plainNumber = readLine()
                    for (plane in planesList) {
                        if (plainNumber?.equals(plane.plainNumber.toString())!!) {
                                print("Информация по номеру: \n")
                                print("${plane.info()}\n\n")
                            }
                    }
                }
                "3" -> {
                    exit = true
                }
                else -> print(" Введенные данные некорректны. Попробуйте еще раз.\n\n")
            }
        }
    }
}
package tasksBlock4

fun main() {

    val planesList: MutableList<Aircraft> = mutableListOf()
    val plane1 = Boeing747(19530502761, 9800.0, 183380.0, 660)
    val plane2 = An124(19530502792, 4800.0, 212000.0, 120.0)
    planesList.add(plane1)
    planesList.add(plane2)

    val user = User()
    user.programMenu()
    user.startProgram(planesList)


    //val car = Car("Tesla model X", "Oceanic blue", "A 189 ВВ 157RUS")
    //println("\n$car")
}
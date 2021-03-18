package tasksBlock4

abstract class Aircraft(plainNumber: Long?, maximumRange: Double?, tankCapacity: Double?) {

    internal val plainNumber: Long? = plainNumber
    internal val maximumRange: Double? = maximumRange
    internal val tankCapacity: Double? = tankCapacity
    internal val fuelConsumptionPer100Km: Double?
        get() {
            return tankCapacity?.times(100.div(maximumRange!!))
        }

    open fun info() {
        val info: String = "Воздушное судно с номером $plainNumber имеет максимальную дальность полета " +
                "$maximumRange км с объемом бака $tankCapacity литров. \n" +
                "Расход топлива на 100 км: $fuelConsumptionPer100Km литров."
        print("\n$info")
    }

}


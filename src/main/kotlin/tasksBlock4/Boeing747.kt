package tasksBlock4

 data class Boeing747(val _plainNumber: Long, val _maximumRange: Double?, val _tankCapacity: Double?, override val passengerCapacity: Int) :
    Aircraft(_plainNumber, _maximumRange, _tankCapacity), Passenger {

     override fun info() {
        super.info()
        val passengers = "Количество пассажиров: $passengerCapacity"
        println("\n$passengers")
    }
}
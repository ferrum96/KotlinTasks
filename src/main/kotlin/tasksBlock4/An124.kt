package tasksBlock4

data class An124(val _plainNumber: Long, val _maximumRange: Double?, val _tankCapacity: Double?, override val tonnage: Double) :
    Aircraft(_plainNumber, _maximumRange, _tankCapacity), Cargo {

    override fun info() {
        super.info()
        val tonnage: String = "Грузоподъемность: $tonnage тонн"
        println("\n$tonnage")
    }
}
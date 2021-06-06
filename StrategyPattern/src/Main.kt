class Main {
    var travelStrategy:TravelStrategy? = null
    fun travel(){
        travelStrategy?.travel()
    }
}

fun main() {
    val main = Main()
    main.travelStrategy = TravelByBike()
    main.travelStrategy?.travel()
}

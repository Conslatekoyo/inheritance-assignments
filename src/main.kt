/*Create a class Car with the following attributes: make, model, color, capacity.
It has these functions:
-carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
number of people is within its capacity else it prints out “Over capacity
by $x people” where x is the number of people exceeding its capacity
(3 points)
-identity() : Prints out the color, make and modelin the following
format e.g:  “I am a white subaru legacy”(1 point)
-calculateParkingFees(hours: Int) : Calculates andreturns the
parking fees by multiplying the hours by 20(1 point)
2.Create a class Bus with the same attributes and functions as the Car class.
In addition, it has another method calledmaxTripFare(fare: Double) that
calculates and returns the maximum amount of fare that can be collected per
trip.(2 points)
The bus’calculateParkingFees method returns the productof hours and
the capacity of the bus(3 points)
Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
and call each of the functions on the objects.*/

fun main() {
    var car1=Car("Toyota","Sedan","red",5)
     car1.carry(8)
    car1.identity()
    car1.calculateParkingFees(6)
    var car2=Bus("Toyota","Scania","yellow",52)
    println(car2.calledMaxTripFares(100.20))
    println(car2.calculateParkingFees(6))
    }

 open class Car( var make:String, var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x=  people-capacity
        if(people<=5){
            println("Carry $people passengers.")
        }else{
            println("Over capacity by $x people.")
        }
    }
    fun identity() {
 println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int {
       var fees= hours*20
        println("The parking fees is $fees")
        return fees
    }
}

class Bus( make: String, model: String, color: String, capacity: Int):Car(make,model,color,capacity){
    fun calledMaxTripFares(fare:Double) :Double{
var money= fare*capacity
        return money
    }

    override fun calculateParkingFees(hours: Int): Int {

        var w= hours*capacity
        return w
    }
}
package use

import use.factory_imp.AddFactory
import use.factory_imp.MultiplicationFactory
class Main{

}
fun main() {
    val addCalculator = AddFactory.INSTANCE.create()
    val multiplicationCalculator = MultiplicationFactory.INSTANCE.create()
    //计算1+2+3+4+5
    println(addCalculator.calculate(1.0, 2.0, 3.0, 4.0, 5.0).toString())
    println(multiplicationCalculator.calculate(10.0, 13.0).toString())
}
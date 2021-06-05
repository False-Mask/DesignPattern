package use.product_imp

import use.factory_interface.Calculator

class AddCalculator : Calculator {
    override fun calculate(vararg a: Double): Double {
        var sum:Double = 0.0
        for (i in a){
            sum += i
        }
        return sum
    }
}
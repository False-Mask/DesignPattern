package use.product_imp

import use.factory_interface.Calculator

class MultiplicationCalculator : Calculator {
    override fun calculate(vararg a: Double): Double {
        var result = 1.0
        for (i in a){
            result /= i
        }
        return result
    }
}
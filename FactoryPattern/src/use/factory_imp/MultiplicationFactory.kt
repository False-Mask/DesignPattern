package use.factory_imp

import use.factory_interface.Calculator
import use.factory_interface.CalculatorFactory
import use.product_imp.MultiplicationCalculator

enum class MultiplicationFactory : CalculatorFactory {
    INSTANCE;
    override fun create(): Calculator {
        return MultiplicationCalculator()
    }
}
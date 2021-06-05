package use.factory_imp

import use.product_imp.AddCalculator
import use.factory_interface.Calculator
import use.factory_interface.CalculatorFactory

enum class AddFactory: CalculatorFactory {
    INSTANCE;
    override fun create(): Calculator {
        return AddCalculator()
    }
}
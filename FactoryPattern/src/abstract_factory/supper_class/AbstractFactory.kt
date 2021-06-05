package abstract_factory.supper_class

import abstract_factory.supper_class.ProductA
import abstract_factory.supper_class.ProductB
import abstract_factory.supper_class.ProductC

abstract class AbstractFactory {
    abstract val a: ProductA
    abstract val b: ProductB
    abstract val c: ProductC
    abstract fun createProductA(): ProductA
    abstract fun createProductB(): ProductB
    abstract fun createProductC(): ProductC
}
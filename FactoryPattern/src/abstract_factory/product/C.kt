package abstract_factory.product

import abstract_factory.supper_class.ProductC

class C : ProductC() {
    override fun doThree() {
        println("I am doing C")
    }
}
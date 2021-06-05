package abstract_factory.product

import abstract_factory.supper_class.ProductB

class B : ProductB() {
    override fun doTwo() {
        println("I am doing B")
    }
}
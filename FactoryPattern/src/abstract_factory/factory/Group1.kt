package abstract_factory.factory

import abstract_factory.supper_class.ProductA
import abstract_factory.supper_class.ProductB
import abstract_factory.supper_class.ProductC
import abstract_factory.product.A
import abstract_factory.product.B
import abstract_factory.product.C
import abstract_factory.supper_class.AbstractFactory

class Group1 : AbstractFactory(){
    override val a: ProductA = createProductA()
    override val b: ProductB = createProductB()
    override val c: ProductC = createProductC()

    override fun createProductA(): ProductA {
        return A()
    }

    override fun createProductB() : ProductB {
       return B()
    }

    override fun createProductC(): ProductC {
        return C()
    }

}
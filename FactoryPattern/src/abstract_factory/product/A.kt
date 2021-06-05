package abstract_factory.product

import abstract_factory.supper_class.ProductA

class A : ProductA() {
    override fun doOne(){
        println("I am doing A")
    }

}
package abstract_factory

import abstract_factory.concrete.factory.ConcreteFactory1
import abstract_factory.concrete.factory.ConcreteFactory2

fun main() {
    val factory1:AbstractFactory = ConcreteFactory1()
    val productA1 = factory1.createAbstractProductA()
    val productB1 = factory1.createAbstractProductB()
    println("$productA1  $productB1")


    val factory2:AbstractFactory = ConcreteFactory2()
    val productA2 = factory2.createAbstractProductA()
    val productB2 = factory2.createAbstractProductA()
    println("$productA2  $productB2")

}
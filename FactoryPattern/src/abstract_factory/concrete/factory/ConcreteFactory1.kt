package abstract_factory.concrete.factory

import abstract_factory.AbstractFactory
import abstract_factory.AbstractProductA
import abstract_factory.AbstractProductB
import abstract_factory.concrete.product.ConcreteProductA1
import abstract_factory.concrete.product.ConcreteProductB1

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  9:25
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteFactory1: AbstractFactory() {
    override fun createAbstractProductA(): AbstractProductA {
        return ConcreteProductA1()
    }

    override fun createAbstractProductB(): AbstractProductB {
        return ConcreteProductB1()
    }
}
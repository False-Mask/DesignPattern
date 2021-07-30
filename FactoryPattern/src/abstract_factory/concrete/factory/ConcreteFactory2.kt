package abstract_factory.concrete.factory

import abstract_factory.AbstractFactory
import abstract_factory.AbstractProductA
import abstract_factory.AbstractProductB
import abstract_factory.concrete.product.ConcreteProductA2
import abstract_factory.concrete.product.ConcreteProductB2

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  9:25
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteFactory2: AbstractFactory() {
    override fun createAbstractProductA(): AbstractProductA {
        return ConcreteProductA2()
    }

    override fun createAbstractProductB(): AbstractProductB {
        return ConcreteProductB2()
    }
}
package abstract_factory

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  9:23
 *@signature 我将追寻并获取我想要的答案
 */
abstract class AbstractFactory {
    abstract fun createAbstractProductA():AbstractProductA
    abstract fun createAbstractProductB():AbstractProductB
}
import concrete.element.ConcreteElementA
import concrete.element.ConcreteElementB

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  22:12
 *@signature 我将追寻并获取我想要的答案
 */
interface Visitor {
    fun visitConcreteElementA(concreteElementA: ConcreteElementA)
    fun visitConcreteElementB(concreteElementB: ConcreteElementB)
}
package concrete.visitor

import Visitor
import concrete.element.ConcreteElementA
import concrete.element.ConcreteElementB

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  23:29
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteVisitorB :Visitor {
    override fun visitConcreteElementA(concreteElementA: ConcreteElementA) {
        println("ConcreteVisitorB")
        concreteElementA.operate()
        println("------------------")
    }

    override fun visitConcreteElementB(concreteElementB: ConcreteElementB) {
        println("ConcreteVisitorB")
        concreteElementB.operate()
        println("-------------------")
    }
}
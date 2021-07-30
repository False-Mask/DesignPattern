package concrete.element

import Element
import Visitor

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  22:13
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteElementA:Element {
    override fun accept(visitor: Visitor) {
        visitor.visitConcreteElementA(this)
    }

    fun operate(){
        //ConcreteElementA的业务代码
        println("ConcreteElementA")
    }
}
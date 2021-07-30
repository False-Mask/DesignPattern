package concrete.element

import Element
import Visitor

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  22:14
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteElementB:Element {
    override fun accept(visitor: Visitor) {
        visitor.visitConcreteElementB(this)
    }

    fun operate(){
        //ConcreteElementB的业务代码
        println("ConcreteElementB")
    }
}
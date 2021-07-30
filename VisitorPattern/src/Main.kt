import concrete.ObjectStructure
import concrete.element.ConcreteElementA
import concrete.element.ConcreteElementB
import concrete.visitor.ConcreteVisitorA
import concrete.visitor.ConcreteVisitorB

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  23:28
 *@signature 我将追寻并获取我想要的答案
 */
fun main(){
    val visitor1:Visitor = ConcreteVisitorA()
    val visitor2:Visitor = ConcreteVisitorB()
    val element1:Element = ConcreteElementA()
    val element2:Element = ConcreteElementB()

    val objectStructure = ObjectStructure()
    objectStructure.add(element1)
    objectStructure.add(element2)

    //objectStructure.accept(visitor1)
    objectStructure.accept(visitor2)
}

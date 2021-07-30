import static_proxy.concrete.component.ConcreteComponent
import static_proxy.concrete.decorate.ConcreteDecoratorA
import static_proxy.concrete.decorate.ConcreteDecoratorB

fun main() {
    val component = ConcreteComponent()
    val decoratorA:Decorator = ConcreteDecoratorA(component)
    val decoratorB:Decorator = ConcreteDecoratorB(component)
    //可以扩展属性
    decoratorA.operate()
    println("---------------------")
    //可以扩展方法
    decoratorB.operate()
    println("---------------------")
    //还可以嵌套扩展。
    val decoratorAPlusB = ConcreteDecoratorA(
        decoratorB
    )
    decoratorAPlusB.operate()
}
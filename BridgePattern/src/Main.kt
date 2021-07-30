import static_proxy.concrete.Client
import static_proxy.concrete.ConcreteImplementorA
import static_proxy.concrete.ConcreteImplementorB
import static_proxy.concrete.RefinedAbstraction

fun main() {
    val client = Client()
    val impl1:Implementor = ConcreteImplementorA()
    val impl2:Implementor = ConcreteImplementorB()
    val abstraction:Abstraction = RefinedAbstraction(impl1)
    client.useOperation(abstraction)
    abstraction.impl = impl2
    client.useOperation(abstraction)
}

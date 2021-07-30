package static_proxy.concrete

fun main() {
    val mediator = ConcreteMediator.INSTANCE
    val colleague1 = ConcreteColleague1(mediator)
    val colleague2 = ConcreteColleague2(mediator)
    colleague1.sendMsg()
    colleague2.sendMsg()
}
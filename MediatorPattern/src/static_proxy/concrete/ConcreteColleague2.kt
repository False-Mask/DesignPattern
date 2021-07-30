package static_proxy.concrete

class ConcreteColleague2(private val mediator: Mediator) : Colleague {

    init {
        mediator.register(this::class.simpleName ?: "",this)
    }

    override fun sendMsg() {
        mediator.dealMsg(ConcreteColleague1::class.simpleName ?: "")
    }

    override fun doSome() {
        println("ConcreteColleague2 : made it")
    }
}
package static_proxy.concrete

class ConcreteColleague1(private val mediator: Mediator) : Colleague {
    init {
        mediator.register(this::class.simpleName ?: "",this)
    }

    override fun sendMsg() {
        mediator.dealMsg(ConcreteColleague2::class.simpleName ?: "")
    }

    override fun doSome() {
        println("ConcreteColleague1 : made it")
    }
}
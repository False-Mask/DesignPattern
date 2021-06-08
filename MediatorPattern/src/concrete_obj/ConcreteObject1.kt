package concrete_obj

import abstract_interface.Mediator
import abstract_interface.Object

class ConcreteObject1(val mediator: Mediator) : Object {
    init {
        mediator.register(ConcreteObject1::class.simpleName ?: "",this)
    }
    override fun sendMsg() {
        mediator.dealMsg(this::class.simpleName ?: "")
    }

    fun doOne() {
        println("ConcreteObject1:I am ConcreteObject1,now I have made it")
    }
}
package concrete_obj

import abstract_interface.Mediator
import abstract_interface.Object

class ConcreteObject2(val mediator: Mediator) : Object {
    init {
        mediator.register(ConcreteObject2::class.simpleName ?: "",this)
    }
    override fun sendMsg() {
        mediator.dealMsg(ConcreteObject1::class.simpleName ?: "")
    }

    fun doTwo() {
        println("ConcreteObject2:I am ConcreteObject2,now I have made it")
    }
}
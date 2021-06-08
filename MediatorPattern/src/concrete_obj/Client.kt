package concrete_obj

import abstract_interface.Mediator

class Client {
    fun doOne(){
        val mediator:Mediator = ConcreteMediator.INSTANCE
        mediator.dealClientRequest(this)
    }

    fun requestBack() {
        println("Client: I know")
    }

}

fun main() {
    val client:Client = Client()
    client.doOne()
}
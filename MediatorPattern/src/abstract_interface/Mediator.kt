package abstract_interface

import concrete_obj.Client

interface Mediator {
    fun dealMsg(s: String)
    fun register(key:String,value:Object)
    fun dealClientRequest(client: Client)
}
package static_proxy.concrete

interface Mediator {
    fun dealMsg(s: String)
    fun register(key:String,value: Colleague)
}
package concrete_obj

import abstract_interface.Mediator
import abstract_interface.Object

enum class ConcreteMediator : Mediator {
    INSTANCE;
    //处理client的需求
    override fun dealClientRequest(client: Client) {
        ConcreteObject1(this)
        ConcreteObject2(this)
        //先于obj1交互
        val obj1 = obj["ConcreteObject1"] as ConcreteObject1
        obj1.doOne()
        //obj1已经完成了
        val obj2 = obj["ConcreteObject2"] as ConcreteObject2
        obj2.doTwo()
        //告诉client已经完成了
        client.requestBack()
    }
    val obj:HashMap<String,Object> by lazy { hashMapOf() }
    override fun dealMsg(s: String) {

    }
    override fun register(key:String, value:Object){
        obj[key] = value
    }
}
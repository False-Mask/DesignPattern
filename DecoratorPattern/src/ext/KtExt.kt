package ext

import static_proxy.concrete.component.ConcreteComponent

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  21:26
 *@signature 我将追寻并获取我想要的答案
 */
fun ConcreteComponent.extensionalFunction(){
    operate()
    println("This is Kotlin extensionalFunction")
}

var ConcreteComponent.extensionalParam: String
    get() = "extensionalParam"
    set(value) {}
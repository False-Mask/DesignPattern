package ext

import static_proxy.concrete.component.ConcreteComponent

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  21:35
 *@signature 我将追寻并获取我想要的答案
 */
fun main() {
    val concreteComponent = ConcreteComponent()
    concreteComponent.extensionalParam = "10"
    println(concreteComponent.extensionalParam)
    println("----------------------------------")
    concreteComponent.extensionalFunction()
}
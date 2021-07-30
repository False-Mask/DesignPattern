package static_proxy.concrete.decorate

import Component
import Decorator

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  20:53
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteDecoratorA(component: Component) : Decorator(component) {
    private var addState:String = "fantastic"
    override fun operate() {
        component.operate()
        println("addState $addState")
    }
}
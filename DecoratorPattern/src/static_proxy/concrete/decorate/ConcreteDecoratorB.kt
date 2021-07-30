package static_proxy.concrete.decorate

import Component
import Decorator

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  20:54
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteDecoratorB(component: Component) : Decorator(component) {
    override fun operate() {
        component.operate()
        addBehavior()
    }

    private fun addBehavior() {
        println("addBehavior")
    }
}
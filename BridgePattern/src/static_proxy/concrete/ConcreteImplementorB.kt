package static_proxy.concrete

import Implementor

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  22:29
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteImplementorB: Implementor() {
    override fun operationImp() {
        println("ConcreteImplementorB")
    }
}
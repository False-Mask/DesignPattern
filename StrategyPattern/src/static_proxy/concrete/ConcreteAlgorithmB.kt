package static_proxy.concrete

import Strategy

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  15:33
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteAlgorithmB: Strategy() {
    override fun algorithm() {
        println("I am ConcreteAlgorithmB")
    }
}
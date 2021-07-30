package concrete

import Flyweight

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  17:25
 *@signature 我将追寻并获取我想要的答案
 */
class UnsharedConcreteFlyweight:Flyweight {
    val allState:String = "Unshared"
    override fun operation(extrinsicState: String) {
        println("extrinsicState $extrinsicState")
    }
}
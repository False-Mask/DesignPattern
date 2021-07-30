package concrete

import Flyweight

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  17:23
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteFlyweight :Flyweight {
    val intrinsicState:String = "Share"
    override fun operation(extrinsicState: String) {
        println("extrinsicState $extrinsicState")
    }
}
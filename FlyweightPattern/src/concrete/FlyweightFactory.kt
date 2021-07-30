package concrete

import Flyweight

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  17:26
 *@signature 我将追寻并获取我想要的答案
 */
object FlyweightFactory {

    private var flyweights:HashMap<String,Flyweight> = hashMapOf()

    fun getFlyweight(key:String): Flyweight {
        flyweights[key]?.let {
            return it
        }
        flyweights[key] = ConcreteFlyweight()
        return flyweights[key]!!
    }
}
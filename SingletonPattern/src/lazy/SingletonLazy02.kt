package lazy

import kotlin.concurrent.thread

/**
 *@author ZhiQiang Tu
 *@time 2021/7/27  17:29
 *@signature 我将追寻并获取我想要的答案
 */
class SingletonLazy02 {
    companion object{
        val INSTANCE:SingletonLazy02 by lazy { SingletonLazy02() }
    }

    fun doA(){
        println("Doing A")
    }
}

fun main() {

    for (i in 0..1000){
        thread {
            println(SingletonLazy02.INSTANCE)
        }
    }
}
package inner_static

import kotlin.concurrent.thread

/**
 *@author ZhiQiang Tu
 *@time 2021/7/27  20:18
 *@signature 我将追寻并获取我想要的答案
 */
class SingletonStatic01 {
    init {
        println("I am initialized")
    }
    class InnerClass{
        companion object{
            val INSTANCE = SingletonStatic01()
        }
    }

    companion object{
        @JvmStatic
        fun getInstance(): SingletonStatic01 {
            return InnerClass.INSTANCE
        }
    }
}

fun main() {
    //
    /*println("before")
    Thread.sleep(1000)
    println(SingletonStatic01.getInstance())
    Thread.sleep(1000)
    println("after")*/

    for (i in 0..1000)
        thread {
            println(SingletonStatic01.getInstance())
        }
}
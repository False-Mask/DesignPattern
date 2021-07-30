package inner_static

import kotlin.concurrent.thread

/**
 *@author ZhiQiang Tu
 *@time 2021/7/27  20:53
 *@signature 我将追寻并获取我想要的答案
 */
class SingletonStatic02 {
    object SingletonProvider{
        val INSTANCE = SingletonStatic02()
    }
    companion object{
        @JvmStatic
        fun getInstance(): SingletonStatic02 {
            return SingletonProvider.INSTANCE
        }
    }
}

fun main(){
    /*println("before")
    Thread.sleep(1000)
    println(SingletonStatic02.getInstance())
    Thread.sleep(1000)
    println("after")*/
    for (i in 0..1000){
        thread {
            println(SingletonStatic02.getInstance())
        }
    }
}
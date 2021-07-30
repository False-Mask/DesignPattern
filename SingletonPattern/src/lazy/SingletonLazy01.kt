package lazy

import kotlin.concurrent.thread

/**
 *@author ZhiQiang Tu
 *@time 2021/7/27  17:32
 *@signature 我将追寻并获取我想要的答案
 */
class SingletonLazy01 {
    companion object{
        @Volatile
        private var instance:SingletonLazy01? = null
        /*@JvmStatic
        @Synchronized
        fun getINSTANCE(): SingletonLazy01? {
            instance?.let {
                return it
            }

            instance = SingletonLazy01()
            return instance
        }*/
        @JvmStatic
        fun getINSTANCE():SingletonLazy01?{
            if (instance==null){
                @Synchronized
                if (instance == null){
                    instance = SingletonLazy01()
                }
            }
            return instance
        }
    }
}

fun main(){
    for (i in 1..1000){
        thread {
            println(SingletonLazy01.getINSTANCE())
        }
    }
}
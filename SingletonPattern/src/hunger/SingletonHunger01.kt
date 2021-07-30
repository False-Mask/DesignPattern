package hunger

/**
 *@author ZhiQiang Tu
 *@time 2021/7/27  17:03
 *@signature 我将追寻并获取我想要的答案
 */
class SingletonHunger01 /*private constructor()*/{
    companion object{
        @JvmStatic
        var instance:SingletonHunger01 = SingletonHunger01()
        private set
    }
    fun doA(){
        println("Singleton01-Hanger")
    }

}
fun main(){
    val singleton = SingletonHunger01::class.java

    with(singleton.getDeclaredConstructor()){
        isAccessible = true
        newInstance().doA()
    }

    SingletonHunger01.instance.doA()
}
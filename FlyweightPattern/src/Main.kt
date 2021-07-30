import concrete.FlyweightFactory

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  17:23
 *@signature 我将追寻并获取我想要的答案
 */
fun main() {
    val flyweight1 = FlyweightFactory.getFlyweight("a")
    flyweight1.operation("Demo1")
    println(flyweight1)
    println("----------------------------")
    val flyweight2 = FlyweightFactory.getFlyweight("b")
    flyweight2.operation("Demo2")
    println(flyweight2)
    println("----------------------------")
    val flyweight3 = FlyweightFactory.getFlyweight("a")
    flyweight3.operation("Demo3")
    println(flyweight3)
}
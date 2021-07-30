package simple_factory

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  0:14
 *@signature 我将追寻并获取我想要的答案
 */
fun main() {
    val factory = SimpleFactory.INSTANCE
    val product1 = factory.factoryMethod("Apple")
    val product2 = factory.factoryMethod("Banana")
    val product3 = factory.factoryMethod("Orange")
    val client = Client()

    with(client){
        eat(product1)
        eat(product2)
        eat(product3)
    }
}

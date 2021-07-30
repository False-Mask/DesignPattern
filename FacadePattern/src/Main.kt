/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  19:27
 *@signature 我将追寻并获取我想要的答案
 */
fun main() {
    val facade = Facade()
    val client = Client(facade)
    client.interactWithABC()
}
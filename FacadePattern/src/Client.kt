/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  19:13
 *@signature 我将追寻并获取我想要的答案
 */
class Client (private val facade: Facade){
    fun interactWithABC(){
        facade.dealClientRequest()
    }
}
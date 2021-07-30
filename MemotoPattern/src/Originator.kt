/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  20:13
 *@signature 我将追寻并获取我想要的答案
 */
class Originator(var state:String = "") {
    fun restoreMemoto(memoto: Memoto){
            state = memoto.state
    }

    fun createMemoto(): Memoto {
        return Memoto(this)
    }
}
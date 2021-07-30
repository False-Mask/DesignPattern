import java.lang.Exception
import java.util.*

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  20:15
 *@signature 我将追寻并获取我想要的答案
 */
class Caretaker {
    private val stack:Stack<Memoto> = Stack()
    fun addMemoto(memoto: Memoto){
        stack.add(memoto)
    }

    fun back(): Memoto? {
        return try{
            stack.pop()
        }catch (e:Exception){
            null
        }
    }
}
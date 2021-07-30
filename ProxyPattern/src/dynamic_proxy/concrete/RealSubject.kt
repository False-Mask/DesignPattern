package dynamic_proxy.concrete
import dynamic_proxy.Subject

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  10:47
 *@signature 我将追寻并获取我想要的答案
 */
class RealSubject : Subject {
    override fun request() {
        println("RealSubject")
    }
}
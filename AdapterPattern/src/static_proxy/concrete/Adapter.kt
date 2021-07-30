package static_proxy.concrete
import Target
/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  17:23
 *@signature 我将追寻并获取我想要的答案
 */
class Adapter(private val adaptee: Adaptee): Target {
    override fun request() {
        adaptee.specificRequest()
    }
}
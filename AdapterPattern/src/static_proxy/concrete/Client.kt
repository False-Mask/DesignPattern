package static_proxy.concrete
import Target
/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  17:20
 *@signature 我将追寻并获取我想要的答案
 */
class Client {
    fun useTarget(target: Target){
        target.request()
    }
}
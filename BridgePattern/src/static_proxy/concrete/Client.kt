package static_proxy.concrete

import Abstraction

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  22:22
 *@signature 我将追寻并获取我想要的答案
 */
class Client {
    fun useOperation(abstraction:Abstraction){
        abstraction.operation()
    }
}
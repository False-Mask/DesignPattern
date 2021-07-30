package static_proxy.concrete

import Abstraction
import Implementor

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  22:24
 *@signature 我将追寻并获取我想要的答案
 */
class RefinedAbstraction(impl: Implementor) : Abstraction(impl) {
    override fun operation() {
        impl.operationImp()
    }
}
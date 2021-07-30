package static_proxy.concrete

import static_proxy.Subject

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  10:47
 *@signature 我将追寻并获取我想要的答案
 */
class Proxy(private var realSubject:RealSubject) : Subject() {
    override fun request() {
        preRequest()
        realSubject.request()
        postRequest()
    }

    private fun postRequest() {
        println("postRequest")
    }

    private fun preRequest() {
        println("preRequest")
    }
}
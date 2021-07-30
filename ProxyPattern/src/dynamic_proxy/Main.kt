package dynamic_proxy

import dynamic_proxy.concrete.Invocation
import dynamic_proxy.concrete.RealSubject
import java.lang.reflect.Proxy

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  11:25
 *@signature 我将追寻并获取我想要的答案
 */
fun main() {
    System.getProperties()["jdk.proxy.ProxyGenerator.saveGeneratedFiles"] = "true"
    val realSubject:RealSubject = RealSubject()
    val proxy = Proxy.newProxyInstance(RealSubject::class.java.classLoader,
        arrayOf(Subject::class.java),
    Invocation(realSubject)) as Subject
    proxy.request()
}
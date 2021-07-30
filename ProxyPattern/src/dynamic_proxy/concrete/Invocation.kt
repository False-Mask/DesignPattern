package dynamic_proxy.concrete

import dynamic_proxy.Subject
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  11:30
 *@signature 我将追寻并获取我想要的答案
 */
class Invocation(private val realSubject: RealSubject) :InvocationHandler{

    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
        before()
        val o = method?.invoke(realSubject)
        after()
        return o
    }

    private fun after() {
        println("After")
    }

    private fun before() {
        println("Before")
    }
}
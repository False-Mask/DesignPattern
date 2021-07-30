package static_proxy.concrete

import static_proxy.Subject

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  10:50
 *@signature 我将追寻并获取我想要的答案
 */
class Client {
    fun useSubject(subject: Subject){
        subject.request()
    }
}
package static_proxy.concrete

import Subject

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  9:24
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteSubject : Subject() {
    var subjectState:String = "IDLE"

    fun startWorking(){
        while (true){
            Thread.sleep(1000)
            subjectState = "RUNNING"
            notifyChanged()
            Thread.sleep(1000)
            subjectState = "FINISH"
            notifyChanged()
            Thread.sleep(1000)
            subjectState = "IDLE"
            notifyChanged()
        }
    }
}
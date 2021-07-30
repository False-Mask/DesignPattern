package static_proxy.concrete

import Observer

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  9:32
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteObserver(
    private var subject:ConcreteSubject
):Observer {

    init {
        subject.attach(this)
    }

    private var observerState:String = "IDLE"
    override fun update() {
        observerState = subject.subjectState ?: "IDLE"
        println("ConcreteObserver : I got it subjectState $observerState")
    }

}
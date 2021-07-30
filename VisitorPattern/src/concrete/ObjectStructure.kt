package concrete

import Element
import Visitor

/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  22:16
 *@signature 我将追寻并获取我想要的答案
 */
class ObjectStructure {
    private val arrayList:ArrayList<Element> = arrayListOf()
    fun accept(visitor: Visitor){
        arrayList.forEach {
            it.accept(visitor)
        }
    }

    fun add(element: Element){
        arrayList.add(element)
    }

    fun remove(element: Element){
        arrayList.remove(element)
    }
}
/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  9:20
 *@signature 我将追寻并获取我想要的答案
 */
abstract class Subject {
    private val observers:ArrayList<Observer> = arrayListOf()
    fun attach(observer: Observer){
        observers.add(observer)
    }
    fun detach(observer: Observer){
        observers.remove(observer)
    }
    fun notifyChanged(){
        observers.forEach{
            it.update()
        }
    }
}
/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  20:24
 *@signature 我将追寻并获取我想要的答案
 */
fun main() {
    val originator = Originator("A")
    val caretaker = Caretaker()


    fun updateAndSave(originator: Originator,caretaker: Caretaker,s: String) {
        originator.state = s
        caretaker.addMemoto(originator.createMemoto())
        println(originator.state)
    }

    fun restore(caretaker:Caretaker,originator:Originator) {
        caretaker.back()?.let {
            originator.restoreMemoto(it)
        }
        println(originator.state)
    }

    //更新5次
    updateAndSave(originator,caretaker,"B")
    updateAndSave(originator,caretaker,"C")
    updateAndSave(originator,caretaker,"D")
    updateAndSave(originator,caretaker,"E")
    updateAndSave(originator,caretaker,"F")
    println("------------------------------")
    //撤销7次 并打印结果
    for (i in 1..7){
        restore(caretaker,originator)
    }

}

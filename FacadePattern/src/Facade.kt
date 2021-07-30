/**
 *@author ZhiQiang Tu
 *@time 2021/7/29  19:13
 *@signature 我将追寻并获取我想要的答案
 */
class Facade {
    private val subSystemA:SubSystemA = SubSystemA()
    private val subSystemB:SubSystemB = SubSystemB()
    private val subSystemC:SubSystemC = SubSystemC()
    fun dealClientRequest() {
        subSystemA.doA()
        subSystemB.doB()
        subSystemC.doC()
    }
}
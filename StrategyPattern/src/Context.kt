/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  15:54
 *@signature 我将追寻并获取我想要的答案
 */
class Context(var strategy:Strategy) {
    fun algorithm(){
        strategy.algorithm()
    }
}
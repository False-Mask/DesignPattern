/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  11:06
 *@signature 我将追寻并获取我想要的答案
 */
interface Builder {
    fun setOption1(string: String):Builder
    fun setOption2(float: Float):Builder
    fun setOption3(char: Char):Builder
    fun setOption4(byte: Byte):Builder
    fun setOption5(short: Short):Builder
    fun setOption6(boolean: Boolean):Builder
    fun build():Product
}
package static_builder

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  11:54
 *@signature 我将追寻并获取我想要的答案
 */
fun main() {
    val product = Product.ProductBuilder(1,2,3.0)
        .setOption1("Hello")
        .setOption2(4f)
        .setOption3('A')
        .setOption4(1)
        .setOption5(100)
        .setOption6(false)
        .build()

    println("${product.option1} ${product.option6}")

}
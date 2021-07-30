package static_proxy.concrete.builder

import Builder
import Product
import static_proxy.concrete.bean.ConcreteProduce

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  11:15
 *@signature 我将追寻并获取我想要的答案
 */
class ConcreteBuilder(
    private val necessary1:Int,
    private val necessary2:Long,
    private val necessary3:Double
):Builder {
    private var product:Product? = null

    init {
        product = ConcreteProduce(necessary1,necessary2,necessary3)
    }

    override fun build(): Product {
        return product!!
    }
    override fun setOption1(string: String): Builder {
        product?.option1 = string
        return this
    }

    override fun setOption2(float: Float): Builder {
        product?.option2 = float
        return this
    }

    override fun setOption3(char: Char): Builder {
        product?.option3 = char
        return  this
    }

    override fun setOption4(byte: Byte): Builder {
        product?.option4 = byte
        return this
    }

    override fun setOption5(short: Short): Builder {
        product?.option5 = short
        return this
    }

    override fun setOption6(boolean: Boolean): Builder {
        product?.option6 = boolean
        return this
    }
}
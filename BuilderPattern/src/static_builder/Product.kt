package static_builder

data class Product(
    val necessary1:Int,
    val necessary2:Long,
    val necessary3:Double
) {
    var option1:String? = null
    var option2:Float? = null
    var option3:Char? = null
    var option4:Byte? = null
    var option5:Short? = null
    var option6:Boolean? = null

    class ProductBuilder(
        necessary1:Int,
        necessary2:Long,
        necessary3:Double
    ){

        private var product:Product? = null

        init {
            product = Product(necessary1,necessary2,necessary3)
        }

        fun build(): Product {
            return product!!
        }
        fun setOption1(string: String): ProductBuilder {
            product?.option1 = string
            return this
        }

        fun setOption2(float: Float): ProductBuilder {
            product?.option2 = float
            return this
        }

        fun setOption3(char: Char): ProductBuilder {
            product?.option3 = char
            return  this
        }

        fun setOption4(byte: Byte): ProductBuilder {
            product?.option4 = byte
            return this
        }

        fun setOption5(short: Short): ProductBuilder {
            product?.option5 = short
            return this
        }

        fun setOption6(boolean: Boolean): ProductBuilder {
            product?.option6 = boolean
            return this
        }
    }
}
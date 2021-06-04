package abstract_factory.product

import abstract_factory.supper_class.ProductB
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

class B : ProductB() {
    override fun doTwo() {
        println("I am doing B")
    }
}
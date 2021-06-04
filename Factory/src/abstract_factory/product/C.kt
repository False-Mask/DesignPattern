package abstract_factory.product

import abstract_factory.supper_class.ProductC
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

class C : ProductC() {
    override fun doThree() {
        println("I am doing C")
    }
}
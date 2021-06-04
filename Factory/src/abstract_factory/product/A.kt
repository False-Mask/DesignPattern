package abstract_factory.product

import abstract_factory.supper_class.ProductA
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

class A : ProductA() {
    override fun doOne(){
        println("I am doing A")
    }

}
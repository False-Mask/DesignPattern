package factory_method

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println

class ConcreteProduct : Product {
    override fun doSomething() {
        println("I am concrete Product")
    }
}
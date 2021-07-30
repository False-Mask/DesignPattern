package simple_factory

import simple_factory.concrete.Apple
import simple_factory.concrete.Banana
import simple_factory.concrete.Orange
import java.lang.IllegalArgumentException

enum class SimpleFactory{
    INSTANCE;
    fun factoryMethod(args: String): simple_factory.Product {
        return when(args){
            "Apple"->Apple(args)
            "Orange"->Orange(args)
            "Banana"->Banana(args)
            else->throw IllegalArgumentException("暂时不提供生产~")
        }
    }
}

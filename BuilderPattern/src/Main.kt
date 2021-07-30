import static_proxy.concrete.builder.ConcreteBuilder

fun main() {


    val concreteProduce = ConcreteBuilder(1,2L,3.0)
        .setOption1("Hello")
        .setOption2(4f)
        .setOption3('A')
        .setOption4(1)
        .setOption5(100)
        .setOption6(false)
        .build()

    println("${concreteProduce.option1} ${concreteProduce.option6}")
}
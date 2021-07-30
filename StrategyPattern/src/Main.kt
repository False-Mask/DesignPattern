import static_proxy.concrete.ConcreteAlgorithmA
import static_proxy.concrete.ConcreteAlgorithmB

fun main() {

    val strategyA = ConcreteAlgorithmA()
    val strategyB = ConcreteAlgorithmB()

    val context = Context(strategyA)

    context.algorithm()
    context.strategy = strategyB
    context.algorithm()

}

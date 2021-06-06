import simple_factory.SimpleFactory

class FactoryMain {
}

fun main() {
    val factory = SimpleFactory.INSTANCE
    val product = factory.createProduct()
}
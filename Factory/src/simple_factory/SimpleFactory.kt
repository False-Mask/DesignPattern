package simple_factory

enum class SimpleFactory{
    INSTANCE;
    fun createProduct(): Product {
        return Product()
    }
}

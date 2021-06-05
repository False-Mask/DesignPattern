package factory_method

class ConcreteFactory : FactoryMethod{
    override fun create(): Product {
        return ConcreteProduct()
    }
}
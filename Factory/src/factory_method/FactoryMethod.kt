package factory_method
//工厂的接口
interface FactoryMethod {
    //返回一个产品
    fun create():Product
}
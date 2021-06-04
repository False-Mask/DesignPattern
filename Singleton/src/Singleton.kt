//内部实现了懒汉式的单例可以通过类名获取实例
//优点 ： 简单，JVM保证线程安全
//缺点 ： 不能防止反序列化。
object Singleton {
    val x =10
}

fun main() {
    println(Singleton.x)
}
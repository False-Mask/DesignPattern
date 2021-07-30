package hunger

object SingletonHunger02 {
    var x:Int = 1
    fun doA(){
        println("Singleton02-Hunger")
    }
}

fun main() {
    SingletonHunger02.doA()
    SingletonHunger02.x
    val singleton = SingletonHunger02::class.java
    /*with(singleton.getDeclaredConstructor()){
        isAccessible = true
        newInstance().doA()
    }*/
}
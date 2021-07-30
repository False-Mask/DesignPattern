class Main {
}

fun main() {
    val bean = Bean()
    val bean_ = bean.copy()
    bean_.args5.args1 = 10000
    println(bean)
    println(bean_)

    /*val deepCopy = DeepCopy()
    val deepCopy_ = deepCopy.clone() as DeepCopy
    deepCopy_.deepCopy2.a =100
    println(deepCopy)
    println(deepCopy_)*/
}
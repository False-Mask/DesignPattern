class Main {
}

fun main() {
    val bean = Bean()
    val copy = bean.copy()
    copy.args5.args1 = 3
    println(bean)
    println(copy)

    val deepCopy = DeepCopy()
    val deepCopy_ = deepCopy.clone() as DeepCopy
    deepCopy_.deepCopy2.a =100
    println(deepCopy)
    println(deepCopy_)
}
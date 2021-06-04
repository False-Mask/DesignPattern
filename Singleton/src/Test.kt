class A{
    var var1 = 1;
    var var2 ="var2"
}

fun main() {
    var a:A? = null
    var x = a?.let {
        "hello"
    } ?: "what ?? you are null ?? really ???"
    println(x)
}

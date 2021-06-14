import clothes.FashionDecorator
import watch.HuaWeiWatch
import watch.XiaoMiWatch

class Main {
}

fun main() {
    val people = People()
    val fashionDecorator = FashionDecorator(people)
    val huaWeiWatch = HuaWeiWatch(fashionDecorator)
    val xiaoMiWatch = XiaoMiWatch(huaWeiWatch)
    xiaoMiWatch.dance()
}
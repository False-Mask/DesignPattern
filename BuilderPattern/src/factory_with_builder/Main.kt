package factory_with_builder

import factory_with_builder.factory.HuaweiFactory
import factory_with_builder.factory.XiaoMiFactory
import factory_with_builder.product.HuaweiEarPhone

class Main {
}

fun main() {
    XiaoMiFactory.INSTANCE.createPhone().apply {
        println(this)
        call()
    }

    XiaoMiFactory.INSTANCE.createEarPhone().apply {
        this.playMusic()
    }

    XiaoMiFactory.INSTANCE.createLaptop().apply {
        this.work()
    }
    println()
    println("===================================================")
    println()
    HuaweiFactory.INSTANCE.createPhone().apply {
        println(this)
        call()
    }

    HuaweiFactory.INSTANCE.createLaptop().apply {
        this.work()
    }

    HuaweiFactory.INSTANCE.createEarPhone().apply {
        this.playMusic()
    }
}
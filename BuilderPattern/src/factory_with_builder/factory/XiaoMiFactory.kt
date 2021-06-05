package factory_with_builder.factory

import factory_with_builder.product.*

enum class XiaoMiFactory : ModernTechnologyFactory{
    INSTANCE;
    override fun createLaptop(): Laptop {
        return XiaoMiLaptop()
    }

    override fun createEarPhone(): EarPhone {
        return XiaoMiEarPhone()
    }

    override fun createPhone(): Phone {
        return XiaoMiPhone.PhoneBuilder()
            .setCoreCount(16)
            .setPowerCount(10000)
            .setRam(16)
            .setType("王者尊享版")
            .setProducer("小米")
            .build()
    }
}
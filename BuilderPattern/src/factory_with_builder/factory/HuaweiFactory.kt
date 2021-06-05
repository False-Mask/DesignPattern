package factory_with_builder.factory

import factory_with_builder.product.*

enum class HuaweiFactory : ModernTechnologyFactory {
    INSTANCE;
    override fun createLaptop(): Laptop {
        return HuaweiLaptop()
    }

    override fun createEarPhone(): EarPhone {
        return HuaweiEarPhone()
    }

    override fun createPhone(): Phone {
        return HuaweiMobile.Builder()
            .setCoreCount(18)
            .setPowerCount(10000)
            .setType("Huawei-P30")
            .setRam(16)
            .setProducer("HUAWEI")
            .build()
    }
}
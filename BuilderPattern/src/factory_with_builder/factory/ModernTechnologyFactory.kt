package factory_with_builder.factory

import factory_with_builder.product.EarPhone
import factory_with_builder.product.Laptop
import factory_with_builder.product.Phone

interface ModernTechnologyFactory{
    fun createLaptop(): Laptop
    fun createEarPhone(): EarPhone
    fun createPhone(): Phone
}
package factory_with_builder.product

import java.awt.image.ImageProducer

interface Phone {
    var powerCount: Int
    var ram: Int
    var type: String
    var coreCount: Int
    var producer: String
    fun call()

    interface PhoneBuilder{
        fun setPowerCount(powerCount:Int):PhoneBuilder
        fun setRam(ram:Int):PhoneBuilder
        fun setType(type:String):PhoneBuilder
        fun setCoreCount(coreCount:Int):PhoneBuilder
        fun setProducer(producer:String):PhoneBuilder
        fun build():Phone
    }

}
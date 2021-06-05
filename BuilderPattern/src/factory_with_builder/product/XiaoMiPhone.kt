package factory_with_builder.product

data class XiaoMiPhone(
    override var powerCount: Int= 0 ,
    override var ram: Int= 0 ,
    override var type: String= "XiaoMi",
    override var coreCount: Int = 0,
    override var producer: String ="小米"
) :Phone {
    override fun call() {
        println("This is XiaoMiPhone")
    }

    class PhoneBuilder():Phone.PhoneBuilder{
        private val phone = XiaoMiPhone()
        override fun setPowerCount(powerCount: Int): Phone.PhoneBuilder {
            phone.powerCount = powerCount
            return this
        }

        override fun setRam(ram: Int): Phone.PhoneBuilder {
            phone.ram = ram
            return this
        }

        override fun setType(type: String): Phone.PhoneBuilder {
            phone.type = type
            return this
        }

        override fun setCoreCount(coreCount: Int): Phone.PhoneBuilder {
            phone.coreCount = coreCount
            return this
        }

        override fun setProducer(producer: String): Phone.PhoneBuilder {
            phone.producer = producer
            return this
        }

        override fun build(): Phone {
            return phone
        }

    }

}
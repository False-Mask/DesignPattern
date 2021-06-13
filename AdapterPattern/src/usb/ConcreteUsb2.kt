package usb

class ConcreteUsb2 : Usb2Interface {
    override fun charge2() {
        println("I am using usb2Interface to charge")
    }
}
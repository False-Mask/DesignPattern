package usb

class ConcreteUsb1 : Usb1Interface {
    override fun charge1() {
        println("I am using usb1Interface to charge")
    }
}
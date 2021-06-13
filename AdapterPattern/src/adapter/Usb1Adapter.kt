package adapter

import usb.ConcreteUsb2
import usb.Usb1Interface

class Usb1Adapter(private val concreteUsb2: ConcreteUsb2) : Usb1Interface {
    override fun charge1() {
        concreteUsb2.charge2()
    }

}
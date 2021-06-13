package adapter

import usb.ConcreteUsb1
import usb.Usb2Interface

class Usb2Adapter(private val concreteUsb1: ConcreteUsb1) : Usb2Interface {

    override fun charge2() {
        concreteUsb1.charge1()
    }
}
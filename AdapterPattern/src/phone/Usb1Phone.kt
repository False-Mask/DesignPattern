package phone

import usb.Usb1Interface

class Usb1Phone {
    fun charge(usb1Interface: Usb1Interface){
        usb1Interface.charge1()
    }
}
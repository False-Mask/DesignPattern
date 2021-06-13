package phone

import usb.Usb2Interface

class Usb2Phone {
    fun charge(usb2Interface: Usb2Interface){
        usb2Interface.charge2()
    }
}
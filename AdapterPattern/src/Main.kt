import adapter.Usb1Adapter
import adapter.Usb2Adapter
import phone.Usb1Phone
import phone.Usb2Phone
import usb.ConcreteUsb1
import usb.ConcreteUsb2
import usb.Usb1Interface
import usb.Usb2Interface

class Main {
}

fun main() {
    val concreteUsb1: ConcreteUsb1 = ConcreteUsb1()
    val concreteUsb2: ConcreteUsb2 = ConcreteUsb2()

    val usb1: Usb1Interface = ConcreteUsb1()
    val usb2: Usb2Interface = ConcreteUsb2()

    val usb2Adapter: Usb2Adapter = Usb2Adapter(concreteUsb1)
    val usb1Adapter: Usb1Adapter = Usb1Adapter(concreteUsb2)

    val usb1Phone: Usb1Phone = Usb1Phone()
    val usb2Phone: Usb2Phone = Usb2Phone()

    usb2Phone.charge(usb2Adapter)
    usb1Phone.charge(usb1Adapter)
}
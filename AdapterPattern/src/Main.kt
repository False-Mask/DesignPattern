import static_proxy.concrete.Adaptee
import static_proxy.concrete.Adapter
import static_proxy.concrete.Client

fun main() {
    val adaptee = Adaptee()
    val adapter = Adapter(adaptee)
    val client = Client()
    client.useTarget(adapter)
}
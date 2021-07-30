package static_proxy

import static_proxy.concrete.Client
import static_proxy.concrete.Proxy
import static_proxy.concrete.RealSubject

fun main() {
    val client = Client()
    val realSubject:RealSubject = RealSubject()
    val subject:Subject = Proxy(realSubject)
    client.useSubject(subject)
}
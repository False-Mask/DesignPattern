import static_proxy.concrete.ConcreteObserver
import static_proxy.concrete.ConcreteSubject

fun main() {
    val concreteSubject = ConcreteSubject()
    val concreteObserver = ConcreteObserver(concreteSubject)
    concreteSubject.startWorking()
}
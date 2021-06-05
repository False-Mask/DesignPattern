import way2.PersonBuilderImp
import java.util.*

class Main {
}

fun main() {
    val person1 = PersonBuilderImp()
        .setAge(19)
        .setHeight(10000)
        .setWeight(10000000000)
        .setName("HaHa~")
        .build()

    val person2 = way1.Person.PersonBuilder()
        .setAge(20)
        .setHeight(10000)
        .setWeight(10000000000)
        .setName("HaHa~")
        .build()
    println(person1)
    println(person2)
}
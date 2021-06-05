package way1

import way2.PersonBuilder
import java.util.*

data class Person(var name: String =""
                  , var age:Int = 0
                  , var height:Long = 0
                  , var weight:Long = 0){

    class PersonBuilder{
        private val person = Person()
        fun setName(name: String): PersonBuilder {
            person.name = name
            return this
        }

        fun setAge(age: Int): PersonBuilder {
            person.age = age
            return this
        }

        fun setWeight(weight: Long): PersonBuilder {
            person.weight = weight
            return  this
        }

        fun setHeight(height: Long): PersonBuilder {
            person.height = height
            return this
        }

        fun build(): Person {
            return person
        }
    }
}
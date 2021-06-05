package way2

interface PersonBuilder {
    fun setName(name:String): PersonBuilder
    fun setAge(age:Int):PersonBuilder
    fun setWeight(weight:Long):PersonBuilder
    fun setHeight(height:Long):PersonBuilder
    fun build():Person
}
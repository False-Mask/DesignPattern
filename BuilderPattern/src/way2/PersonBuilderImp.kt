package way2

class PersonBuilderImp : PersonBuilder{
    private val person = Person()
    override fun setName(name: String): PersonBuilder {
        person.name = name
        return this
    }

    override fun setAge(age: Int): PersonBuilder {
        person.age = age
        return this
    }

    override fun setWeight(weight: Long): PersonBuilder {
        person.weight = weight
        return  this
    }

    override fun setHeight(height: Long): PersonBuilder {
        person.height = height
        return this
    }

    override fun build(): Person {
       return person
    }
}
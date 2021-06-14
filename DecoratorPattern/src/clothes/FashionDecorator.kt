package clothes
import Obj

class FashionDecorator(obj: Obj) : ClothesDecorator(obj) {
    override fun dance() {
        println("穿上了流行服装......")
        obj.dance()
    }
}
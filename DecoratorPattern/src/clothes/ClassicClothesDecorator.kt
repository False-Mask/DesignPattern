package clothes

import Obj

class ClassicClothesDecorator(obj: Obj) : ClothesDecorator(obj) {
    override fun dance() {
        println("穿上了古典服饰......")
        obj.dance()
    }

}
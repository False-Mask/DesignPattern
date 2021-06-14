package watch

import Obj

class HuaWeiWatch(obj: Obj) : WatchDecorator(obj) {
    override fun dance() {
        println("戴上了华为手表")
        obj.dance()
    }
}
package watch

import Obj

class XiaoMiWatch(obj: Obj) : WatchDecorator(obj) {
    override fun dance() {
        println("戴上了小米手表......")
        obj.dance()
    }

}
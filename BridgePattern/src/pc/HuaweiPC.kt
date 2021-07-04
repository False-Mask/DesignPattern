package pc

import app.APP

class HuaweiPC(
    private val pc: PCInterface,
): PC() {
    init {
        this.pcImp = pc
    }
    override fun runApp() {
        pcImp.runApp()
    }
}
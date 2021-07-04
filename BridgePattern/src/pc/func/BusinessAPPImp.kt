package pc.func

import app.APP
import pc.PCInterface

class BusinessAPPImp(
    private val app: APP
) : PCInterface {
    override fun runApp() {
        println("欢迎使用商务软件...")
        app.run()
        println()
    }
}
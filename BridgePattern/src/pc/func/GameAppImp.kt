package pc.func

import app.APP
import pc.PCInterface

class GameAppImp(
    private val app: APP
) : PCInterface {
    override fun runApp() {
        println("欢迎来到王者荣耀...")
        app.run()
        println()
    }
}
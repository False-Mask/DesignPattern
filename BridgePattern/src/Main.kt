import app.APP
import pc.func.BusinessAPPImp
import pc.HuaweiPC
import pc.PC
import pc.func.GameAppImp

class Main {

}

fun main() {
    val pc:PC = HuaweiPC(BusinessAPPImp(APP("hh","business")))
    pc.runApp()
    println("----------------------------------------------------------------")
    pc.pcImp = GameAppImp(APP("王者农药","game"))
    pc.runApp()
}

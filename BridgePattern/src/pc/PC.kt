package pc

abstract class PC {
    lateinit var pcImp: PCInterface
    abstract fun runApp()
}
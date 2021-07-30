package static_proxy.concrete

enum class ConcreteMediator : Mediator {
    INSTANCE;

    private val list:HashMap<String, Colleague> by lazy { hashMapOf() }

    override fun dealMsg(s: String) {
        val who = list[s]
        who?.doSome()
    }

    override fun register(key:String, value: Colleague){
        list[key] = value
    }
}
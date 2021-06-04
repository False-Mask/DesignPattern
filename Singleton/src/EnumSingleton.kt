/**
 * 1 防止反序列化
 * 2 保证只有一个实例
 * 3 JVM保证线程安全
 */
enum class EnumSingleton {
    INSTANCE;
    fun getInstance(): EnumSingleton {
        return INSTANCE
    }
}
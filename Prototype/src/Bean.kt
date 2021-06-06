data class Bean(
    var args1:Int = 0,
    var args2:Long = 0,
    var args3:String = "0",
    var args4:Char = '0',
    var args5:Bean2 = Bean2()
) {
    data class Bean2(
        var args1:Int = 1,
        var args2: Long = 2,
        var args3:Char = '3',
        var args4:String = "4"
    ){

    }
}

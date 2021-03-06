class DeepCopy(var a:Int = 1, var b:Long =2, var deepCopy2: DeepCopy2 = DeepCopy2()) : Cloneable{
    public override fun clone(): Any {
        //浅克隆deepCopy
        val deepCopy:DeepCopy = super.clone() as DeepCopy
        //由于是浅克隆所以第一步克隆的是引用，所以得重新克隆。
        deepCopy.deepCopy2 = deepCopy2.clone() as DeepCopy2
        return deepCopy
    }

    override fun toString(): String {
        return "DeepCopy(a=$a, b=$b, deepCopy2=$deepCopy2)"
    }

}

class DeepCopy2(var a:Int =1,var b:Int =2) :Cloneable{
    public override fun clone(): Any {
        return super.clone()
    }

    override fun toString(): String {
        return "DeepCopy2(a=$a, b=$b)"
    }

}
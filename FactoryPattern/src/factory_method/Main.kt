package factory_method

import factory_method.concrete.button.RectangleButton
import factory_method.concrete.button.RoundedButton
import factory_method.concrete.factory.OvalButtonFactory
import factory_method.concrete.factory.RectangleButtonFactory
import factory_method.concrete.factory.RhombicButtonFactory
import factory_method.concrete.factory.RoundedButtonFactory

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  8:45
 *@signature 我将追寻并获取我想要的答案
 */
class Main {
}

fun main() {
    val ovalButtonFactory = OvalButtonFactory.INSTANCE
    val ovalButton = ovalButtonFactory.produce()

    val rectangleButtonFactory = RectangleButtonFactory.INSTANCE
    val rectangleButton  = rectangleButtonFactory.produce()

    val rhombicButtonFactory = RhombicButtonFactory.INSTANCE
    val rhombicButton = rhombicButtonFactory.produce()

    val roundedButtonFactory = RoundedButtonFactory.INSTANCE
    val roundedButton = roundedButtonFactory.produce()

    println(ovalButton)
    println(rectangleButton)
    println(rhombicButton)
    println(roundedButton)
}
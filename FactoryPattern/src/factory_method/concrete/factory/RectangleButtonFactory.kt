package factory_method.concrete.factory

import factory_method.Button
import factory_method.ButtonFactory
import factory_method.concrete.button.RectangleButton

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  8:40
 *@signature 我将追寻并获取我想要的答案
 */
enum class RectangleButtonFactory:ButtonFactory {
    INSTANCE;
    override fun produce(): Button = RectangleButton()
}
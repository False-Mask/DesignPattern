package factory_method.concrete.factory

import factory_method.Button
import factory_method.ButtonFactory
import factory_method.concrete.button.RoundedButton

/**
 *@author ZhiQiang Tu
 *@time 2021/7/28  8:40
 *@signature 我将追寻并获取我想要的答案
 */
enum class RoundedButtonFactory:ButtonFactory {
    INSTANCE;
    override fun produce(): Button = RoundedButton()
}
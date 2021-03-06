# Pre-设计模式


## UML图基础

> 为什么要学UML？目的何在？
>
> 如果你看过设计模式的一些书籍你会发现。随着内容慢慢深入，代码基本上渐渐消失了。全部都是以UML图形来表示设计模式。如果看不懂UML那设计模式学起来就会很吃力。



### 类、接口表示

#### 类图

我们熟知，类存在3个比较重要的元素。

- 类名
- 属性
- 方法/函数

比如一个学生类的类图可以这样表示。

![image-20210721091328146](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210721091328146.png)

分成3个部分：

最上面的部分是类名

中间是属性（成员变量）

最下面是方法（成员方法）



其中成员方法，成员函数都按照这样的格式书写

```
[可见性]名称(参数列表)[:返回类型]
```



类图中，需注意以下几点：

- 抽象类或抽象方法用斜体表示
- 如果是接口，则在类名上方加 <<Interface>>
- 字段和方法返回值的数据类型非必需
- 静态类或静态方法加下划线
- -,+,#,~分别对应可见性：private，public，protected，default

抽象类

![image-20210721193347433](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210721193347433.png)

接口

![image-20210721193302353](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210721193302353.png)

### 类之间的关系

UML 将事物之间的联系归纳为 6 种，并用对应的图形类表示。下面根据类与类之间的耦合度从弱到强排列。UML 中的类图有以下几种关系：**依赖关系、关联关系、聚合关系、组合关系、泛化关系和实现关系**。其中泛化和实现的耦合度相等，它们是最强的。



#### 依赖关系

可以简单的理解，就是一个类A使用到了另一个类B，而这种使用关系是具有**偶然性的、临时性的、非常弱的**。**但是B类的变化会影响到A**。表现在代码层面，为类B作为参数被类A在某个method方法中使用； 
![img](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/Dependence.jpg)



#### 关联关系

关联（Association）关系是对象之间的一种引用关系，用于表示一类对象与另一类对象之间的联系，如老师和学生、师傅和徒弟、丈夫和妻子等。

![image-20210721203002649](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210721203002649.png)

##### 1.双向关联

![image-20210721203329110](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210721203329110.png)

##### 2.单向关联

##### 3.自关联

有没有单向链表的既视感。

![image-20210721203524114](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210721203524114.png)

##### 4.聚合关系

![image-20210721203916325](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210721203916325.png)

##### 5.组合关系

![image-20210721204503653](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210721204503653.png)



#### 泛化关系

![image-20210721205034098](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210721205034098.png)

#### 接口与实现关系

![image-20210721213953368](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210721213953368.png)





![image-20210721214053214](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210721214053214.png)

一个接口继承自另一个接口，一个接口依赖另一个接口

接口继承

```kotlin
interface InterfaceA {
    fun doA()
}

interface InterfaceB : InterfaceA {
    fun doB()
}

interface InterfaceC : InterfaceA {
    fun doC()
}
```

接口依赖

```kotlin
interface InterfaceA {
    fun doA()
}

interface InterfaceB {
    fun doB(interfaceA: InterfaceA)
}
```

 

### 类关系记忆技巧

|                             分类                             | 箭头特征                                      | 记忆技巧                                                     |
| :----------------------------------------------------------: | --------------------------------------------- | ------------------------------------------------------------ |
|                           箭头方向                           | 从子类指向父类                                | 定义子类需要通过 extends 关键字指定父类子类一定是知道父类定义的，但父类并不知道子类的定义只有知道对方信息时才能指向对方箭头的方向是从子类指向父类 |
|                          继承/实现                           | 用线条连接两个类； 空心三角箭头表示继承或实现 | 实线表示继承，是is-a的关系，表示扩展，不虚，很结实           |
|               虚线表示实现，虚线代表“虚”无实体               |                                               |                                                              |
|                          关联/依赖                           | 用线条连接两个类； 普通箭头表示关联或依赖     | 虚线表示依赖关系：临时用一下，若即若离，虚无缥缈，若有若无表示一种使用关系，一个类需要借助另一个类来实现功能一般一个类将另一个类作为参数使用，或作为返回值 |
| 实线表示关联关系：关系稳定，实打实的关系，“铁哥们”表示一个类对象和另一个类对象有关联通常一个类中有另一个类对象作为属性 |                                               |                                                              |
|                          组合/聚合                           | 用菱形表示：像一个盛东西的器皿（如盘子）      | 聚合：空心菱形，代表空器皿里可以放很多相同的东西，聚集在一起（箭头方向所指的类）整体和局部的关系，两者有独立的生命周期，是 has-a 的关系弱关系，消极的词：弱-空 |
| 组合：实心菱形，代表器皿里已经有实体结构的存在，生死与共整体与局部的关系，和聚合关系对比，关系更加强烈，两者具有相同的生命周期，contains-a 的关系强关系，积极的词；强-满 |                                               |                                                              |

除此之外，类关系图像上。

- 依赖和关联关系的主要区别是实线和虚线。
- 泛化和接口实现的主要区别也是实线和虚线。
- 泛化和接口实现的箭头都是空心箭头。
- 但是泛化与依赖的区别是箭头。



## 优秀设计框架的特性

所谓优秀的框架就是我们所谓的会写“好代码”的大神写出来的框架。这算是一种对优秀代码写法的规范，某种意义上有很大的参考性。

### 代码复用

无论是开发哪种软件产品，**成本和时间**都是最重要的。较少的开发时间意味着可以比竞争对手更早进入市场。较低的开发成本意味着能够留出更多的营销资金，覆盖更广泛的潜在客户。

其中，代码复用是减少开发成本最常用的方式之一，其目的非常明显，即：**与其反复从头开发，不如在新对象中重用已有的代码。**

### 扩展性

**需求变化是程序员生命中唯一不变的事情**。比如以下几种场景：

- 你在 Windows 平台上发布了一款游戏，现在人们想要 Mac OS 的版本。
- 你创建了一个使用方形按钮的 GUI 框架，但几个月后开始流行原型按钮。
- 你设计了一款优秀的电子商务网站，但仅仅几个月后，客户就要求新增电话订单的功能。



## 软件设计7大原则

在软件开发中，**为了提高软件系统的可维护性和可复用性，增加软件的可扩展性和灵活性**，程序员要尽量根据 7 条原则来开发程序，从而提高软件开发效率、节约软件开发成本和维护成本。我们将在下面的几节中依次来介绍这 7 条原则，本节首先介绍开闭原则。

### 开闭原则

开闭原则（Open Closed Principle，OCP）由勃兰特·梅耶（Bertrand Meyer）提出，他在 1988 年的著作《面向对象软件构造》（Object Oriented Software Construction）中提出：**软件实体应当对扩展开放，对修改关闭**（Software entities should be open for extension，but closed for modification），这就是开闭原则的经典定义。



这里的软件实体包括以下几个部分：

1. 项目中划分出的模块
2. 类与接口
3. 方法

开闭原则的含义是：**当应用的需求改变时，在不修改软件实体的源代码或者二进制代码的前提下，可以扩展模块的功能，使其满足新的需求。**



#### 开闭原则的作用

开闭原则是面向对象程序设计的终极目标，它使软件实体拥有一定的适应性和灵活性的同时具备稳定性和延续性。具体来说，其作用如下。

##### 1. 对软件测试的影响

软件遵守开闭原则的话，软件测试时只需要对扩展的代码进行测试就可以了，因为原有的测试代码仍然能够正常运行。

##### 2. 可以提高代码的可复用性

粒度越小，被复用的可能性就越大；在面向对象的程序设计中，根据原子和抽象编程可以提高代码的可复用性。

##### 3. 可以提高软件的可维护性

遵守开闭原则的软件，其稳定性高和延续性强，从而易于扩展和维护。

#### 开闭原则实现方法

可以通过“**抽象约束、封装变化**”来实现开闭原则，即通过接口或者抽象类为软件实体定义一个相对稳定的抽象层，而将相同的可变因素封装在相同的具体实现类中。

因为抽象灵活性好，适应性广，只要抽象的合理，可以基本保持软件架构的稳定。而软件中易变的细节可以从抽象派生来的实现类来进行扩展，当软件需要发生变化时，只需要根据需求重新派生一个实现类来扩展就可以了。

![image-20210722081603719](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210722081603719.png)

**开闭原则需要扩展性，而扩展性需要低耦合。**（由于扩展性的定义是加入了新的实现或者模块对之前的模块不会造成影响。也就是说模块与模块之间是独立的，也即是低耦合。）而而耦合性可以通过接口进行分散。

***依赖抽象而不是具体实现。***



### 里氏替换原则

里氏替换原则（Liskov Substitution Principle，LSP）由麻省理工学院计算机科学实验室的里斯科夫（Liskov）女士在 1987 年的“面向对象技术的高峰会议”（OOPSLA）上发表的一篇文章《数据抽象和层次》（Data Abstraction and Hierarchy）里提出来的，她提出：**继承必须确保超类所拥有的性质在子类中仍然成立**（Inheritance should ensure that any property proved about supertype objects also holds for subtype objects）。

里氏替换原则主要阐述了有关**继承的一些原则**，也就是什么时候应该使用继承，什么时候不应该使用继承，以及其中蕴含的原理。里氏替换原是继承复用的基础，它反映了基类与子类之间的关系，是对开闭原则的补充，是对实现抽象化的具体步骤的规范。

#### 里氏替换原则的作用

里氏替换原则的主要作用如下。

1. 里氏替换原则是实现开闭原则的重要方式之一。(感觉很突兀？里氏替换怎么就和开闭原则 扯上了呢?其实是这样的。我们在了解开闭原则的时候**第一的想法就是不能更改之前的代码**。但是如果你细心一点再跑去看看开闭原则的定义。你会发现不更改之前写过的代码其实是开闭原则的不完全概括。因为不修改之前的代码也能修改之前写个过的代码。**例子就是下面的鸟不会飞**。)
2. 它克服了继承中重写父类造成的可复用性变差的缺点。
3. 它是动作正确性的保证。即类的扩展不会给已有的系统引入新的错误，降低了代码出错的可能性。
4. 加强程序的健壮性，同时变更时可以做到非常好的兼容性，提高程序的维护性、可扩展性，降低需求变更时引入的风险。



#### 里氏替换原则的实现方法

里氏替换原则通俗来讲就是：**子类可以扩展父类的功能，但不能改变父类原有的功能**。也就是说：**子类继承父类时，除添加新的方法完成新增功能外，尽量不要重写父类的方法**。



如果程序违背了里氏替换原则，则继承类的对象在基类出现的地方会出现运行错误。这时其修正方法是：*取消原来的继承关系，重新设计它们之间的关系。*



关于里氏替换原则的例子，最有名的是“**正方形不是长方形**”。当然，生活中也有很多类似的例子，例如，企鹅、鸵鸟和几维鸟从生物学的角度来划分，它们属于鸟类；**但从类的继承关系来看，由于它们不能继承“鸟”会飞的功能**，所以它们**不能**定义成“鸟”的子类。同样，由于“气球鱼”**不会**游泳，所以**不能**定义成“鱼”的子类；“玩具炮”**炸不了**敌人，所以**不能**定义成“炮”的子类等。



![image-20210722093235671](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210722093235671.png)

```java
package principle;

public class LSPtest {
    public static void main(String[] args) {
        Bird bird1 = new Swallow();
        Bird bird2 = new BrownKiwi();
        bird1.setSpeed(120);
        bird2.setSpeed(120);
        System.out.println("如果飞行300公里：");
        try {
            System.out.println("燕子将飞行" + bird1.getFlyTime(300) + "小时.");
            System.out.println("几维鸟将飞行" + bird2.getFlyTime(300) + "小时。");
        } catch (Exception err) {
            System.out.println("发生错误了!");
        }
    }
}

//鸟类
class Bird {
    double flySpeed;

    public void setSpeed(double speed) {
        flySpeed = speed;
    }

    public double getFlyTime(double distance) {
        return (distance / flySpeed);
    }
}

//燕子类
class Swallow extends Bird {
}

//几维鸟类
class BrownKiwi extends Bird {
    public void setSpeed(double speed) {
        flySpeed = 0;
    }
}
```

![image-20210722093442151](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210722093442151.png)

***继承必须确保超类所拥有的性质在子类中仍然成立***



### 依赖倒置原则

依赖倒置原则（Dependence Inversion Principle，DIP）是 Object Mentor 公司总裁罗伯特·马丁（Robert C.Martin）于 1996 年在 [C++](http://c.biancheng.net/cplus/) Report 上发表的文章。

依赖倒置原则的原始定义为：***高层模块不应该依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节，细节应该依赖抽象***（High level modules shouldnot depend upon low level modules.Both should depend upon abstractions.Abstractions should not depend upon details. Details should depend upon abstractions）。其核心思想是：**要面向接口编程，不要面向实现编程。**

***依赖倒置原则是实现开闭原则的重要途径之一，它降低了客户与实现模块之间的耦合。***



#### 依赖倒置原则的作用

依赖倒置原则的主要作用如下。

- 依赖倒置原则可以降低类间的耦合性。
- 依赖倒置原则可以提高系统的稳定性。
- 依赖倒置原则可以减少并行开发引起的风险。
- 依赖倒置原则可以提高代码的可读性和可维护性。



#### 依赖倒置原则的实现方法

依赖倒置原则的目的是通过要面向接口的编程来降低类间的耦合性，所以我们在实际编程中只要遵循以下4点，就能在项目中满足这个规则。

1. 每个类尽量提供接口或抽象类，或者两者都具备。
2. 变量的声明类型尽量是接口或者是抽象类。
3. 任何类都不应该从具体类派生。
4. 使用继承时尽量遵循里氏替换原则。

![image-20210722100702243](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210722100702243.png)

![image-20210722100801696](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210722100801696.png)

这样代码可以这样写

```java
package principle;

public class DIPtest {
    public static void main(String[] args) {
        Customer wang = new Customer();
        System.out.println("顾客购买以下商品：");
        wang.shopping(new ShaoguanShop());
        wang.shopping(new WuyuanShop());
    }
}

//商店
interface Shop {
    public String sell(); //卖
}

//韶关网店
class ShaoguanShop implements Shop {
    public String sell() {
        return "韶关土特产：香菇、木耳……";
    }
}

//婺源网店
class WuyuanShop implements Shop {
    public String sell() {
        return "婺源土特产：绿茶、酒糟鱼……";
    }
}

//顾客
class Customer {
    public void shopping(Shop shop) {
        //购物
        System.out.println(shop.sell());
    }
}
```


### 单一职责原则

单一职责原则（Single Responsibility Principle，SRP）又称**单一功能原则**，由罗伯特·C.马丁（Robert C. Martin）于《敏捷软件开发：原则、模式和实践》一书中提出的。这里的职责是指**类变化的原因**，单一职责原则规定**一个类应该有且仅有一个引起它变化的原因，否则类应该被拆分**

该原则提出对象不应该承担太多职责，如果一个对象承担了太多的职责，至少存在以下两个缺点：

1. 一个职责的变化可能会削弱或者抑制这个类实现其他职责的能力；
2. 当客户端需要该对象的某一个职责时，不得不将其他不需要的职责全都包含进来，从而造成冗余代码或代码的浪费。

也即是说每个类的职责分配要合理，什么是应该实现的，什么是不该实现的得有一个把控。



#### 单一职责原则的优点

单一职责原则的核心就是控制类的**粒度大小、将对象解耦、提高其内聚性**。如果遵循单一职责原则将有以下优点。

- 降低类的复杂度。一个类只负责一项职责，其逻辑肯定要比负责多项职责简单得多。
- 提高类的可读性。复杂性降低，自然其可读性会提高。
- 提高系统的可维护性。可读性提高，那自然更容易维护了。
- 变更引起的风险降低。变更是必然的，如果单一职责原则遵守得好，当修改一个功能时，可以显著降低对其他功能的影响。

#### 单一职责原则的实现方法

单一职责原则是**最简单但又最难运用的原则**，需要设计人员发现类的**不同职责并将其分离**，**再封装到不同的类或模块中**。而发现类的多重职责需要设计人员具有较强的分析设计能力和相关重构经验。下面以大学学生工作管理程序为例介绍单一职责原则的应用。



分析：大学学生工作主要包括学生生活辅导和学生学业指导两个方面的工作，其中生活辅导主要包括班委建设、出勤统计、心理辅导、费用催缴、班级管理等工作，学业指导主要包括专业引导、学习辅导、科研指导、学习总结等工作。如果将这些工作交给一位老师负责显然不合理，正确的做 法是生活辅导由辅导员负责，学业指导由学业导师负责。



<img src="https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210727101838465.png" alt="image-20210727101838465" style="zoom:25%;" />



单一职责同样**也适用于方法**。一个方法应该**尽可能做好一件事情**。如果一个方法处理的事情太多，其**颗粒度会变得很粗**，**不利于重用**。



### 接口隔离原则

接口隔离原则（Interface Segregation Principle，ISP）要求程序员尽量将**臃肿庞大的接口拆分成更小的和更具体的接口**，让接口中只包含客户感兴趣的方法。



2002 年罗伯特·C.马丁给“接口隔离原则”的定义是：**客户端不应该被迫依赖于它不使用的方法**（Clients should not be forced to depend on methods they do not use）。该原则还有另外一个定义：**一个类对另一个类的依赖应该建立在最小的接口上**。



接口隔离原则和单一职责都是为了提高类的内聚性、降低它们之间的耦合性，体现了封装的思想，但两者是不同的：

- 单一职责原则注重的是**职责**，而接口隔离原则注重的是对**接口依赖的隔离**。
- 单一职责原则主要是**约束类**，它针对的是程序中的实现和细节；接口隔离原则主要**约束接口**，主要针对抽象和程序整体框架的构建。



#### 接口隔离原则的优点

接口隔离原则是为了**约束接口、降低类对接口的依赖性**。

1. **将臃肿庞大的接口分解为多个粒度小的接口**，可以预防外来变更的扩散，提高系统的灵活性和可维护性。
2. 接口隔离提高了**系统的内聚性，减少了对外交互**，降低了系统的耦合性。
3. 如果接口的粒度大小定义**合理**，能够保证系统的稳定性；但是，如果定义**过小，则会造成接口数量过多，使设计复杂化**；如果定义**太大，灵活性降低，无法提供定制服务**，给整体项目带来无法预料的风险。
4. 使用多个专门的接口还能够体现对象的层次，因为可以通过接口的继承，实现对总接口的定义。
5. 能减少项目工程中的代码冗余。过大的大接口里面通常放置许多不用的方法，当实现这个接口的时候，被迫设计冗余的代码。



#### 接口隔离原则的实现方法

在具体应用接口隔离原则时，应该根据以下几个规则来衡量。

- **接口尽量小，但是要有限度**。一个接口只服务于一个子模块或业务逻辑。
- 为依赖接口的类**定制服务**。**只提供调用者需要的方法，屏蔽不需要的方法**。
- **了解环境，拒绝盲从**。每个项目或产品都有选定的环境因素，环境不同，**接口拆分的标准**就不同深入了解业务逻辑。
- **提高内聚，减少对外交互。使接口用最少的方法去完成最多的事情**。



下面以学生成绩管理程序为例介绍接口隔离原则的应用。

![image-20210727105021560](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210727105021560.png)

下面是代码

```java
package principle;
public class ISPtest {
    public static void main(String[] args) {
        InputModule input = StuScoreList.getInputModule();
        CountModule count = StuScoreList.getCountModule();
        PrintModule print = StuScoreList.getPrintModule();
        input.insert();
        count.countTotalScore();
        print.printStuInfo();
        //print.delete();
    }
}
//输入模块接口
interface InputModule {
    void insert();
    void delete();
    void modify();
}
//统计模块接口
interface CountModule {
    void countTotalScore();
    void countAverage();
}
//打印模块接口
interface PrintModule {
    void printStuInfo();
    void queryStuInfo();
}
//实现类
class StuScoreList implements InputModule, CountModule, PrintModule {
    private StuScoreList() {
    }
    public static InputModule getInputModule() {
        return (InputModule) new StuScoreList();
    }
    public static CountModule getCountModule() {
        return (CountModule) new StuScoreList();
    }
    public static PrintModule getPrintModule() {
        return (PrintModule) new StuScoreList();
    }
    public void insert() {
        System.out.println("输入模块的insert()方法被调用！");
    }
    public void delete() {
        System.out.println("输入模块的delete()方法被调用！");
    }
    public void modify() {
        System.out.println("输入模块的modify()方法被调用！");
    }
    public void countTotalScore() {
        System.out.println("统计模块的countTotalScore()方法被调用！");
    }
    public void countAverage() {
        System.out.println("统计模块的countAverage()方法被调用！");
    }
    public void printStuInfo() {
        System.out.println("打印模块的printStuInfo()方法被调用！");
    }
    public void queryStuInfo() {
        System.out.println("打印模块的queryStuInfo()方法被调用！");
    }
}
```



### 迪米特法则

迪米特法则（Law of Demeter，LoD）又叫作最少知识原则（Least Knowledge Principle，LKP)，产生于 1987 年美国东北大学（Northeastern University）的一个名为迪米特（Demeter）的研究项目，由伊恩·荷兰（Ian Holland）提出，被 UML 创始者之一的布奇（Booch）普及，后来又因为在经典著作《程序员修炼之道》（The Pragmatic Programmer）提及而广为人知。



迪米特法则的定义是：**只与你的直接朋友交谈，不跟"陌生人"说话**（Talk only to your immediate friends and not to strangers）。其含义是：**如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用。其目的是降低类之间的耦合度，提高模块的相对独立性。**



迪米特法则中的“朋友”是指：当前对象本身、当前对象的成员对象、当前对象所创建的对象、当前对象的方法参数等，这些对象同当前对象存在关联、聚合或组合关系，可以直接访问这些对象的方法。



#### 迪米特法则的优点

迪米特法则要求限制软件实体之间通信的宽度和深度，正确使用迪米特法则将有以下两个优点。

1. **降低**了类之间的**耦合度**，提高了模块的**相对独立性**。
2. 由于亲合度降低，从而提高了类的可复用率和系统的扩展性。


但是，**过度使用**迪米特法则会使系统**产生大量的中介类**，从而**增加**系统的**复杂性**，使模块之间的通信效率降低。所以，在釆用迪米特法则时需要**反复权衡**，确保高内聚和低耦合的同时，保证系统的结构清晰。



#### 迪米特法则的实现方法



从迪米特法则的定义和特点可知，它强调以下两点：

1. **从依赖者的角度来说，只依赖应该依赖的对象。**
2. **从被依赖者的角度说，只暴露应该暴露的方法。**



所以，在运用迪米特法则时要注意以下 6 点。

1. 在类的划分上，应该创建弱耦合的类。类与类之间的耦合越弱，就越有利于实现可复用的目标。
2. 在类的结构设计上，尽量降低类成员的访问权限。
3. 在类的设计上，优先考虑将一个类设置成不变类。
4. 在对其他类的引用上，将引用其他对象的次数降到最低。
5. 不暴露类的属性成员，而应该提供相应的访问器（set 和 get 方法）。
6. 谨慎使用序列化（Serializable）功能。



实例

![image-20210727113134740](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210727113134740.png)

代码

```java
package principle;
public class LoDtest {
    public static void main(String[] args) {
        Agent agent = new Agent();
        agent.setStar(new Star("林心如"));
        agent.setFans(new Fans("粉丝韩丞"));
        agent.setCompany(new Company("中国传媒有限公司"));
        agent.meeting();
        agent.business();
    }
}
//经纪人
class Agent {
    private Star myStar;
    private Fans myFans;
    private Company myCompany;
    public void setStar(Star myStar) {
        this.myStar = myStar;
    }
    public void setFans(Fans myFans) {
        this.myFans = myFans;
    }
    public void setCompany(Company myCompany) {
        this.myCompany = myCompany;
    }
    public void meeting() {
        System.out.println(myFans.getName() + "与明星" + myStar.getName() + "见面了。");
    }
    public void business() {
        System.out.println(myCompany.getName() + "与明星" + myStar.getName() + "洽淡业务。");
    }
}
//明星
class Star {
    private String name;
    Star(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
//粉丝
class Fans {
    private String name;
    Fans(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
//媒体公司
class Company {
    private String name;
    Company(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
```



### 合成复用原则

合成复用原则（Composite Reuse Principle，CRP）又叫组合/聚合复用原则（Composition/Aggregate Reuse Principle，CARP）。**它要求在软件复用时，要尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。**

**如果要使用继承关系，则必须严格遵循里氏替换原则**。合成复用原则同里氏替换原则**相辅相成**的，两者都是**开闭原则**的**具体实现规范。**



#### 合成复用原则的重要性

通常类的复用分为继承复用和合成复用两种，继承复用虽然有简单和易实现的优点，但它也存在以下缺点。

1. 继承复用破坏了类的**封装性**。因为继承会将父类的实现细节暴露给子类，父类对子类是透明的，所以这种复用又称为“**白箱**”复用。
2. 子类与父类的耦合度高。父类的实现的任何改变都会导致子类的实现发生变化，这不利于类的扩展与维护。
3. 它限制了复用的灵活性。从父类继承而来的实现是静态的，在编译时已经定义，所以在运行时不可能发生变化。



#### 合成复用的优点

采用组合或聚合复用时，可以将已有对象纳入新对象中，使之成为新对象的一部分，新对象可以调用已有对象的功能，它有以下优点。

1. 它维持了类的封装性。因为成分对象的内部细节是新对象看不见的，所以这种复用又称为**“黑箱”复用**。
2. 新旧类之间的**耦合度低**。这种复用所需的**依赖较少**，新对象存取成分对象的唯一方法是通过成分对象的接口。
3. **复用的灵活性高**。这种复用可以在运行时**动态进行**，新对象可以动态地引用与成分对象类型相同的对象。



#### 合成复用原则的实现方法

合成复用原则是通过**将已有的对象纳入新对象中**，作为新对象的成员对象来实现的，新对象可以调用已有对象的功能，从而达到复用。

下面以汽车分类管理程序为例来介绍合成复用原则的应用。

![image-20210727155225886](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210727155225886.png)



![image-20210727155348478](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210727155348478.png)



### 七大原则的总结

|   设计原则   |                          一句话归纳                          |                    目的                    |
| :----------: | :----------------------------------------------------------: | :----------------------------------------: |
|   开闭原则   |                    对扩展开放，对修改关闭                    |            降低维护带来的新风险            |
| 依赖倒置原则 |              高层不应该依赖低层，要面向接口编程              |          更利于代码结构的升级扩展          |
| 单一职责原则 |                一个类只干一件事，实现类要单一                |         便于理解，提高代码的可读性         |
| 接口隔离原则 |              一个接口只干一件事，接口要精简单一              |          功能解耦，高聚合、低耦合          |
|  迪米特法则  | 不该知道的不要知道，一个类应该保持对其它对象最少的了解，降低耦合度 | 只和朋友交流，不和陌生人说话，减少代码臃肿 |
| 里氏替换原则 | 不要破坏继承体系，子类重写方法功能发生改变，不应该影响父类方法的含义 |                防止继承泛滥                |
| 合成复用原则 |       尽量使用组合或者聚合关系实现代码复用，少使用继承       |                降低代码耦合                |



# 设计模式



> 设计模式（Design Pattern）是前辈们对代码开发经验的总结，是***解决特定问题的一系列套路***。它***不是语法规定***，而是一套用来提高代码可复用性、可维护性、可读性、稳健性以及安全性的***解决方案***。

> 这 ***23*** 种设计模式的本质是**面向对象设计原则的实际运用**，是对类的封装性、继承性和多态性，以及类的关联关系和组合关系的充分理解。

> 当然，软件设计模式只是一个引导，在实际的软件开发中，必须根据具体的需求来选择：
>
> - **对于简单的程序**，可能写一个简单的算法要比引入某种设计模式更加容易；
> - 但是对于**大型项目开发**或者框架设计，用设计模式来组织代码显然更好。



## 设计模式的好处



- 可以提高程序员的思维能力、编程能力和设计能力。
- 使程序设计更加标准化、代码编制更加工程化，使软件开发效率大大提高，从而缩短软件的开发周期。
- 使设计的代码可重用性高、可读性强、可靠性高、灵活性好、可维护性强。



## 设计模式的种类以及分类

两种分类方式

- 1.根据目的来分

> 根据模式是用来完成什么工作来划分，这种方式可分为***创建型模式、结构型模式和行为型***模式 3 种。
>
> 1. 创建型模式：***用于描述“怎样创建对象”***，它的主要特点是***“将对象的创建与使用分离”***。GoF 中提供了单例、原型、工厂方法、抽象工厂、建造者等 5 种创建型模式。
>
> 2. 结构型模式：***用于描述如何将类或对象按某种布局组成更大的结构***，GoF 中提供了代理、适配器、桥接、装饰、外观、享元、组合等 7 种结构型模式。
>
>    *我更喜欢把它理解成搭积木，如何将小小的积木搭成高楼。这就是结构型所研究的事情*
>
> 3. 行为型模式：***用于描述类或对象之间怎样相互协作共同完成单个对象都无法单独完成的任务***，以及怎样分配职责。GoF 中提供了模板方法、策略、命令、职责链、状态、观察者、中介者、迭代器、访问者、备忘录、解释器等 11 种行为型模式。
>
>    行为型模式研究的是类与类的关系。日常开发中，通常会出现多个类之间的交互。如何处理这种交互就是行为型模式。

- 2.根据作用范围来分

> 1. 类模式：用于处理类与子类之间的关系，这些关系通过继承来建立，是静态的，在编译时刻便确定下来了。GoF中的工厂方法、（类）适配器、模板方法、解释器属于该模式。
> 2. 对象模式：用于处理对象之间的关系，这些关系可以通过组合或聚合来实现，在运行时刻是可以变化的，更具动态性。GoF 中除了以上 4 种，其他的都是对象模式。



## 设计模式一览

1. 单例（Singleton）模式：某个类只能生成一个实例，该类提供了一个全局访问点供外部获取该实例，其拓展是有限多例模式。
2. 原型（Prototype）模式：将一个对象作为原型，通过对其进行复制而克隆出多个和原型类似的新实例。
3. 工厂方法（Factory Method）模式：定义一个用于创建产品的接口，由子类决定生产什么产品。
4. 抽象工厂（AbstractFactory）模式：提供一个创建产品族的接口，其每个子类可以生产一系列相关的产品。
5. 建造者（Builder）模式：将一个复杂对象分解成多个相对简单的部分，然后根据不同需要分别创建它们，最后构建成该复杂对象。
6. 代理（Proxy）模式：为某对象提供一种代理以控制对该对象的访问。即客户端通过代理间接地访问该对象，从而限制、增强或修改该对象的一些特性。
7. 适配器（Adapter）模式：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
8. 桥接（Bridge）模式：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
9. 装饰（Decorator）模式：动态的给对象增加一些职责，即增加其额外的功能。
10. 外观（Facade）模式：为多个复杂的子系统提供一个一致的接口，使这些子系统更加容易被访问。
11. 享元（Flyweight）模式：运用共享技术来有效地支持大量细粒度对象的复用。
12. 组合（Composite）模式：将对象组合成树状层次结构，使用户对单个对象和组合对象具有一致的访问性。
13. 模板方法（TemplateMethod）模式：定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
14. 策略（Strategy）模式：定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户。
15. 命令（Command）模式：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。
16. 职责链（Chain of Responsibility）模式：把请求从链中的一个对象传到下一个对象，直到请求被响应为止。通过这种方式去除对象之间的耦合。
17. 状态（State）模式：允许一个对象在其内部状态发生改变时改变其行为能力。
18. 观察者（Observer）模式：多个对象间存在一对多关系，当一个对象发生改变时，把这种改变通知给其他多个对象，从而影响其他对象的行为。
19. 中介者（Mediator）模式：定义一个中介对象来简化原有对象之间的交互关系，降低系统中对象间的耦合度，使原有对象之间不必相互了解。
20. 迭代器（Iterator）模式：提供一种方法来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
21. 访问者（Visitor）模式：在不改变集合元素的前提下，为一个集合中的每个元素提供多种访问方式，即每个元素有多个访问者对象访问。
22. 备忘录（Memento）模式：在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。
23. 解释器（Interpreter）模式：提供如何定义语言的文法，以及对语言句子的解释方法，即解释器。



| 范   围\目的 | 创建型模式                | 结构型模式                                      |                        行为型模式                        |
| ------------ | ------------------------- | ----------------------------------------------- | :------------------------------------------------------: |
| 类模式       | 工厂方法                  | (类）适配器                                     |                     模板方法、解释器                     |
| 对象模式     | 单例,原型,抽象工厂,建造者 | 代理, (对象)适配器，桥接，装饰，外观，享元 组合 | 策略,命令,职责链,状态,观察者,中介者,迭代器,访问者,备忘录 |



### 对象创建型模式

**创建型模式是处理对象创建的设计模式，试图根据实际情况使用合适的方式创建对象。**

基本的对象创建方式可能会导致**设计上的问题**，或增加设计的复杂度。**创建型模式通过以某种方式控制对象的创建来解决问题。**



#### 1.单例模式

一个类只有一个实例，这是为了节约资源的举动。有的类没必要创建多个实例比如，一些工厂类配置类，他们只需要一个实例即可。

- 饿汉模式

  ```kotlin
  class SingletonHunger {
      companion object{
          @JvmStatic
          var instance:SingletonHunger = SingletonHunger()
      }
      fun doA(){
          println("Singleton-Hanger")
      }
  
  }
  ```

  Kotlin反编译后的Java代码（只含有部分**重要**的代码）

  ```java
  public class hunger.SingletonHunger01Java {
  
      @NotNull
      private static SingletonHunger instance = new SingletonHunger();
  
      public final void doA() {
          String var1 = "Singleton-Hanger";
          boolean var2 = false;
          System.out.println(var1);
      }
  
      @NotNull
      public static final SingletonHunger getInstance() {
          return instance;
      }
  
  }
  ```

  除此之外还可以用Kotlin的object关键字

  ```kotlin
  object SingletonHunger02 {
      var x:Int = 1
      fun doA(){
          println("Singleton02-Hunger")
      }
  }
  ```

  Java

  ```java
  public final class SingletonHunger02 {
     private static int x;
     @NotNull
     public static final SingletonHunger02 INSTANCE;
  
     public final int getX() {
        return x;
     }
  
     public final void setX(int var1) {
        x = var1;
     }
  
     public final void doA() {
        String var1 = "Singleton02-Hunger";
        boolean var2 = false;
        System.out.println(var1);
     }
  
     private SingletonHunger02() {
     }
  
     static {
        SingletonHunger02 var0 = new SingletonHunger02();
        INSTANCE = var0;
        x = 1;
     }
  }
  ```

- 懒汉模式

  线程安全的。

  ```kotlin
  class SingletonLazy01 {
      companion object{
          @Volatile
          private var instance:SingletonLazy01? = null
  
          @JvmStatic
          @Synchronized
          fun getINSTANCE(): SingletonLazy01? {
              instance?.let {
                  return it
              }
  
              instance = SingletonLazy01()
              return instance
          }
      }
  }
  ```

  Java

  ```java
  public final class SingletonLazy01 {
      private static volatile lazy.SingletonLazy01 instance;
      @NotNull
      public static final lazy.SingletonLazy01.Companion Companion = new lazy.SingletonLazy01.Companion((DefaultConstructorMarker)null);
  
      @JvmStatic
      @Nullable
      public static final synchronized lazy.SingletonLazy01 getINSTANCE() {
          return Companion.getINSTANCE();
      }
  
      public final class SingletonLazy01 {
          private static lazy.SingletonLazy01 instance;
          @NotNull
          public static final lazy.SingletonLazy01.Companion Companion = new lazy.SingletonLazy01.Companion((DefaultConstructorMarker)null);
  
          @JvmStatic
          @Nullable
          public static final synchronized lazy.SingletonLazy01 getINSTANCE() {
              return Companion.getINSTANCE();
          }
          
          public static final class Companion {
              @JvmStatic
              @Nullable
              public final synchronized lazy.SingletonLazy01 getINSTANCE() {
                  lazy.SingletonLazy01 var10000 = lazy.SingletonLazy01.instance;
                  if (var10000 != null) {
                      lazy.SingletonLazy01 var1 = var10000;
                      boolean var2 = false;
                      boolean var3 = false;
                      int var5 = false;
                      return var1;
                  } else {
                      lazy.SingletonLazy01.instance = new lazy.SingletonLazy01();
                      return lazy.SingletonLazy01.instance;
                  }
              }
  
              private Companion() {
              }
  
              // $FF: synthetic method
              public Companion(DefaultConstructorMarker $constructor_marker) {
                  this();
              }
          }
      }
  }
  ```

  这虽然是线程安全的但是同步锁是比较消耗性能，解决方案就是双重检查。

  

  除此之外还可这样完成懒汉式的单例，也是线程安全的。（by lazy默认是线程安全的。可以指定by lazy的mode）

  ```kotlin
  class SingletonLazy02 {
      companion object{
          val INSTANCE:SingletonLazy02 by lazy { SingletonLazy02() }
      }
  
      fun doA(){
          println("Doing A")
      }
  }
  ```

- 静态内部类

  由于静态内部类是没有外部类的this对象的。所以，静态内部类是与外部类无关的。

  再结合Static变量的一个特性，在class load进内存的时候会进行初始化，并调用类的static代码块。

  所以在调用InnerClass.INSTANCE的时候InnerClass load进内存，然后静态变量INSTANCE被初始化，达到了懒加载的效果。

  ```kotlin
  class SingletonStatic01 {
      class InnerClass{
          companion object{
              val INSTANCE = SingletonStatic01()
          }
      }
  
      companion object{
          @JvmStatic
          fun getInstance(): SingletonStatic01 {
              return InnerClass.INSTANCE
          }
      }
  }
  ```

  上述方法不错，但是还能简化一点点。

  ```kotlin
  class SingletonStatic02 {
      object SingletonProvider{
          val INSTANCE = SingletonStatic02()
      }
      companion object{
          @JvmStatic
          fun getInstance(): SingletonStatic02 {
              return SingletonProvider.INSTANCE
          }
      }
  }
  
  ```

  

- 双重检查锁

  变化好像教之前的同步锁并不大。

  ```kotlin
  class SingletonLazy01 {
      companion object{
          @Volatile
          private var instance:SingletonLazy01? = null
       
          @JvmStatic
          fun getINSTANCE():SingletonLazy01?{
              if (instance==null){
                  @Synchronized
                  if (instance == null){
                      instance = SingletonLazy01()
                  }
              }
              return instance
          }
      }
  }
  ```

- 枚举单例

  ```kotlin
  enum class EnumSingleton {
      INSTANCE;
      fun getInstance(): EnumSingleton {
          return INSTANCE
      }
  }
  ```

  上述写法其实是单例的完美写法。

  具有如下优点。

  - 写法简单

  - 线程安全

  - 保证单例

  - 不可new，不可反射

    

    

    其他写法的一个通病就是不能**真正**保证实例是唯一的，

    比如如果构造函数不是private的我们可以直接new，如果构造函数是private比如这样

    ```kotlin
    class SingletonHunger01 private constructor(){
        companion object{
            @JvmStatic
            var instance:SingletonHunger01 = SingletonHunger01()
            private set
        }
        fun doA(){
            println("Singleton01-Hanger")
        }
    
    }
    ```

    我们可以用反射强行public

    ```kotlin
    val singleton = SingletonHunger01::class.java
    with(singleton.getDeclaredConstructor()){
        isAccessible = true
        newInstance().doA()
    }
    ```

    然而enum就不一样。因为他是不能反射的。

    如下 在newInstance的时候会调用newInstanceWithCaller

    ![image-20210727215120046](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210727215120046.png)

    然后newInstanceWithCaller会判断一下class是否是Enum如果是就抛出异常。

    ![image-20210727215217916](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210727215217916.png)

    所以用枚举做单例再适合不过了。

##### 最后

- 单例的写法在现在来看是比较多的，但是在日常开发中最受欢迎的还是饿汉式。毕竟比较简单，没有双重锁，内部类写法那么复杂。而且在不吹毛求疵的情况下也算是不错的解决方案。（Kotlin中object用的比较多）

- 设计模式并不是完全样板的代码，其实它是存在一定的**灵活性和变通性**的。我们更应该把设计模式看成是一套**方案**，满足这种约束的代码我们就可以称为其运用了这种设计模式。

  比如单例就是需要满足：

  1.该类只有一个实例

  2.该类需要创建自己唯一的实例

  3.该类需要提供这个实例

  

> 最后还是强调一下设计模式是只是一套方案，你**可以遵循**也可以**不遵循**，**通常**情况下遵循这项方案我们**代码质量会更好**。但是有的时候使用这套方案我们会发现开发成本会变大很多，但是对我们开发的帮助并不是很大，这时候我们就可以舍弃掉这套方案。因为软件的开发不仅是要讲质量的，成本也是很重要的一部分。盲从设计模式通常会造成设计过度，开发成本提升的问题。



#### 2.工厂模式

在工厂模式中，我们在创建对象时**不会**对客户端暴露**创建逻辑**，并且是通过使用一个**共同的接口**来指向新创建的对象。

- 2.1简单工厂

  其实,简单工厂并不属于工厂设计模式，我在《设计模式-可复用面向对象软件的基础》一书中并没有找到任何对它的描述。
  
  其实例类似于这样
  
  用户无需知道香蕉，苹果等是如何创建的，只需要知道名字即可得到对于的水果。
  
  ![image-20210728000247297](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728000247297.png)
  
  UML图如下
  
  ![image-20210728000151995](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728000151995.png)
  
  代码
  
  ```kotlin
  class Banana(name: String) : Product(name)
  class Apple(name: String) :Product(name) 
  class Orange(name: String) :Product(name)
  
  
  abstract class Product(var name:String)
  
  
  enum class SimpleFactory{
      INSTANCE;
      fun factoryMethod(args: String): simple_factory.Product {
          return when(args){
              "Apple"->Apple(args)
              "Orange"->Orange(args)
              "Banana"->Banana(args)
              else->throw IllegalArgumentException("暂时不提供生产~")
          }
      }
  }
  
  
  class Client {
      fun eat(product: Product){
          println("这${product.name}味道fantastic")
      }
  }
  
  
  fun main() {
      val factory = SimpleFactory.INSTANCE
      val product1 = factory.factoryMethod("Apple")
      val product2 = factory.factoryMethod("Banana")
      val product3 = factory.factoryMethod("Orange")
      val client = Client()
  
      with(client){
          eat(product1)
          eat(product2)
          eat(product3)
      }
  }
  
  ```
  
  



- 2.2工厂方法 Factory-Method

  前面简单工厂我们已近学过了，当我们尝试着用简单工厂生产不同种的按钮的时候，每新建一个按钮就需要修改简单工厂的**factoryMethod(args:String):Product**，这违背了开闭原则会使得我们代码的维护性产生一些问题。由此产生了工厂方法模式。

  ![image-20210728082420639](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728082420639.png)
  
  意图：定义一个用于创建对象的**接口**，让子类决定实例化哪一个类，Factory Method**使一个类的实例化延迟到了子类**。
  
  UML图
  
  ![image-20210728090713167](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728090713167.png)
  
  代码
  
  ```kotlin
  abstract class Button 
  
  
  class OvalButton: Button()
  class RectangleButton: Button() 
  class RhombicButton: Button()
  class RoundedButton: Button()
  
  
  interface ButtonFactory {
      fun produce():Button
  }
  
  enum class OvalButtonFactory:ButtonFactory {
      INSTANCE;
      override fun produce(): Button = OvalButton()
  }
  
  enum class RectangleButtonFactory:ButtonFactory {
      INSTANCE;
      override fun produce(): Button = RectangleButton()
  }
  
  enum class RhombicButtonFactory:ButtonFactory {
      INSTANCE;
      override fun produce(): Button = RhombicButton()
  }
  
  enum class RoundedButtonFactory:ButtonFactory {
      INSTANCE;
      override fun produce(): Button = RoundedButton()
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
  ```

我承认在ButtonFactory的4个子类上有设计过度的问题，hh。（其实那4个工厂可以什么设计模式都不要直接new，毕竟都是小工厂不需要耗费很多资源。）主要是想给大家演示一个设计过度。这时候我们如果需要生产新类型的Button只需要继承自Button，然后再写一个Factory基础自ButtonFactory即可。可以明显看出这个工厂在满足开闭原则的同时**变庞大**了。

工厂方法不同于简单工厂直接返回一个具体的需要创建的类，工厂方法只是声明了抽象方法，而创建的逻辑需要子类自己去实现。也就是说工厂方法将创建的逻辑抽象出来了，形成了一个接口或者是一个抽象类（于此同时为了充分利用多态的特性，我们还需要将产品类的公共方法抽象得到一个Product接口）



- 2.3抽象工厂

  意图：提供一个**接口**以创建**一系列**相关或者相互依赖的对象，而无需指定他们具体的类

  自己的理解：抽象工厂正如其名，是抽象的，定义抽象的接口让具体的工厂实现，定义抽象的**产品族**让具体的产品实现。	
  
  这里介绍关于产品族的概念，我们之前接触的只有单一的，具体的产品，比如空调属于电子产品，但是空调，WIFI，西瓜夏日三件套属于夏日产品族。又比如，华为手机是产品，华为全家桶是产品族。也就是多个产品组成产品族。
  
  ![image-20210728091923108](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728091923108.png)
  
  UML图
  
  是不是一下子就头皮发麻了。（学会UML图很重要的)
  
  直接上代码。
  
  ![image-20210728092046804](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728092046804.png)
  
  ```kotlin
  
  //产品
  abstract class AbstractProductA 
  abstract class AbstractProductB 
  
  
  class ConcreteProductA1: AbstractProductA() 
  class ConcreteProductA2: AbstractProductA()
  class ConcreteProductB1: AbstractProductB()
  class ConcreteProductB2 : AbstractProductB()
  
  //工厂
  abstract class AbstractFactory {
      abstract fun createAbstractProductA():AbstractProductA
      abstract fun createAbstractProductB():AbstractProductB
  }
  
  
  class ConcreteFactory1: AbstractFactory() {
      override fun createAbstractProductA(): AbstractProductA {
          return ConcreteProductA1()
      }
  
      override fun createAbstractProductB(): AbstractProductB {
          return ConcreteProductB1()
      }
  }
  
  
  class ConcreteFactory2: AbstractFactory() {
      override fun createAbstractProductA(): AbstractProductA {
          return ConcreteProductA2()
      }
  
      override fun createAbstractProductB(): AbstractProductB {
          return ConcreteProductB2()
      }
  }
  
  //测试
  fun main() {
      val factory1:AbstractFactory = ConcreteFactory1()
      val productA1 = factory1.createAbstractProductA()
      val productB1 = factory1.createAbstractProductB()
      println("$productA1  $productB1")
  
  
      val factory2:AbstractFactory = ConcreteFactory2()
      val productA2 = factory2.createAbstractProductA()
      val productB2 = factory2.createAbstractProductA()
      println("$productA2  $productB2")
  
  }
  ```
  
  我们可以清晰的发现抽象工厂是最大的工厂，他和工厂方法的却别就是生产线不一样了，**一个是生产产品，一个是生产产品族**。
  
  于此同此我们可以看出抽象工厂的**耦合性是比较低的，**但是**类是比较多的**，**所以在使用上一定要切合实际**，不要过度设计。
  
  

##### 总结：

- 1.简单工厂只适用于关系简单的类，由于其违背了开闭原则在某种意义上不太适用于变化较多的项目中。
- 2.工厂方法将工厂和产品进行抽象，增强了扩展性，但是忽略了产品与产品之间的组合关系
- 3.抽象工厂满足了开闭原则，扩展性强，同时提供了对产品族的支持，我们可以自由灵活的组成各种各样的产品族。但是其实现的框架是3个工厂中最难，代码最长的。

> 所以我们对这三种方法的选取主要是**依据实际**，实际**变化较少**直接就使用简单工厂，**变化较多**但是不需要创建产品族就使用工厂方法，**需要创建产品族**就使用抽象工厂。



#### 3.建筑者模式 Builder

意图：将复杂对象的**构建与它的表示分离**，使得同样的构建过程中可以创建**不同的表示**。这里的表示就是利用**链式**的表示方法。

##### 3.1 静态内部类实现

```kotlin
data class Product(
    val necessary1:Int,
    val necessary2:Long,
    val necessary3:Double
) {
    var option1:String? = null
    var option2:Float? = null
    var option3:Char? = null
    var option4:Byte? = null
    var option5:Short? = null
    var option6:Boolean? = null

    class ProductBuilder(
        necessary1:Int,
        necessary2:Long,
        necessary3:Double
    ){

        private var product:Product? = null

        init {
            product = Product(necessary1,necessary2,necessary3)
        }

        fun build(): Product {
            return product!!
        }
        fun setOption1(string: String): ProductBuilder {
            product?.option1 = string
            return this
        }

        fun setOption2(float: Float): ProductBuilder {
            product?.option2 = float
            return this
        }

        fun setOption3(char: Char): ProductBuilder {
            product?.option3 = char
            return  this
        }

        fun setOption4(byte: Byte): ProductBuilder {
            product?.option4 = byte
            return this
        }

        fun setOption5(short: Short): ProductBuilder {
            product?.option5 = short
            return this
        }

        fun setOption6(boolean: Boolean): ProductBuilder {
            product?.option6 = boolean
            return this
        }
    }
}

//测试
fun main() {


    val concreteProduce = ConcreteBuilder(1,2L,3.0)
        .setOption1("Hello")
        .setOption2(4f)
        .setOption3('A')
        .setOption4(1)
        .setOption5(100)
        .setOption6(false)
        .build()

    println("${concreteProduce.option1} ${concreteProduce.option6}")
}
```

##### 3.2 抽象一个Builder

```kotlin
//产品
abstract class Product(
    val necessary1:Int,
    val necessary2:Long,
    val necessary3:Double
) {
    var option1:String? = null
    var option2:Float? = null
    var option3:Char? = null
    var option4:Byte? = null
    var option5:Short? = null
    var option6:Boolean? = null
}

class ConcreteProduce(necessary1: Int, necessary2: Long, necessary3: Double) : Product(necessary1, necessary2,
    necessary3
) 

//构建器
interface Builder {
    fun setOption1(string: String):Builder
    fun setOption2(float: Float):Builder
    fun setOption3(char: Char):Builder
    fun setOption4(byte: Byte):Builder
    fun setOption5(short: Short):Builder
    fun setOption6(boolean: Boolean):Builder
    fun build():Product
}

class ConcreteBuilder(
    private val necessary1:Int,
    private val necessary2:Long,
    private val necessary3:Double
):Builder {
    private var product:Product? = null

    init {
        product = ConcreteProduce(necessary1,necessary2,necessary3)
    }

    override fun build(): Product {
        return product!!
    }
    override fun setOption1(string: String): Builder {
        product?.option1 = string
        return this
    }

    override fun setOption2(float: Float): Builder {
        product?.option2 = float
        return this
    }

    override fun setOption3(char: Char): Builder {
        product?.option3 = char
        return  this
    }

    override fun setOption4(byte: Byte): Builder {
        product?.option4 = byte
        return this
    }

    override fun setOption5(short: Short): Builder {
        product?.option5 = short
        return this
    }

    override fun setOption6(boolean: Boolean): Builder {
        product?.option6 = boolean
        return this
    }
}

//测试
fun main() {
    
    val concreteProduce = ConcreteBuilder(1,2L,3.0)
        .setOption1("Hello")
        .setOption2(4f)
        .setOption3('A')
        .setOption4(1)
        .setOption5(100)
        .setOption6(false)
        .build()

    println("${concreteProduce.option1} ${concreteProduce.option6}")
}
```

个人的理解：Builder Pattern与上一个Factory Pattern有比较大的相似度。但是呢，他们的不同点也很相同。
Factory Pattern注重的是将类创建出来。
然而Builder所关注的是如何将类给创建出来。
所以他们的关系在我看来是互补的，Builder确定创建的过程，Factory确定大体的框架。

##### 总结

1.建筑者模式适用于创建复杂的对象。（不是复杂对象就没必要使用哦，杀鸡用牛刀不合适。）
2.建筑者模式需要掌握创建对象的细节。（既然需要掌握创建对象的细节，那么耦合性通常就不需要考虑，所以通常Builder是以内部类的方式创建）

#### 4.原型模式

意图：用原型的实例指定创建对象的类型，并且**通过拷贝**这些原型**创建新的对象**

当我们需要创一个对象时候，于此同时这个对象的创建伴随着很多的配置项，我们已经创建过这个对象，那就偷懒直接***深拷贝***一份即可。

```kotlin
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

fun main() {
    val deepCopy = DeepCopy()
    val deepCopy_ = deepCopy.clone() as DeepCopy
    deepCopy_.deepCopy2.a =100
    //由于是深克隆所以deepCopy和deepCopy_中deepCopy2.a的值是不一样的。
    println(deepCopy)
    println(deepCopy_)
}
```



如果bean类里面没有其他的类我们可以使用kotlin的data class

```kotlin
data class Bean(
    var args1:Int = 0,
    var args2:Long = 0,
    var args3:String = "0",
    var args4:Char = '0'
)
```

因为Kotlin data class已经实现了浅拷贝

```java
   @NotNull
   public final Bean copy(int args1, long args2, @NotNull String args3, char args4) {
      Intrinsics.checkNotNullParameter(args3, "args3");
      return new Bean(args1, args2, args3, args4);
   }
```

如果想要使用深拷贝可以这样

```kotlin
data class Bean(
    var args1:Int = 0,
    var args2:Long = 0,
    var args3:String = "0",
    var args4:Char = '0',
    var args5:Bean2 = Bean2()
) {
    fun deepCopy(): Bean {
        return copy(args5 = Bean2())
    }
}


data class Bean2(
    var args1:Int = 1,
    var args2: Long = 2,
    var args3:Char = '3',
    var args4:String = "4"
)

//测试
fun main() {
    val bean = Bean()
    val bean_ = bean.copy()
    bean_.args5.args1 = 10000
    println(bean)
    println(bean_)
}
```



##### 总结

原型模式其实在使用上是**比较少的**。他的用处也是用于创建对象，当我们在创建对象过程中需要进行**很多的配置**的时候我们就可以利用这个设计模式进行**复制**，这样简化了对象的创建。





### 行为型模式

行为型模式用于描述程序在运行时复杂的**流程控制**，即描述**多个类或对象之间怎样相互协作共同完成单个对象都无法单独完成的任务**，它涉及算法与对象间**职责的分配**。





#### 策略模式 Strategy

意图： 定义一系列的算法，把他们一个个封装起来，并且使他们可相互替换。本模式使得算法可独立于使用它的客户而变化

比如这样

![image-20210728152230102](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728152230102.png)



UML关系图

![image-20210728152305966](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728152305966.png)



策略中包含3个关键角色

- Strategy

  策略类，可以是一个抽象类，也可以是一个接口。只**要包含算法的算法的声明即可**。

- ConcreteStrategy

  具体算法的实现类，继承或实现Strategy类。

- Context

  具有Strategy对象，并可以调用其算法的类。也就是说使用算法的角色。他应该和Client是类似的。

上代码

```kotlin
//策略
abstract class Strategy {
    abstract fun algorithm()
}

class ConcreteAlgorithmB: Strategy() {
    override fun algorithm() {
        println("I am ConcreteAlgorithmB")
    }
}

class ConcreteAlgorithmA : Strategy() {
    override fun algorithm() {
        println("I am ConcreteAlgorithmA")
    }
}

//环境类
class Context(var strategy:Strategy) {
    fun algorithm(){
        strategy.algorithm()
    }
}

//测试
fun main() {

    val strategyA = ConcreteAlgorithmA()
    val strategyB = ConcreteAlgorithmB()
    val context = Context(strategyA)
    context.algorithm()
    context.strategy = strategyB
    context.algorithm()

}
```

##### 总结

策略模式就是利用接口将算法抽象进一个接口/抽象类，实现开闭原则。

#### 中介者 Mediator

意图： 用一个**中介对象**来封装一系列的对象交互。中介者使各对象**不需要显示地相互引用**，从而使其**耦合松散**，而且可以独立地改变他们之间的交互。

UML图像

![image-20210728162331810](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728162331810.png)



如果说中介者大家不是很多熟悉，那MVC架构大家应该比较熟悉吧。Model，View，Controller其中Controller就像这个中介者。



代码

```kotlin
//同事
interface Colleague {
    fun sendMsg()
    fun doSome()
}


class ConcreteColleague1(private val mediator: Mediator) : Colleague {
    init {
        mediator.register(this::class.simpleName ?: "",this)
    }

    override fun sendMsg() {
        mediator.dealMsg(ConcreteColleague2::class.simpleName ?: "")
    }

    override fun doSome() {
        println("ConcreteColleague1 : made it")
    }
}


class ConcreteColleague2(private val mediator: Mediator) : Colleague {

    init {
        mediator.register(this::class.simpleName ?: "",this)
    }

    override fun sendMsg() {
        mediator.dealMsg(ConcreteColleague1::class.simpleName ?: "")
    }

    override fun doSome() {
        println("ConcreteColleague2 : made it")
    }
}


//中介者
interface Mediator {
    fun dealMsg(s: String)
    fun register(key:String,value: Colleague)
}

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

//测试
fun main() {
    val mediator = ConcreteMediator.INSTANCE
    val colleague1 = ConcreteColleague1(mediator)
    val colleague2 = ConcreteColleague2(mediator)
    colleague1.sendMsg()
    colleague2.sendMsg()
}
```



**抽象中介者：**定义了各个同事之间交互需要的方法。

**具体中介者：**需要了解维护各个同事对象，并且负责协调各个具体同事之间的交互。

**抽象同事类：**约束具体同事类的类型、并且实现一些具体同事类之间的公共方法。

**具体同事类：**实现自己的业务。



##### 总结：

中介者模式的目的是**简化类与类之间的复杂关系**，让对象只与中介者进行交互，从而达到解耦合的目的。其模式有点类似于MVC。除此之外其解耦的是系**统内部的对象关系**，而**不是系统外**。

![image-20210728164849167](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728164849167.png)



#### 观察者 Observer

意图：定义对象间的一种一对多的依赖关系，使得每当一个对象状态发生改变时，其相关依赖对象皆得到通知并被自动更新。

我们在图形化编程的时候经常会出现这样的需求，当Model层中有数据变化的时候，我们需要更改界面的数据显示。在没有观察者模式的时候我们总是使用view.set手动设置。这样很麻烦，加入观察者模式以后我们无需对视图设置，当程序观察到数据变化自动更新，解放双手。

![image-20210728231127201](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728231127201.png)



UML图

![image-20210729100433620](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210729100433620.png)



- Subject

  Subject即目标/主题，**他是被观察者。**

- ConcreteSubject

  具体的被观察者对象。

- Observer

  Observer即观察者。

- ConcrereObserver

  具体的观察者对象。

代码

```kotlin
//被观察者
abstract class Subject {
    private val observers:ArrayList<Observer> = arrayListOf()
    fun attach(observer: Observer){
        observers.add(observer)
    }
    fun detach(observer: Observer){
        observers.remove(observer)
    }
    fun notifyChanged(){
        observers.forEach{
            it.update()
        }
    }
}


class ConcreteSubject : Subject() {
    var subjectState:String = "IDLE"

    fun startWorking(){
        while (true){
            Thread.sleep(1000)
            subjectState = "RUNNING"
            notifyChanged()
            Thread.sleep(1000)
            subjectState = "FINISH"
            notifyChanged()
            Thread.sleep(1000)
            subjectState = "IDLE"
            notifyChanged()
        }
    }
}

//观察者
interface Observer {
    fun update()
}


class ConcreteObserver(
    private var subject:ConcreteSubject
):Observer {

    init {
        subject.attach(this)
    }

    private var observerState:String = "IDLE"
    override fun update() {
        observerState = subject.subjectState ?: "IDLE"
        println("ConcreteObserver : I got it subjectState $observerState")
    }

}

//测试类
fun main() {
    val concreteSubject = ConcreteSubject()
    val concreteObserver = ConcreteObserver(concreteSubject)
    concreteSubject.startWorking()
}
```





#### 备忘录模式 Memoto

意图：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外**保存这个状态**。

在软件设计中备忘录模式也算比较常见，但是用法比较单一，比如我们在写Word文档的时候使用Ctrl+Z进行**撤销**。之所以能撤销是因为我们使用了备忘录模式记录了必要的状态信息。



UML图

![image-20210729200134077](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210729200134077.png)

其中

- Originator(原发器)

  原发器可以创建一个备忘录，并存储他的当前内部状态，也可以使用备忘录来恢复其内部状态。

- Memoto(备忘录)

  存储原发器内部的状态，根据原发器决定保存那些状态。

- Caretaker(负责人)

  负责人又称管理者，它负责保存备忘录，但是不能对备忘录额内容进行操作或者检查。



代码

```kotlin
//原发器
class Originator(var state:String = "") {
    fun restoreMemoto(memoto: Memoto){
            state = memoto.state
    }

    fun createMemoto(): Memoto {
        return Memoto(this)
    }
}

//备忘录
class Memoto(
    originator: Originator
) {
    var state:String = originator.state
}

//负责人
class Caretaker {
    private val stack:Stack<Memoto> = Stack()
    fun addMemoto(memoto: Memoto){
        stack.add(memoto)
    }

    fun back(): Memoto? {
        return try{
            stack.pop()
        }catch (e:Exception){
            null
        }
    }
}

//测试
fun main() {
    val originator = Originator("A")
    val caretaker = Caretaker()
	
    //嵌套函数
    fun updateAndSave(originator: Originator,caretaker: Caretaker,s: String) {
        originator.state = s
        caretaker.addMemoto(originator.createMemoto())
        println(originator.state)
    }

    fun restore(caretaker:Caretaker,originator:Originator) {
        caretaker.back()?.let {
            originator.restoreMemoto(it)
        }
        println(originator.state)
    }

    //更新5次
    updateAndSave(originator,caretaker,"B")
    updateAndSave(originator,caretaker,"C")
    updateAndSave(originator,caretaker,"D")
    updateAndSave(originator,caretaker,"E")
    updateAndSave(originator,caretaker,"F")
    println("------------------------------")
    //撤销7次 并打印结果
    for (i in 1..7){
        restore(caretaker,originator)
    }
}
```

备忘录的使用情况比较单一，当需要暂时保存当前状态的时候就可以使用。



#### 访问者模式

意图：封装一些作用于某种数据结构的各元素的操作，它可以在不改变数据结构的前提下定义作用于这些元素的新的操作。

UML图

![image-20210729220114265](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210729220114265.png)

其中

- Visitor(抽象访问者)

  抽象访问者为对象结构类中的每一个元素声明一个访问操作。

- ConcreteVisitor(具体访问者)

  抽象访问类的实现。

- Element(抽象元素)

  抽象元素一般是抽象类或者接口，定义一个accept方法，作为一个被访问的抽象。

- ConcreteElement(抽象元素)

  抽象元素的实现，具体的被访问对象。

- ObjectStructure(对象结构)

  我更愿意称之为一个管理类，管理Element的集合。



代码

```kotlin
interface Visitor {
    fun visitConcreteElementA(concreteElementA: ConcreteElementA)
    fun visitConcreteElementB(concreteElementB: ConcreteElementB)
}


class ConcreteVisitorA:Visitor {
    override fun visitConcreteElementA(concreteElementA: ConcreteElementA) {
        println("This is ConcreteVisitorA")
        concreteElementA.operate()
        println("-------------------")
    }

    override fun visitConcreteElementB(concreteElementB: ConcreteElementB) {
        println("This is ConcreteVisitorA")
        concreteElementB.operate()
        println("-------------------")
    }
}

class ConcreteVisitorB :Visitor {
    override fun visitConcreteElementA(concreteElementA: ConcreteElementA) {
        println("ConcreteVisitorB")
        concreteElementA.operate()
        println("------------------")
    }

    override fun visitConcreteElementB(concreteElementB: ConcreteElementB) {
        println("ConcreteVisitorB")
        concreteElementB.operate()
        println("-------------------")
    }
}

//元素--被访问对象
interface Element {
    fun accept(visitor: Visitor)
}

class ConcreteElementA:Element {
    override fun accept(visitor: Visitor) {
        visitor.visitConcreteElementA(this)
    }

    fun operate(){
        //ConcreteElementA的业务代码
        println("ConcreteElementA")
    }
}

class ConcreteElementB:Element {
    override fun accept(visitor: Visitor) {
        visitor.visitConcreteElementB(this)
    }

    fun operate(){
        //ConcreteElementB的业务代码
        println("ConcreteElementB")
    }
}

//Element的管理类
class ObjectStructure {
    private val arrayList:ArrayList<Element> = arrayListOf()
    fun accept(visitor: Visitor){
        arrayList.forEach {
            it.accept(visitor)
        }
    }

    fun add(element: Element){
        arrayList.add(element)
    }

    fun remove(element: Element){
        arrayList.remove(element)
    }
}


fun main(){
    val visitor1:Visitor = ConcreteVisitorA()
    val visitor2:Visitor = ConcreteVisitorB()
    val element1:Element = ConcreteElementA()
    val element2:Element = ConcreteElementB()

    val objectStructure = ObjectStructure()
    objectStructure.add(element1)
    objectStructure.add(element2)

    //objectStructure.accept(visitor1)
    objectStructure.accept(visitor2)
}
```



#### 解释器模式

意图：给分析对象定义一个语言，并定义该语言的文法表示，再设计一个解析器来解释语言中的句子。

UML图

![image-20210729235732481](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210729235732481.png)



其中

- AbstractExpression(抽象表达式)

  在抽象表达式中声明了抽象的解释操作。

- TerminalExpression(终止符表达式)

  它实现了与文法中相关联的解释操作，在句中每一个终结符都是该类的子类。

- NonTerminalExpression(非终结符表达式)

  它实现了该类中非终结符的解释。

- Context(环境类)

  上下文，存储解释器的全局信息

- Client(客户类)

  类似于测试类，给出语法信息调用解释器进行解释。

这个不是我不写代码**实在是看不懂**。真悟不了这个终结符和非终结符到底是啥，搜来的讲的都很高深。

顶得住🐎？

![image-20210730085242916](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210730085242916.png)

主要就记住这个模式是用来**翻译一段特殊的语法的**。用处是很少的。

### 结构型模式



#### 1.适配器模式Adapter

意图：将一个类的接口转化为客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容的那些类可以一起工作

![image-20210728171216931](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728171216931.png)



UML图

![image-20210728171958425](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728171958425.png)





##### 种类：

1.对象适配器

2.类适配器(由于Java Kotlin不支持多继承，所以不学，hh)

##### 适用条件

适用于接口不兼容



##### 代码

```kotlin
//需要适配的对象
class Adaptee {
    fun specificRequest(){
        println("This is specificRequest")
    }
}

//适配器
class Adapter(private val adaptee: Adaptee): Target {
    override fun request() {
        adaptee.specificRequest()
    }
}

//用户
class Client {
    fun useTarget(target: Target){
        target.request()
    }
}

//适配的终点
interface Target {
    fun request()
}


fun main() {
    val adaptee = Adaptee()
    val adapter = Adapter(adaptee)
    val client = Client()
    client.useTarget(adapter)
}
```



##### 最后

Adapter适配器模式主要是为了将不兼容的接口兼容化，Adapter在其中发挥的作用类似于数据转接线，比如usb转type-c。

除此之外还有关于适配的定义(之后还有一个装饰器和对象适配器有点像。)适配主要解决的是不同接口的连接，比如A->C不能连接，那就A->B->C ,这样的效果叫适配。(装饰器面向的是增添新的功能)



#### 2.装饰器模式Decorator

意图：动态地给一个对象添加一些额外的职责。就增加功能来说，Decorator模式相比生成子类更加灵活。

UML图

![image-20210728204942788](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728204942788.png)

其中有

- ConcreteCompoenent

  这是我们需要扩展的类，也就是我们需要添加职责的类。

- Component

  对ConcreteCompoenent的抽象，里面是我们需要添加职责的方法。

- Decorator

  装饰器的抽象，我们可能不只有一种装饰器。所以有必要解耦合。

  由于其需要对Component内的函数进行扩展添加职责，所以还得持有Component。

##### 代码

```kotlin
//Component
interface Component {
    fun operate()
}

class ConcreteComponent: Component {
    override fun operate() {
        println("ConcreteComponent")
    }
}

//装饰器
abstract class Decorator(var component:Component):Component


class ConcreteDecoratorA(component: Component) : Decorator(component) {
    private var addState:String = "fantastic"
    override fun operate() {
        component.operate()
        println("addState $addState")
    }
}


class ConcreteDecoratorB(component: Component) : Decorator(component) {
    override fun operate() {
        component.operate()
        addBehavior()
    }

    private fun addBehavior() {
        println("addBehavior")
    }
}


//测试类
fun main() {
    val component = ConcreteComponent()
    val decoratorA:Decorator = ConcreteDecoratorA(component)
    val decoratorB:Decorator = ConcreteDecoratorB(component)
    //可以扩展属性
    decoratorA.operate()
    println("---------------------")
    //可以扩展方法
    decoratorB.operate()
    println("---------------------")
    //还可以嵌套扩展。
    val decoratorAPlusB = ConcreteDecoratorA(
        decoratorB
    )
    decoratorAPlusB.operate()
}
```

上述是Java式的写法，Kotlin其实有更好的扩展方法

```kotlin
//扩展方法
fun ConcreteComponent.extensionalFunction(){
    operate()
    println("This is Kotlin extensionalFunction")
}
//扩展属性（不能像其他属性一样随心所欲的写。可能是我道行不够。）
var ConcreteComponent.extensionalParam: String
    get() = "extensionalParam"
    set(value) {}


fun main() {
    val concreteComponent = ConcreteComponent()
    concreteComponent.extensionalParam = "10"
    println(concreteComponent.extensionalParam)
    println("----------------------------------")
    concreteComponent.extensionalFunction()
}
```

##### 最后

Decorator的主要作用是在保证灵活性的同时为对象**增加新的职责**。在我个人的理解上来看，这个设计模式是一种扩展型的设计模式。它在语法上有一点类似于Adapter。Adapter是将不同的接口进行适配，适配过程中其实也是可以加扩展的，只是Adapter主要面向的是适配接口。这才使得它与Decorator有明显的区别。

#### 3.桥接模式

##### 意图

将**抽象的部分与他的实现部分分离**，使他可以独立的变化。

UML图像

![image-20210728221726134](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210728221726134.png)

其中

- Abstraction

  **持有实现部分**的抽象类。

  这样写我们可以写**多个实现类**，同时我们可以还能用装饰器模式对Abstraction进行扩展。

- RefinedAbstraction

  Abstraction的实现类。

- Implementor

  实现部分的抽象。

- ConcreteImplementor

  实现类。



代码

```kotlin
//接口实现类的抽象
abstract class Implementor {
    abstract fun operationImp()
}

class ConcreteImplementorA: Implementor() {
    override fun operationImp() {
        println("ConcreteImplementorA")
    }
}


class ConcreteImplementorB: Implementor() {
    override fun operationImp() {
        println("ConcreteImplementorB")
    }
}

//抽象。
abstract class Abstraction (var  impl:Implementor){
    abstract fun operation()
}

class RefinedAbstraction(impl: Implementor) : Abstraction(impl) {
    override fun operation() {
        impl.operationImp()
    }
}

//测试
fun main() {
    val client = Client()
    val impl1:Implementor = ConcreteImplementorA()
    val impl2:Implementor = ConcreteImplementorB()
    val abstraction:Abstraction = RefinedAbstraction(impl1)
    client.useOperation(abstraction)
    abstraction.impl = impl2
    client.useOperation(abstraction)
}
```

##### 个人的理解


桥接模式是通过**聚合**关系，让抽象持有实现，使得**抽象和实现的耦合性降低**。

##### 优点

1.桥接模式创建的对象耦合度较低，接口和实现进行了分离，实现可以组合。
2.可以独立的对接口和实现类进行扩充。



#### 4.代理模式 Proxy

意图：给某一个对象提供一个代理，并由代理对象控制对对象的引用。

##### 种类

静态代理

动态代理





UML图像

![image-20210729102417969](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210729102417969.png)

其中

- Subject

  抽象主题，客户和代理主题的共同接口。

- Proxy

  代理主题，内部含有对具体主题的引用。

- RealSubject

  真实主题，也即是被代理对象。

看了这个类图以后你可能会会想起之前学过的一个设计模式----@装饰器设计模式。

![image-20210729110011644](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210729110011644.png)

其实他们呢也就是有区别的，装饰器设计模式中的Decorator持有的是一盒抽象，而Proxy代理是持有的一个具体类。装饰器是对抽象添加新的职责，而代理不仅仅是添加职责，代理的定义是：给某一个对象提供一个代理，并由代理对象**控制对对象的引用**。控制这个就比较宽泛。

代码

```kotlin
//抽象
abstract class Subject {
    abstract fun request()
}

class RealSubject : Subject() {
    override fun request() {
        println("RealSubject")
    }

}

//代理类
class Proxy(private var realSubject:RealSubject) : Subject() {
    override fun request() {
        preRequest()
        realSubject.request()
        postRequest()
    }

    private fun postRequest() {
        println("postRequest")
    }

    private fun preRequest() {
        println("preRequest")
    }
}

//客户
class Client {
    fun useSubject(subject: Subject){
        subject.request()
    }
}

//测试
fun main() {
    val client = Client()
    val realSubject:RealSubject = RealSubject()
    val subject:Subject = Proxy(realSubject)
    client.useSubject(subject)
}
```

动态代理

与静态代理在类的结构上是一致的。区别就是**代理类是动态生成的**。

代码

```kotlin
//接口
interface Subject {
    fun request()
}


class RealSubject : Subject {
    override fun request() {
        println("RealSubject")
    }
}

//当代理方法被调用了，都会分发到该类的Invoke方法中。
class Invocation(private val realSubject: RealSubject) :InvocationHandler{

    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
        before()
        val o = method?.invoke(realSubject)
        after()
        return o
    }

    private fun after() {
        println("After")
    }

    private fun before() {
        println("Before")
    }
}

//测试
fun main() {
    System.getProperties()["jdk.proxy.ProxyGenerator.saveGeneratedFiles"] = "true"
    val realSubject:RealSubject = RealSubject()
    val proxy = Proxy.newProxyInstance(RealSubject::class.java.classLoader,
        arrayOf(Subject::class.java),
    Invocation(realSubject)) as Subject
    proxy.request()
}
```

其中

- Subject

  同静态代理，抽象主题，只不过**受限于JDK提供的动态代理限制**只能是**接口**。

- Invocation

  调用的处理器，当代理方法被调用了，都会分发到该类的Invoke方法中。我们可以在其中添加一些操作。

- RealSubject

  同静态代理，真实主题，即是**被代理对象**。

动态代理的优点

实现无侵入式的代码扩展，也就是方法的增强；让你可以在**不用修改源码的情况下**，增强一些方法；**在方法的前后你可以做你任何想做的事情**（甚至不去执行这个方法就可以）。



最后稍加分析一下动态代理在运行过程中生成的.class

如果想保存动态生成的.class文件得加上这行代码

```kotlin
 System.getProperties()["jdk.proxy.ProxyGenerator.saveGeneratedFiles"] = "true"
```

![image-20210729154133425](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210729154133425.png)

生成的代理对象实现了我们传入的接口

```kotlin
 val proxy =Proxy.newProxyInstance(RealSubject::class.java.classLoader,
        arrayOf(Subject::class.java),
    Invocation(realSubject)) as Subject
```



![image-20210729154329033](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210729154329033.png)

你会发现我们需要关注的只有Subject接口的方法，request

![image-20210729154204530](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210729154204530.png)

```java
public final void request() {
    try {
        super.h.invoke(this, m3, (Object[])null);
    } catch (RuntimeException | Error var2) {
        throw var2;
    } catch (Throwable var3) {
        throw new UndeclaredThrowableException(var3);
    }
}
```

好像直接调用了父类的成员变量h的invoke方法，点看看看。

![image-20210729154659149](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210729154659149.png)

InvocationHandler？这个熟悉啊。

```kotlin
class Invocation(private val realSubject: RealSubject) :InvocationHandler{

    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
        before()
        val o = method?.invoke(realSubject)
        after()
        return o
    }

    private fun after() {
        println("After")
    }

    private fun before() {
        println("Before")
    }
}
```

那Proxy的h又是在哪里传入的呢？当然是new的时候

```kotlin
 val proxy =Proxy.newProxyInstance(
     	RealSubject::class.java.classLoader,
        arrayOf(Subject::class.java),
    	Invocation(realSubject)) as Subject
```

这样说到底也是调用的Invocation的invoke方法。



最最后动态的实现有不少的方法

- Instrument
- CGLib



#### 5.享元模式

意图： 运用共享技术有效地支持大量细粒度对象地复用。

UML图

![image-20210729164340743](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210729164340743.png)

其中

- Flyweight

  抽象享元类地一个接口。

- ConcrereFlyweight

  具体享元类实现了抽象享元接口，其实例被称为享元对象。

- UnsharedConcrereFkyweight

  不是说有的抽象享元类的子类都需要被共享，不能共享的子类则设计为非共享具体享元类。

- FlyweightFactory

  享元工厂类用于创建并管理享元对象。



代码

```kotlin
//享元的抽象
interface Flyweight {
    fun operation(extrinsicState:String)
}

class UnsharedConcreteFlyweight:Flyweight {
    val allState:String = "Unshared"
    override fun operation(extrinsicState: String) {
        println("extrinsicState $extrinsicState")
    }
}


class ConcreteFlyweight :Flyweight {
    val intrinsicState:String = "Share"
    override fun operation(extrinsicState: String) {
        println("extrinsicState $extrinsicState")
    }
}

//享元工厂
object FlyweightFactory {

    private var flyweights:HashMap<String,Flyweight> = hashMapOf()

    fun getFlyweight(key:String): Flyweight {
        flyweights[key]?.let {
            return it
        }
        flyweights[key] = ConcreteFlyweight()
        return flyweights[key]!!
    }
}

//测试
fun main() {
    val flyweight1 = FlyweightFactory.getFlyweight("a")
    flyweight1.operation("Demo1")
    println(flyweight1)
    println("----------------------------")
    val flyweight2 = FlyweightFactory.getFlyweight("b")
    flyweight2.operation("Demo2")
    println(flyweight2)
    println("----------------------------")
    val flyweight3 = FlyweightFactory.getFlyweight("a")
    flyweight3.operation("Demo3")
    println(flyweight3)
}
```



##### 总结

总体来说享元是利用的池化的思想。如果对象存在两种情况则考虑使用享元模式

1.重复创建

2.小细粒度（职责清晰）

日常生活中的例子有：共享单车，共享充电宝，键盘。等

除此之外字符串常量池，线程池都是享元模式的运用实例。



最最后，享元模式在设计上难度较大，使用并不算太多。但是不能不知道有这玩意。



#### 6.外观模式

意图 : 为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

UML图

![image-20210729175405322](https://gitee.com/False_Mask/jetpack-demos-pics/raw/master/PicsAndGifs/image-20210729175405322.png)

由于其定义给的比较宽泛所以在实现上比较多样化。

其中

- Facade

  即外观角色，客户端可以通过这个，间接于子系统交互。

- Subsystem

  对客户端提供服务的子系统。



代码

```kotlin
//系统
class SubSystemA {
    fun doA(){
        println("Doing A......")
    }
}

class SubSystemB {
    fun doB(){
        println("Doing B......")
    }
}

class SubSystemC {
    fun doC(){
        println("Doing C......")
    }
}

//客户端
class Client (private val facade: Facade){
    fun interactWithABC(){
        facade.dealClientRequest()
    }
}

//测试
fun main() {
    val facade = Facade()
    val client = Client(facade)
    client.interactWithABC()
}
```

总结

外观模式又叫门面模式，其与中介者模式有一定的相似性。只不过中介者是简化**类与类**之间的通信复杂情形，而外观模式是为了简化客户端对子系统的使用的复杂情形。

|             **外观模式**             |                  **中介者模式**                  |
| :----------------------------------: | :----------------------------------------------: |
|            **结构型模式**            |                  **行为型模式**                  |
|       **对子系统提供统一接口**       | **用一个中介对象来封装一系列同事对象的交互行为** |
|          **模式协议是单向**          |                **模式协议是双向**                |
| **所有的请求处理都委托给子系统完成** |    **由中心协调同事类和中心本身共同完成业务**    |

**中介者模式适用于当事者双方不方便或者无能力联系的场合；门面模式以统一的接口对外提供服务，便于服务的使用为目的。**




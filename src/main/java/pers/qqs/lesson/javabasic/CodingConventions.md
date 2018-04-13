
[Coding_conventions](https://en.wikipedia.org/wiki/Coding_conventions)
[静态代码检查工具集](https://curlie.org/Computers/Programming/Languages/Java/Development_Tools/Performance_and_Testing/Static_Checkers/)

## 包
Java包的名字都是由小写单词组成;
但是由于Java面向对象编程的特性，每一名Java程序员都可以编写属于自己的Java包，为了保障每个Java包命名的唯一性，在最新的Java编程规范中，要求程序员在自己定义的包的名称之前加上唯一的前缀;
由于互联网上的域名称是不会重复的，所以程序员一般采用自己在互联网上的域名称作为自己程序包的唯一前缀。
>
1. 包名为“indi.发起者名.项目名.模块名.……”。个体项目，指个人发起，但非自己独自完成的项目，可公开或私有项目，copyright主要属于发起者.
2. 包名为“pers.个人名.项目名.模块名.……”。个人项目，指个人发起，独自完成，可分享的项目，copyright主要属于个人.
3. 包名为“priv.个人名.项目名.模块名.……”。私有项目，指个人发起，独自完成，非公开的私人使用的项目，copyright属于个人.
4. 包名为“com.公司名.项目名.模块名.……”。公司项目，copyright由项目发起的公司所有.

## 类　　
类的名字必须由大写字母开头而单词中的其他字母均为小写；
如果类名称由多个单词组成，则每个单词的首字母均应为大写例如TestPage；
如果类名称中包含单词缩写，则这个所写词的每个字母均应大写，如：XMLExample；
还有一点命名技巧就是由于类是设计用来代表对象的，所以在命名类时应尽量选择名词。　　
>
* Circle
* interface RasterDelegate;
* interface Storing;

## 方法
方法的名字的第一个单词应以小写字母作为开头，后面的单词则用大写字母开头。
>
* sendMessge

## 变量(Variables)
除了变量名外，所有实例，包括类，类常量，均采用大小写混合的方式，第一个单词的首字母小写，其后单词的首字母大写。变量名不应以下划线或美元符号开头，尽管这在语法上是允许的。
变量名应简短且富于描述。变量名的选用应该易于记忆，即，能够指出其用途。
尽量避免单个字符的变量名，除非是一次性的临时变量。临时变量通常被取名为i，j，k，m和n，它们一般用于整型；c，d，e，它们一般用于字符型。
>
* char c;
* int i;
* float myWidth;

## 实例变量(Instance Variables)
大小写规则和变量名相似，除了前面需要一个下划线 int _employeeId;
>
* String _name;
* Customer _customer;

## 常量的名字应该都使用大写字母，并且指出该常量完整含义。如果一个常量名称由多个单词组成，则应该用下划线来分割这些单词。
>
* MAX_VALUE

## 源文件声明规则
当在一个源文件中定义多个类，并且还有import语句和package语句时，要特别注意这些规则。
>
* 一个源文件中只能有一个public类
* 一个源文件可以有多个非public类
* 源文件的名称应该和public类的类名保持一致。例如：源文件中public类的类名是Employee，那么源文件应该命名为Employee.java。
* 如果一个类定义在某个包中，那么package语句应该在源文件的首行。
* 如果源文件包含import语句，那么应该放在package语句和类定义之间。如果没有package语句，那么import语句应该在源文件中最前面。
* import语句和package语句对源文件中定义的所有类都有效。在同一源文件中，不能给不同的类不同的包声明。
* 类有若干种访问级别，并且类也分不同的类型：抽象类和final类等。
package pers.qqs.lesson.javabasic.grammar;


/**
 * Created by qqs on 17/11/29.
 * Java语言支持的变量类型有：
 * - 类变量：独立于方法之外的变量，用 static 修饰。
 * - 实例变量：独立于方法之外的变量，不过没有 static 修饰。
 * - 局部变量：类的方法中的变量。
 * 静态（类变量、静态代码块）属于类本身，不依赖于类的实例
 * 在创建类的实例对象的时候，非静态代码块比构造器代码块更早的执行
 * 当类变量的值改变后，再通过类或类的实例来访问类变量，得到的将是被改变后的值
 * 非静态（实例变量、非静态代码块）的地位是相等的，它们将按顺序被执行，但会比构造器中的代码块更早的执行
 */

public class VariableL {

    /**
     * 在Java语言中，所有的变量在使用前必须声明。声明变量的基本格式如下：
     * type identifier [ = value][, identifier [= value] ...] ;
     * 格式说明：type为Java数据类型。identifier是变量名。可以使用逗号隔开来声明多个同类型变量。
     * 以下列出了一些变量的声明实例。注意有些包含了初始化过程。
     */

    int a, b, c;         // 声明三个int型整数：a、 b、c
    int d = 3, e = 4, f = 5; // 声明三个整数并赋予初值
    byte z = 22;         // 声明并初始化 z
    String s = "runoob";  // 声明并初始化字符串 s
    double pi = 3.14159; // 声明了双精度浮点型变量 pi
    char x = 'x';        // 声明变量 x 的值是字符 'x'。


    /**
     * 静态代码块
     * 类变量(静态变量)可以向前引用(即：先引用,再定义)
     */
    static {
        name = "fancydeepin"; // name 的定义在使用之后
        System.out.println("--->  静态代码块被执行   <---");
    }

    /**
     * 类变量(静态变量)在类的初始化之前初始化,无论类的实例将被创建多少个
     * 类变量(静态变量)都将只在初始化时候在栈内存上分配一次空间
     * 凡 static 修饰的,都将按位置被顺序执行，所以，
     * name 的值最终输出 fancy 而不是上面的 fancydeepin
     */
    public static String name = "123"; //类变量(静态变量)
    public final static String GLOBALNAME = "globalname";
    private String mail = "myEmail"; //实例变量(非静态变量)，定义时指定初始值，会比在构造器赋予值更早执行

    public VariableL() {
        mail = "123@qq.com";
        System.out.println("---> 构造器代码块被执行 <---");
    }

    /**
     * 非静态代码块
     * 实际上，非静态代码块在类初始化创建实例时，将会被提取到类的构造器中，
     * 但是，非静态代码块会比构造器中的代码块优先被执行
     * 所以，mail 最终输出的是类构造器中给定的值，也就是 123@qq.com
     * 而不是 456@qq.com，更不是 myEmail
     */ {
        mail = "456@qq.com";
        System.out.println("---> 非静态代码块被执行 <---");
    }

    // getting and setting
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }


}
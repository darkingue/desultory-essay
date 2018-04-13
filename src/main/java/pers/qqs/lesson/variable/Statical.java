package pers.qqs.lesson.variable;


/**
 * Created by qqs on 17/11/29.
 */

public class Statical {

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
    private String mail = "myEmail"; //实例变量(非静态变量)，定义时指定初始值，会比在构造器赋予值更早执行

    public Statical() {
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

//    @1 说明，静态（类变量、静态代码块）属于类本身，不依赖于类的实例
//    @6 说明，在创建类的实例对象的时候，非静态代码块比构造器代码块更早的执行
//    @3 4 说明，当类变量的值改变后，再通过类或类的实例来访问类变量，得到的将是被改变后的值
//    @5 说明，非静态（实例变量、非静态代码块）的地位是相等的，它们将按顺序被执行，但会比构造器中的代码块更早的执行

}
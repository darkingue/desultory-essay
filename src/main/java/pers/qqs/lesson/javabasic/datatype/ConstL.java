package pers.qqs.lesson.javabasic.datatype;

/**
 * Created by qqs on 18/3/28.
 * Java 常量
 * 常量在程序运行时是不能被修改的
 */
public class ConstL {

    //在 Java 中使用 final 关键字来修饰常量，声明方式和变量类似
    //虽然常量名也可以用小写，但为了便于识别，通常使用大写字母表示常量。

    static final double PI = 3.1415927;
    //字面量可以赋给任何内置类型的变量。例如：
    byte a = 68;
    char b = 'A';

    //byte、int、long、和short都可以用十进制、16进制以及8进制的方式来表示。
    // 当使用常量的时候，前缀 0 表示 8 进制，而前缀 0x 代表 16 进制, 例如：
    static int decimal = 100;
    static int octal = 0144;
    int hexa = 0x64;

    public static void main(String[] args) {
        //和其他语言一样，Java的字符串常量也是包含在两个引号之间的字符序列。下面是字符串型字面量的例子：

        System.out.print("Hello World");
        System.out.println();
        System.out.print("two\nlines");
        System.out.println();
        System.out.print("\"This is in quotes\"");
        System.out.println();


        //字符串常量和字符常量都可以包含任何Unicode字符。例如：
        char a = '\u1111';
        String b = "\u1111";

        System.out.println(a + "<<<<<a b>>>>>" + b);
    }


}

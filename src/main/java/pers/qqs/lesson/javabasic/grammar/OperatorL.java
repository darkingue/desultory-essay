package pers.qqs.lesson.javabasic.grammar;

import org.testng.annotations.Test;

/**
 * Created by qqs on 18/4/4.
 * Java 运算符
 * 计算机的最基本用途之一就是执行数学运算，作为一门计算机语言，Java也提供了一套丰富的运算符来操纵变量。我们可以把运算符分成以下几组：
 * 算术运算符
 * 关系运算符
 * 位运算符
 * 逻辑运算符
 * 赋值运算符
 * 其他运算符
 */
public class OperatorL {
    /**
     * 算术运算符
     * 算术运算符用在数学表达式中，它们的作用和在数学中的作用一样
     * 下面的简单示例程序演示了算术运算符
     */
    @Test
    public void arithmeticOperators() {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++));
        System.out.println("a--   = " + (a--));
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));
    }

    /**
     * 自增自减运算符
     * 1、自增（++）自减（--）运算符是一种特殊的算术运算符，在算术运算符中需要两个操作数来进行运算，而自增自减运算符是一个操作数。
     */
    @Test
    public void arithmeticOperatorsSelfAddMinus() {
        int a = 3;//定义一个变量；
        int b = ++a;//自增运算
        int c = 3;
        int d = --c;//自减运算
        System.out.println("进行自增运算后的值等于" + b);
        System.out.println("进行自减运算后的值等于" + d);
    }

    /**
     * 2、前缀自增自减法(++a,--a): 先进行自增或者自减运算，再进行表达式运算。
     * 3、后缀自增自减法(a++,a--): 先进行表达式运算，再进行自增或者自减运算 实例：
     */
    @Test
    public void arithmeticOperatorsSelfAddMinus_2() {
        int a = 5;//定义一个变量；
        int b = 5;
        int x = 2 * ++a;
        int y = 2 * b++;
        System.out.println("自增运算符前缀运算后a=" + a + ",x=" + x);
        System.out.println("自增运算符后缀运算后b=" + b + ",y=" + y);
    }

    /**
     * 关系运算符
     */
    @Test
    public void relationalOperators() {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));
    }

    /**
     * 位运算符
     * Java定义了位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。
     * 位运算符作用在所有的位上，并且按位运算
     * 下表列出了位运算符的基本运算,假设整数变量A的值为60和变量B的值为13
     * |操作符|描述|列子|
     * |-----|---|----|
     * ＆	如果相对应位都是1，则结果为1，否则为0	（A＆B），得到12，即0000 1100
     * |	如果相对应位都是0，则结果为0，否则为1	（A | B）得到61，即 0011 1101
     * ^	如果相对应位值相同，则结果为0，否则为1	（A ^ B）得到49，即 0011 0001
     * 〜	按位补运算符翻转操作数的每一位，即0变成1，1变成0。	（〜A）得到-61，即1100 0011
     * << 	按位左移运算符。左操作数按位左移右操作数指定的位数。	A << 2得到240，即 1111 0000
     * >> 	按位右移运算符。左操作数按位右移右操作数指定的位数。	A >> 2得到15即 1111
     * >>> 	按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。	A>>>2得到15即0000 1111
     */
    public void bitOperation() {
        int a = 60; /* 60 = 0011 1100 */
        int b = 13; /* 13 = 0000 1101 */
        int c = 0;
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);
    }

    /**
     * 逻辑运算符
     * 下表列出了逻辑运算符的基本运算，假设布尔变量A为真，变量B为假
     * |操作符|	描述|	例子|
     * |-----|-----|-------|
     * &&	称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。	（A && B）为假。
     * | |	称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。	（A | | B）为真。
     * ！	称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。
     */
    @Test
    public void logicalOperator() {
        boolean a = true;
        boolean b = false;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!(a && b) = " + !(a && b));
    }

    /**
     * 短路逻辑运算符
     * 当使用与逻辑运算符时，在两个操作数都为true时，结果才为true，但是当得到第一个操作为false时，其结果就必定是false，这时候就不会再判断第二个操作了。
     */
    @Test
    public void logicalOperatorDuanlu() {
        //解析： 该程序使用到了短路逻辑运算符(&&);
        //首先判断 a<4 的结果为 false，则 b 的结果必定是 false，所以不再执行第二个操作 a++<10 的判断，所以 a 的值为 5。
        int a = 5;//定义一个变量；
        boolean b = (a < 4) && (a++ < 10);
        System.out.println("使用短路逻辑运算符的结果为" + b);
        System.out.println("a的结果为" + a);
    }

    /**
     * 赋值运算符
     * |操作符|	描述|	例子|
     * |-----|-----|-------|
     * =	简单的赋值运算符，将右操作数的值赋给左侧操作数	C = A + B将把A + B得到的值赋给C
     * + =	加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数	C + = A等价于C = C + A
     * - =	减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数	C - = A等价于C = C - A
     * * =	乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数	C * = A等价于C = C * A
     * / =	除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数	C / = A等价于C = C / A
     * ％=	取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数	C％= A等价于C = C％A
     * << =	左移位赋值运算符	C << = 2等价于C = C << 2
     * >> =	右移位赋值运算符	C >> = 2等价于C = C >> 2
     * ＆=	按位与赋值运算符	C＆= 2等价于C = C＆2
     * ^ =	按位异或赋值操作符	C ^ = 2等价于C = C ^ 2
     * | =	按位或赋值操作符	C | = 2等价于C = C | 2
     */
    @Test
    public void assignmentOperator() {
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a  = " + c);
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);
        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);
        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a  = " + c);
        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= a = " + c);
        c &= a;
        System.out.println("c &= 2  = " + c);
        c ^= a;
        System.out.println("c ^= a   = " + c);
        c |= a;
        System.out.println("c |= a   = " + c);
    }

    /**
     * 条件运算符（?:）
     * 条件运算符也被称为三元运算符。该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量。
     * variable x = (expression) ? value if true : value if false
     */
    @Test
    public void conditionalOperator() {
        int a, b;
        a = 10;
        // 如果 a 等于 1 成立，则设置 b 为 20，否则为 30
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        // 如果 a 等于 10 成立，则设置 b 为 20，否则为 30
        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is : " + b);
    }

    /**
     * instanceof运算符
     * 该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。
     * ( Object reference variable ) instanceof  (class/interface type)
     */
    @Test
    public void instanceofOperator() {
        String name = "James";
        boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真
        System.out.println(result);
    }

    static class Car extends Vehicle {
        public static void main(String args[]) {
            Car c1 = new Car();

            Vehicle v2 = new Car();    // v2 是 Car 类型
            Vehicle v3 = new Vehicle();

            //Car 是 Vehicle类型, Vehicle 不是 Car 类型
            boolean result1 = c1 instanceof Vehicle;    // true
            boolean result2 = v2 instanceof Car;        // true
            boolean result3 = v2 instanceof Vehicle;    // true
            boolean result4 = v3 instanceof Car;          // false

            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);
        }
    }

    @Test
    public void instanceofOperatorFaS() {
        Vehicle v1 = new Vehicle(); //父类型
        Vehicle v2 = new Car(); //子类的实例可以声明为父类型
        Car c1 = new Car();    // 子类型
//            Car c2 = new Vehicle(); //这句会报错，父类型的实例不能声明为子类型

        //Car（子类）是Vehicle（父类）类型, Vehicle（父类）不是Car（子类）类型
        boolean result1 = c1 instanceof Vehicle;    // true
        boolean result2 = c1 instanceof Car;        // true
        boolean result3 = v1 instanceof Vehicle;    // true
        boolean result4 = v1 instanceof Car;          // false
        boolean result5 = v2 instanceof Vehicle;    // true
        boolean result6 = v2 instanceof Car;          // true

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }


}

class Vehicle {
}




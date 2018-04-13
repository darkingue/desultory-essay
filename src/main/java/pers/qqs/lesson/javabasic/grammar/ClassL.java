package pers.qqs.lesson.javabasic.grammar;

/**
 * Created by qqs on 18/3/27.
 * 内部类Inner Class
 * 构造函数
 * 一个源文件中只能有一个public类，一个源文件可以有多个非public类
 */
public class ClassL {
    String name;
    int age;
    String designation;
    double salary;
    private String allname = "as11";


    // Class 类的构造器
    public ClassL(String name) {
        this.name = name;
    }

    // 设置age的值
    public void empAge(int empAge) {
        age = empAge;
    }

    /* 设置designation的值*/
    public void empDesignation(String empDesig) {
        designation = empDesig;
    }

    /* 设置salary的值*/
    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    /* 打印信息 */
    public void printClass() {
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("职位:" + designation);
        System.out.println("薪水:" + salary);
    }

    public void test() {
        InnerClassTest et = new InnerClassTest();
        et.main(new String[]{"123", "123"});
    }


    /*3.1 内部类的使用可以有效避免外界对InnerClassTest 类的访问，满足了面向对象的封装性。
     *3.2 内部类InnerClassTest可以直接使用上面定义的  allname;
     *   Java编译器在创建内部类对象时，隐式的把其外部类对象的引用也传了进去并一直保存着。这样就使得内部类对象始终可以访问其外部类对象
     */
    private class InnerClassTest {

        public void main(String args[]) {
      /* 使用构造器创建两个对象 */
            ClassL empOne = new ClassL("RUNOOB1");
            ClassL empTwo = new ClassL("RUNOOB2");

            // 调用这两个对象的成员方法
            empOne.empAge(26);
            empOne.empDesignation("高级程序员");
            empOne.empSalary(1000);
            empOne.printClass();

            empTwo.empAge(21);
            empTwo.empDesignation("菜鸟程序员");
            empTwo.empSalary(500);
            empTwo.printClass();
            System.out.println(allname);
        }
    }
}


class ClassLTest {
    String allname = "as";

    public static void main(String args[]) {
        ClassL empTwo = new ClassL("RUNOOB2");
        empTwo.test();

    }
}

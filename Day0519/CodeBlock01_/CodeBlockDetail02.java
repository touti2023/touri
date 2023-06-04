package Day0519.CodeBlock01_;

//静态，普通 输出优先级：
//静态 > 普通 > 构造器方法
//内部优先级都一样，谁写在前面谁先被执行。

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();//1.getN1被调用......  2."A 静态代码块01"
    }
}

class A {

    public A() {
        System.out.println("A 无参构造器01 被调用");
    }

    private int n2 = getN2();//普通属性初始化

    {
        System.out.println("A 普通代码块01 被调用");//普通代码块
    }

    private static int n1 = getN1();//静态属性初始化

    static {
        System.out.println("A 静态代码块01 被调用");//静态代码块
    }

    public static int getN1() {
        System.out.println("getN1被调用......");//静态方法
        return 100;
    }

    public static int getN2() {
        System.out.println("getN2被调用......");//普通方法
        return 200;
    }
}

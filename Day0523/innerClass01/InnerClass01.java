package Day0523.innerClass01;

//内部类
/*
基本语法：
class Outer{ //外部类
    class Inner{ //内部类
    }
}
class Other{ //其他类（也叫外部平级类)
}
 */
public class InnerClass01 { //外部其他类
    public static void main(String[] args) {

    }
}
class Outer { //外部类
    private int n1 = 100;//属性

    public Outer(int n1) {//构造器
        this.n1 = n1;
    }
    public void m1() {//方法
        System.out.println("m1()");
    }

    { //代码块
        System.out.println("代码块");
    }

    class Inter { //内部类，在Outer类的内部

    }
}
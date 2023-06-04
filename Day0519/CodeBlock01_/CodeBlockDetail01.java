package Day0519.CodeBlock01_;

//静态代码块被执行的情况有：
public class CodeBlockDetail01 {
    public static void main(String[] args) {

        //1.创建对象实例时(new)
        AA aa = new AA();

        //2.创建子类对象实例的时候，父类也会被加载,且先父后子
        AA aa2 = new AA();

        //3.使用类的静态成员时（静态变量，静态方法）
        System.out.println(Cat.age);

        //静态代码块只能被执行一次，普通代码块只会在创建对象后执行。

    }
}

class Cat {
    public  static int age = 999;//静态属性

    //静态代码块
    static  {
        System.out.println("Cat 的静态代码1被执行......");
    }
}

class BB {
    //静态代码块
    static  {
        System.out.println("BB 的静态代码1被执行......");
    }
}
class AA extends BB{

    //静态代码块
    static  {
        System.out.println("AA 的静态代码1被执行......");
    }
}
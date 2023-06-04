package Day0520.abstract_;

public class AbstractDetail {
    public static void main(String[] args) {
        //1.抽象类，不能被实例化
        //new A();
    }
}
abstract class A {

}

//2.抽象类不一定要包含abstract方法，即抽象类可以没有抽象方法。
//hi可以有实现的方法。
class B {
    public void hi() {
        System.out.println("hi");
    }
}

//3.一旦类包含了abstract方法，则这个类必须声明为abstract 抽象类。
//4.abstract 只能修饰类和方法，不能修饰属性和其他。
//抽象类可以有任意成员【即抽象类的本质还是类】，比如：非抽象方法，构造器，静态属性等。
//6.抽象方法“不能有方法体{}”,以();结尾
//7.***如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非他自己也声明为abstract抽象类。
abstract class E {//父类
    public abstract void hi();//父类抽象方法
}
abstract class F extends E {//1.要么将自己也声明成一个抽象类。

}

class G extends E {
    public void hi() {//2.要么实现父类E的抽象方法。

    }
}

//8.*****抽象方法不能使用[private,final 和 static]来修饰，因为这些关键字和重写相违背。
abstract class H {
   //private abstract void hi();//抽象方法 private 和 abstract 相违背，私有化不能让子类重写此方法。
     //public final abstract void hi(); //final 和 abstract 相违背，final就是用来防止被继承，改写的关键字。
    //public static abstract void hi(); //static 和 abstract 相违背，二者无关联会报错。
}
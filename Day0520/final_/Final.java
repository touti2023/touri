package Day0520.final_;

//Final
//最终的，最后的
//可以修饰类，属性，方法和局部变量。
//可以防止被修改，被继承，被重载等。

public class Final {
    public static void main(String[] args) {
      //  E e = new E();
      //  e.TAX_RATE = 0.09;
    }
}

//如果我们要求A类不能被继承
//可以使用final 修饰A类
final class A {

}

//class B extends A {}

class C {
    ///如果我们要求hi 不能被子类重写或覆盖
     //可以使用final 修饰hi 方法
    public final void hi() {

    }
}

class  D extends C {

  //  public void hi() {
   //     System.out.println("hi方法被重写。。。。。。");
    }
//}
//}
//当不希望类的某个属性的值被修改，可以使用final修饰
class E {
    public final double TAX_RATE = 0.08;
}

//当不希望某个局部变量的值被修改，可以使用final修饰
class F {
    public void cry() {
       final double NUM = 0.01;
       // NUM = 0.9;
        System.out.println("NUM=" + NUM);
    }

}

class KK {
    /*
    1.final所定义的属性为常量，通常大写：如TXAX_RATE
    2.final所定义的属性必须赋予初始值，可以在三个地方完成赋值：
        1.直接定义时
        2.在构造器中
        3.在代码块中
     */
    public final double TAX_RATE =0.02;
   // public final double TAX_RATE2;
    public final double TAX_RATE3;
    //构造器
    public void KK() {
   //     TAX_RATE2 = 1.1;
    }
//代码块
    {
        TAX_RATE3 = 8.8;
    }
}
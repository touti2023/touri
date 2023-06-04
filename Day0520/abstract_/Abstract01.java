package Day0520.abstract_;

//抽象类，抽象方法
//抽象类：语法：abstract + 类名{  }
//抽象方法：访问修饰符 + abstract + 返回类型 +方法名（）; ***没有大括号方法体
//抽象类的价值更多作用是在与设计，是设计者设计好后，让子类继承并实现抽象类。
//抽象类 时考官比较爱问的知识点，在框架和设计模式使用较多。

public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal { //抽象类
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //思考，这里eat方法，即使实现了，也没有意义
    //即：父类方法不确定性问题。
    //此时就考虑将该方法 设计为 抽象（abstract）方法
    //所谓抽象方法就是没有实现的方法，就是指没有方法体。
    //当一个类中存在抽象方法时，需要将该类声明为abstract类。
    //一般来说，抽象类会被继承，尤其子类来实现抽象方法。***

  //  public void eat() {
  //      System.out.println("这是一个动物，但是不知道吃什么");
  //  }
    public abstract void eat(); //抽象方法


}

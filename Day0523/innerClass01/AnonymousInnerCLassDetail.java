package Day0523.innerClass01;

public class AnonymousInnerCLassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
    class Outer05 {
    private  int n1 = 99;
    public void f1() {
        //创建一个基于类的匿名内部类
         Person p1 = new Person() {
             @Override
             public void hi() {
                 System.out.println("匿名内部类重写了 hi方法");
             }
         };
        p1.hi();
    }
    }
class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
}
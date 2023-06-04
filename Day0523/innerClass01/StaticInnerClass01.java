package Day0523.innerClass01;

//静态内部类

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
    }
}
class Outer10 { //外部类
    private int n1 = 10;
    private static String name = "张三";

    //1.静态内部类放在外部类的成员位置
    //2.使用static 修饰
    //3.可以直接访问外部类的所有静态成员，包含私有的，不能直接访问非静态成员。
    //4.可以添加修饰符，因为他的地位就是一个属性。
    //5.作用域；为整个类。
    static class Inner10 {//静态内部类
        public void say() {
            System.out.println(name);//name由于是外部static修饰的静态属性，所以可以访问，访问n1则会报错。n1为非静态属性
        }
    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }
}
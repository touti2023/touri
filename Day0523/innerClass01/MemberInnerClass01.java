package Day0523.innerClass01;

//成员内部类，没有写在方法中，不为静态。
//可以被修饰符修饰。
public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
    }
}

class Outer08 {//外部类
    private int n1 = 10;
    public  String name ="张三";

    class Inner08 {//成员内部类=属性
        public void say() {
            //可以访问外部类的所有成员，包括私有的
            System.out.println("outer08的n1 =" + n1 + "  outer08的name=" + name);
        }
    }
    //写方法调用成员内部类（属性）
    public void t1() {
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
}
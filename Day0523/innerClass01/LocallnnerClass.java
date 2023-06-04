package Day0523.innerClass01;

//演示局部内部类的使用

public class LocallnnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02 { //外部类
    private int n1 = 100;//外部类私有属性
    private void m2() {;//外部类私有方法
        System.out.println("Outer02 m2()");
    }
    public void m1() {//方法
        //1.局部内部类是定义在外部类的局部位置，通常在方法中。
        class Inner02 { //2.局部内部类，局部内部类可以直接访问外部类的所有成员，包含私有的private
            //局部内部类本身仍旧是一个类，可以拥有类的五大组成：属性，方法，构造器，代码块，内部类。
            //3.局部内部类不能添加访问修饰符如：public等，但可以被final修饰，表示不能被继承或修改。
            //public class Inner02 X
            //6.如果外部类和内部类的成员重名时，默认遵循就近原则，
            //如果想访问外部类的成员，使用外部类名.this.成员去访问
            private int n1 = 800;//和外部类属性n1重名，就近原则会输出800.
            final class Inner03 {}//ok
            //4.局部内部类的作用域：仅仅在定义他的方法或代码块中。
            public void f1() {
                System.out.println("n1=" + n1 + " 外部类的n1=" + Outer02.this.n1);//这里局部内部类访问了外部类的私有属性n1.
                m2();//访问外部类私有方法。
            }
        }
        //5.外部类在方法中，想要调用内部类的方法f1的话，可以创建Inner02随性，然后调用方法即可。
        Inner02 inner02 = new Inner02();
        inner02.f1();



    }
}
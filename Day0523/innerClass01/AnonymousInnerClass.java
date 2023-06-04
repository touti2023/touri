package Day0523.innerClass01;
/*
演示匿名内部类的使用
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04 {
    private  int n1 = 10;
    public void method() {
        //基于接口的匿名内部类
        //1.想使用一次，后面再不使用
        //2.可以使用匿名内部类来简化开发
        IA tiger = new IA() { //这是匿名内部类基于接口的语法，tiger只用一次，避免重新创建类和对象，节省空间。
            @Override
            public void cry() {
                System.out.println("虎啸");

            }
        };
        tiger.cry();
            //演示基于类的匿名内部类
        Father father = new Father("jack") {
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());//Outer04$2
        father.test();
    }
}

interface IA { //接口
    public void cry();
}

class Father {
    public Father(String name) { //构造器
    }
    public void test() {//方法

    }
}
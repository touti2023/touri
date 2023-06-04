package Day0520.intface_;

//接口的快速入门
/*
接口就是给出一些没有实现的方法，封装到一起，等到某个类要使用时，根据具体情况把这些方法输出。
语法：interface + 接口名{属性/方法}

class 类名：implements 接口 { 自己属性;自己方法;必须实现的接口的抽象方法}
在jdk7.0前，接口里的所有方法都没有方法体，
在jdk8.0后，接口类可以有静态方法，默认方法，也就是说接口中可以有方法的具体实现。
 */
public class Interface01 {
    public static void main(String[] args) {
        //创建手机，相机对象
        Phone phone = new Phone();
        Camera camera = new Camera();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);//把手机接入到计算机
        System.out.println("=========================");

        computer.work(camera);//把相机接入到计算机


    }
}

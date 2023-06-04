package Day0531.threaduse;

//演示通过继承 Thread类，创建线程
public class Thread01 {
    public static void main(String[] args) {
        //创建Cat对象，可以当作线程使用
        Cat cat = new Cat();
        cat.start();//启动线程
    }
}

//1.当一个类继承了 Thread类，就可以做线程使用。
//2.重写run方法，Thread类 实现了 Runnable 接口的run方法

class Cat extends Thread{

    int times = 0;
    @Override
    public void run() {//重写run方法，写上节点业务逻辑
        super.run();

        while (true) {
            //该线程每隔1秒，在控制台输出“喵喵，我是小猫咪”
            System.out.println("喵喵，我是小猫咪" + ++times);
            //让该线程休眠一秒   快捷键：option+command+t
            try {
                Thread.sleep(1000);//1000毫秒=1秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 8) {
                break;//当到8次。就退出
            }
        }
    }
}
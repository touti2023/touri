package Day0531.method;

//演示线程常用方法
public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        //测试相关方法
        T t = new T();
        t.setName("老韩");
        t.setPriority(Thread.MIN_PRIORITY);//最低优先级
        t.start();//启动线程

        //主线程打印5 hi，然后就中断 子线程的休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
        }

        System.out.println(t.getName()+" 线程优先级 ："+t.getPriority());//1

        t.interrupt();//会中断t线程的休眠
    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "  吃包子..." + i);
            }
            System.out.println(Thread.currentThread().getName() + "  休眠中～～～～～～");
            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                //当该线程执行到一个interrupt 方法时，就会catch一个 异常，可以加入自己的业务代码
                System.out.println(Thread.currentThread().getName() + "被  interruptl ");
            }
        }
    }
}
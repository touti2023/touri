package Day0601.threadwork;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();

    }
}
//第一个线程不停输入1-100随机数，，直到B读取q命令
class A extends Thread {
    private boolean loop = true;

    @Override
    public void run() {
        //输出1-100的数字
        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));
            //休眠
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void setLoop(boolean loop) {//可以修改loop达到控制
        this.loop = loop;
    }
}

class B extends Thread {

    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {//构造器
        this.a = a;
    }
    @Override
    public void run() {
        while (true) {
            //接收用户输入
            System.out.println("请输入指令：Q 表示退出");
            char key = scanner.next().toUpperCase().charAt(0);
            if (key == 'Q') {
                //以通知的方式结束a线程
                a.setLoop(false);
                System.out.println("b线程退出。");
                break;
            }
        }
    }
}
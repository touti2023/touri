package Day0601.threadwork;

public class Homework02 {
    public static void main(String[] args) {
        T t = new T();
        Thread thread1 = new Thread(t);
        thread1.setName("t1");
        Thread thread2 = new Thread(t);
        thread2.setName("t2");
        thread1.start();
        thread2.start();

    }
}

//因为涉及到多线程共享资源，所以使用Runnable方式
class T implements Runnable {
    ;private int money = 10000;

    @Override
    public void run() {
        while (true) {

            synchronized (this) {//加this对象锁，线程同步。this锁为非公平锁，谁抢到谁执行。
                //判断余额，由于每次取出1000，所以加以判断
                if (money < 1000) {
                    System.out.println("余额不足");
                    break;
                }

                money -= 1000;
                System.out.println(Thread.currentThread().getName() + " 取出了1000元，当前余额为: " + money);
            }
            //休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
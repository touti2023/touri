package Day0531.syn;

//模拟线程死锁：互不相让，卡死
public class DeadLock {
    public static void main(String[] args) {
        //模拟死锁
        DeadLockDemo A = new DeadLockDemo(true);
        A.setName("A线程");
        DeadLockDemo B = new DeadLockDemo(false);
        B.setName("B线程");
        A.start();//1，卡住
        B.start();//3，卡住
    }
}

//线程
class DeadLockDemo extends Thread {
    static Object o1 = new Object();//保证多线程，共享一个对象，这里使用static
    static Object o2 = new Object();
    boolean flag;

    public DeadLockDemo(boolean flag) {

        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (o1) {//对象互斥锁，下面就是同步代码
                System.out.println(Thread.currentThread().getName() + " 进入1");
                synchronized (o2) {//这里获得li对象的监视权
                    System.out.println(Thread.currentThread().getName() + " 进入2");
                }
            }
        } else  {
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + " 进入3");
                synchronized (o1) { //这里获得li对象的监视权
                    System.out.println(Thread.currentThread().getName() + " 进入4");
                }

            }

        }
    }


}
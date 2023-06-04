package Day0531.syn;

//使用多线程，模拟三个窗口同时售票100张
public class SellTicket {
    public static void main(String[] args) {

        //测试
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start();//1窗口
        new Thread(sellTicket03).start();//2窗口
        new Thread(sellTicket03).start();//3窗口
    }
}

class SellTicket03 implements Runnable {
    private int ticketNum = 100;
    private boolean loop = true;//控制run方法

    public synchronized void sell() {//同步方法synchronized,上厕所原理。只能有一个人来。
        if (ticketNum <= 0) {
            System.out.println("售票结束...");
            loop = false;
            return;
        }

        //休眠50毫秒
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("窗口 " + Thread.currentThread().getName() + " 售出1张票" + " 剩余票数: " + (--ticketNum));
    }

    //实现接口方式，使用synchronized实现线程同步
    @Override
    public void run() {
        while (loop) {

            sell();
        }

    }
}

class SellTicket01 extends Thread {//继承 Thread
        private int ticketNum = 100;//静态化，让多个线程共享 ticketNum


    @Override
    public void run() {
        while (true) {

            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                break;
            }

            //休眠50毫秒
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出1张票" + " 剩余票数: " + (--ticketNum));
        }

    }
}



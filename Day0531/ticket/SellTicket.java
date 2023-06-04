package Day0531.ticket;

//使用多线程，模拟三个窗口同时售票100张
public class SellTicket {
    public static void main(String[] args) {

        //测试
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//
//        //会出现超卖情况
//        sellTicket01.start();//启动售票线程
//        sellTicket02.start();
//        sellTicket03.start();

        System.out.println("===使用实现接口的方式售票====");
        SellTicket02 sellTicket02 = new SellTicket02();

        new Thread(sellTicket02).start();//第一个线程-窗口
        new Thread(sellTicket02).start();//第二个线程-窗口
        new Thread(sellTicket02).start();//第三个线程-窗口
    }
}


//1.使用 继承Thread 方式
class SellTicket01 extends Thread {//继承 Thread
        private static int ticketNum = 100;//静态化，让多个线程共享 ticketNum


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

//2.实现接口方式
class SellTicket02 implements Runnable {
    private int ticketNum = 100;


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
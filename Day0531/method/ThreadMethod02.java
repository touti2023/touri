package Day0531.method;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i <= 20 ; i++) {
            Thread.sleep(1000);
            System.out.println("主线程 吃了 " + i + " 个包子");

            if (i == 5) {
                System.out.println("主线程 让 子线程 先吃");
                //join 线程插队
                t2.join();//子线程插队，让t2先执行完毕，再执行
                System.out.println("子线程老大吃完了 ");
            }
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程 吃了 " + i + " 个包子");
        }
    }
}
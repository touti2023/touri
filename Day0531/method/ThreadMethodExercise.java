package Day0531.method;

public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {
        Thread t3 = new Thread(new T3());
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("hi " + i);
            if (i == 5) {
                t3.start();//启动子线程，输出 hello
                t3.join();//立即插队到main，让t3先执行
            }
            Thread.sleep(1000);
        }
    }
}


class T3 implements Runnable {

    private int count = 0;
    @Override
    public void run() {
        while (true) {

            System.out.println("hello " + ++count);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}
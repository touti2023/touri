package Day0531.exit_;

//演示终止

public class ThreadExit_ {
    public static void main(String[] args) {
        T t1 = new T();
        t1.start();

        //如果希望main线程去控制t1 线程的终止，必须可以修改 loop
        //让t1 退出run方法，从而终止 t1线程。即：通知方式

        //让main线程休眠10秒，再通知 t1线程退出
        System.out.println("主线程休眠10秒...");
        try {
            Thread.sleep(10 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t1.setLoop(false);
    }
}

class T extends Thread {

   private int count = 0;

   //设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {
       while (loop) {
           try {
               Thread.sleep(50);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("T 运行中..." + ++count);
       }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
package Day0531.threaduse;

//o通过实现接口Runnable 来开发线程
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //dog.star(); //这里不能调用star方法。
        //创建Thread 对象，把 dog对象（实现Runnable），放入Thread
        Thread thread = new Thread(dog);
        thread.start();//ok

    }
}

class Dog implements Runnable {//通过实现Runnable接口，开发线程

    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫...hi" + (++count) + "-----" + Thread.currentThread().getName());

            //休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if (count == 10) {
                break;
            }
        }
    }
}
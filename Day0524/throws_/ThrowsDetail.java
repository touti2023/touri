package Day0524.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
    public static void main(String[] args) {
        f2();
    }

    public static void f2() {
        //对于运行时的异常，程序中如果没有处理，默认就是throws方式处理。
        int n1 = 10;
        int n2 =0;
        double res = n1 / n2;
    }
    public static void f1() throws FileNotFoundException{
        f3();
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");
    }

    public static void f4() {
        f5();
    }
    public static void f5() throws ArithmeticException {

    }
}
class Father {
    public void method() throws RuntimeException {
    }
}

class Son extends Father {
    //子类重写父类方法时，对抛出的异常必须与父类一致或者时父类异常的子类。
    //在throws 过程中，如果有方法 try-catch，就相当于处理异常，就可以不必throws
    public void method() throws NullPointerException {

    }
}
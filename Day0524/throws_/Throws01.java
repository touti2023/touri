package Day0524.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws01 {
    public static void main(String[] args) {

    }
    public void f2() throws FileNotFoundException,NullPointerException,ArithmeticException {//异常列表
        //创建了一个文件流对象
        //异常处理
        //使用throws，抛出异常，让调用f2方法的调用者（方法）处理。  踢皮球
        //throws后面的异常类型可以是方法中产生的异常类型，也可以是他的父类
        //throws 关键字后也可以是异常列表，即 可以抛出多个异常。
        FileInputStream fis = new FileInputStream("d://aa.txt");

    }
}


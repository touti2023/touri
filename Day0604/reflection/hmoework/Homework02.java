package Day0604.reflection.hmoework;

import Day0510.Constructor01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) throws Exception {

//        利用Class类的forName方法得到File类的class对象
//        在控制台发音File类的所有构造器
//        通过newInstance的方法，创建File对象，并创建文件。
        //1.Class类的forName方法得到FIle类的class 对象
        Class<?> fileCls = Class.forName("java.io.File");

        //2.得到所有的构造器
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();

        //3.遍历输出
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //4.创建文件
        Constructor<?> declaredConstructor = fileCls.getDeclaredConstructor(String.class);
        String fileAllPath = "user/a.txt";
        Object file = declaredConstructor.newInstance(fileAllPath);

        //5.得到方法对象
        Method createNewFile = fileCls.getMethod("createNewFile");

        System.out.println(file.getClass());
        System.out.println(fileAllPath);

    }
}

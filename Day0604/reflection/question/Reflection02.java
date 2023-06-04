package Day0604.reflection.question;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//测试反射调用的性能，和优化方案
public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        m1();
        m2();
    }

    //传统方法调用方法hi
        public static void m1() {
            Cat cat = new Cat();
            long start = System.currentTimeMillis();
            for (int i = 0; i < 90000000; i++) {
                cat.hi();
            }
            long end = System.currentTimeMillis();
            System.out.println(" 传统方法来调用hi 耗时: " + (end - start));
        }

    //反射机制调用方法hi
    public static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("Day0604.reflection.question.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println(" 反射机制来调用hi 耗时: " + (end - start));
    }
    }


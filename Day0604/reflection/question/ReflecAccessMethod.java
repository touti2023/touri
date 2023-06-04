package Day0604.reflection.question;

import java.lang.reflect.Method;

//演示反射调用方法
public class ReflecAccessMethod {
    public static void main(String[] args) throws Exception {
        //1.得到Boss类 对应的Class对象
        Class<?> bossCls = Class.forName("Day0604.reflection.question.Boss");
        //2.创建对象
        Object o = bossCls.newInstance();
        //3.调用hi方法
        Method hi = bossCls.getMethod("hi", String.class);
        //3.1
        hi.invoke(o,"hspjy");
        //4.调用private static 方法
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        //爆破
        say.setAccessible(true);
        System.out.println(say.invoke(o,100,"zs",'男'));

    }
}

class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }
    public void hi(String s) {
        System.out.println("hi " + s);
    }
}
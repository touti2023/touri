package Day0604.reflection.question;

import java.lang.reflect.Field;

//演示反射操作属性
public class ReflecAccessProperty {
    public static void main(String[] args) throws Exception {
        Class<?> stuClass = Class.forName("Day0604.reflection.question.Student");
        //创建对象
        Object o = stuClass.newInstance();
        //3.使用反射得到age对象
        Field age = stuClass.getField("age");
        age.set(o,88);//使用反射来操作属性   null - 88
        System.out.println(o);//88
        //4.使用反射操作name 私有属性
        Field name = stuClass.getDeclaredField("name");
        //对name 进行爆破
        name.setAccessible(true);
        name.set(o,"太郎");
        System.out.println(o);

    }
}

class Student {
    public int age;
    private static String name;

    public Student() {

    }

    public String toString() {
        return "Student [age=" + age + ", name=" +name +"]";
    }
}
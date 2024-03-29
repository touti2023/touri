package Day0526.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("black",3));
        list.add(new Dog("soon",100));
        list.add(new Dog("bLuch",8));
        
        //先使用增强for
        for (Object dog : list) {
            System.out.println(dog);
        }

        //使用迭代器
        System.out.println("===使用迭代器来遍历===");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object dog = iterator.next();
            System.out.println(dog);
        }

    }
}
/*
创建3个 Dgd{name,age} 对象，放入到 ArrayList 中，赋给 List 引用
用迭代器和增强for循环两种方法来遍历
重写Dog 的toString方法，输出name和age
 */
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
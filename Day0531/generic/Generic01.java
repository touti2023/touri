package Day0531.generic;


import java.util.ArrayList;

@SuppressWarnings({"all"})
/*
引出泛型

请编写程序，在ArrayList 中，添加3个Dog对象
Dog对象含有name 和 age， 并输出name 和 age（要求使用get（）方法）
 */
public class Generic01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("省钱", 5));

        //加入程序员不小心添加了一只猫。
        arrayList.add(new Cat("招财猫",8));//编译通过，但运行报错，引出泛型。

        //遍历
        for (Object o : arrayList) {
            Dog dog = (Dog) o;//向下转型Object - Dog
            System.out.println(dog.getName() + "-" + dog.getAge());
        }

    }
}

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

}

class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
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
}
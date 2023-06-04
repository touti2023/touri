package Day0531.generic.improve;

//使用泛型来完成代码

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {

        //使用泛型来解决: <Dog>
        //1. ArrayList<Dog> 表示存放在此集合中的元素只能是 Dog 类（及其子类）
        //2.如果发现其他类，就会报错。增加一种防护约束力。
        //3.在遍历的时候，可以直接取出 Dog类型 而不是 Object。（就可以省掉向下转型的操作）
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("省钱", 5));

        //加入程序员不小心添加了一只猫。
        //arrayList.add(new Cat("招财猫",8));

        //遍历
        for (Dog dog : arrayList) {
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
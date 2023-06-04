package Day0602.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws IOException {
        /*
        1.编写一个dog.properties  name:tom age:5 color:red
        2.编写Dog类，创建一个对象，读取dog。properties 完成初始化，并输出
        3.将创建的对象，序列化到文件dog.dat 文件

         */
        String filePath = "src/dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        String name = properties.get("name") + "";//obj -Str
        int age = Integer.parseInt(properties.get("age") + "");//obj - int
        String color = properties.get("color") + "";//obj - Str

        Dog dog = new Dog(name, age, color);
        System.out.println("===dog对象信息===");
        System.out.println(dog);

        //将创建的Dog 对象序列化到文件 dog.dat文件
        String serFilePath = "/Users/dreamtank131/Desktop/dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);

        //关闭流
        oos.close();
        System.out.println("dog对象，序列化完成...");
    }

    //再编写一个方法，反序列化dog
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String serfilePath = "/Users/dreamtank131/Desktop/dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serfilePath));
        Dog dog = (Dog) ois.readObject();

        System.out.println("=====反序列化后=====");
        System.out.println(dog);

        ois.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}

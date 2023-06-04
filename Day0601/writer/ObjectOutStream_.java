package Day0601.writer;

import java.io.*;

//演示ObjectOutputStream 的使用，完成数据的序列化
public class ObjectOutStream_ {
    public static void main(String[] args) throws Exception {
        //虚列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String filePath = "/Users/dreamtank131/Desktop/a.txt";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到
        oos.write(100);//int Integer (实现了 Serializable)
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(9.5);
        oos.writeUTF("韩顺平教育");
        //保存一个dog对象
        oos.writeObject(new Dog("旺财",10));

        oos.close();
        System.out.println("数据保存完毕（序列化形式）");
    }
}

//如果需要序列化某个类的对象，实现 Serializable
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
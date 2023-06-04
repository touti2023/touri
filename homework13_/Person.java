package Day0518.homework13_;

public class Person {
    private String name;
    private char gender;
    private int age;

    //方法

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //编写一个play方法,把共有的写到父类方法中
    public String play() {
        return name + " 爱玩 ";
    }

    //为打印出信息，返回一个子类共同的基本信息。格式如下：
    /*
    姓名；张飞
    年龄：30
    性别：男
     */
    public String basicInfo() {
        return "姓名: " + name + "\n年龄: " + age + "\n性别: " + gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

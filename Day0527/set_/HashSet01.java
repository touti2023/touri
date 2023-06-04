package Day0527.set_;

import java.util.HashSet;

public class HashSet01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashSet set = new HashSet();

        //说明
        /*
        1.在执行add方法后，会返回一个boolean值
        2.如果添加成功，返回 true，否则返回false
        3.可以通过 remove 指定删除哪个元素
         */
        System.out.println(set.add("john"));//t
        System.out.println(set.add("lucy"));//t
        System.out.println(set.add("john"));//f
        System.out.println(set.add("jack"));//t
        System.out.println(set.add("Rose"));//t

        set.remove("john");
        System.out.println("set" + set);//3

        //
        set = new HashSet();
        System.out.println("set=" + set);
        set.add("lucy");
        set.add("lucy");
        set.add(new Dog("tom"));
        set.add(new Dog("tom"));
        System.out.println("set=" + set);

    }

}
class Dog {
    private String name;
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
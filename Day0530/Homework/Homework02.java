package Day0530.Homework;

import java.util.ArrayList;
import java.util.Iterator;

/*
要求：使用ArrayList 完成对 对象 Car {name,price} 的各种操作
1.add：添加单个元素
2.remove：删除指定元素
3.contains：超找元素是否存在
4.size：获取元素个数
5.isEmpty：判断是否为空
6.clear：清空
7.addAll：添加多个元素
8.containsAll：查找多个元素是否都存在
9.removeAll：删除多个元素
使用增强for 和 迭代器李遍历所有的car，需要重写Car 的toString方法。
 */
@SuppressWarnings({"all"})
public class Homework02 {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList();
        Car car1 = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);
        //1.add：添加单个元素
        arraylist.add(car1);
        arraylist.add(car2);
        System.out.println(arraylist);

        //2.remove：删除指定元素
        arraylist.remove(car1);
        System.out.println(arraylist);

        //3.contains：超找元素是否存在
        System.out.println(arraylist.contains(car1));//F

        //4.size：获取元素个数
        System.out.println(arraylist.size());//1

        //5.isEmpty：判断是否为空
        System.out.println(arraylist.isEmpty());//F

        //6.clear：清空
        //System.out.println(arraylist.clear(););

        //7.addAll：添加多个元素
        System.out.println(arraylist);
        arraylist.addAll(arraylist);//2个宾利
        System.out.println(arraylist);

        //8.containsAll：查找多个元素是否都存在
        System.out.println(arraylist.containsAll(arraylist));//T

        //9.removeAll：删除多个元素
        //arraylist.removeAll(arraylist);

        //使用增强for 和 迭代器李遍历所有的car，需要重写Car 的toString方法。
        System.out.println("====================");
        for (Object o : arraylist) {
            System.out.println(o);
        }

        System.out.println("=======迭代器==========");
        Iterator iterator = arraylist.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }


    }
}


class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
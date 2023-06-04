package Day0530.Homework;

import java.util.*;

@SuppressWarnings({"all"})

/*
要求
1.使用HashMap类实例化一个Map类型的对象m，键（String）和值（int）分别用于存储员工的姓名和工资，存入数据如下：
jack-650元；tom-1200元；smith-2900元；
2.将jack的工资更改为2600元
3.为所有员工公司加薪100元；
4.遍历集合中所有的员工
5.遍历集合中所有的工资
 */
public class Homework03 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);
        System.out.println(m);

        m.put("jack",2600);
        System.out.println(m);

        //为所有员工加薪100，
        //keySet开始遍历
        Set set = m.keySet();
        //增强for遍历
        for (Object key : m.keySet()) {
            //就是更新
            m.put(key,(Integer)m.get(key) + 100);
        }
        System.out.println("更新后的工资：" + m);


        //4.遍历集合中所有的员工
        //选用 EntrySet遍历
        System.out.println("遍历所有的员工");
        Set entrySet = m.entrySet();
        //迭代器
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey());
        }

        //5.遍历集合中所有的工资
        System.out.println();
        System.out.println("遍历所有的工资");
        Collection values = m.values();
        System.out.println(values);

    }
}
class Emp {
    private String name;
    private double sal;

    public Emp(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
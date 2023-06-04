package Day0531.generic.improve;

import java.util.*;

@SuppressWarnings({"all"})
public class GenericExercise {
    public static void main(String[] args) {
        //使用泛型方式来给HashSet 放入3个学生对象。
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("jack", 18));
        students.add(new Student("tom", 28));
        students.add(new Student("mary", 19));

        //遍历
        for (Student student : students) {
            System.out.println(students);
        }

        //使用泛型方式给 HashMap 放入3个学生对象
        HashMap<String, Student> hm = new HashMap<String, Student>();
        hm.put("milan", new Student("milan", 38));
        hm.put("smith", new Student("smith", 48));
        hm.put("hsp", new Student("hsp", 28));

        //迭代器 EntrySet
        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        System.out.println("=============================");
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();

            System.out.println(next.getKey() + "-" + next.getValue());

        }

    }
}
/*
创建3个学生对象
放入到HashSet中使用
放入到HashMap中，要求kay 是String name，Value 是学生
使用两种方法遍历
 */

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
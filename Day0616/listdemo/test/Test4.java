package Day0616.listdemo.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {

        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2.创建学生对象
        Student stu1 = new Student("zhangsan", 23);
        Student stu2 = new Student("lisi", 24);
        Student stu3 = new Student("wangwu", 25);

        //3.添加元素
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getName() + "," + student.getAge());
        }


    }
}

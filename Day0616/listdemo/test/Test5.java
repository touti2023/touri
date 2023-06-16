package Day0616.listdemo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        //2.键盘录入学生信息并添加到集合中
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();

            System.out.println("请输入学生的姓名");
            String name = scanner.next();

            System.out.println("请添加学生的名¥年龄");
            int age = scanner.nextInt();

            //.把名字和年龄赋值给学生对象
            s.setName(name);
            s.setAge(age);

            //把学生对象添加到集合中
            list.add(s);

            }
        //遍历集合
        for (int i1 = 0; i1 < list.size(); i1++) {
            Student student = list.get(i1);
            System.out.println(student.getName() + "," + student.getAge());
        }

    }
}

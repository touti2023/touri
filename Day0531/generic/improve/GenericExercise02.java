package Day0531.generic.improve;

import java.util.ArrayList;
import java.util.Comparator;

@SuppressWarnings({"all"})
/*

din定义Employee类
1.包含name，sal，birthday，其中bir 为mydate
2.为每个属性定义det，set方法
3.重写toString输出以上属性
4.mysate类包含：month，day，year
5.创建3个对象，并放入Arraylist集合中
6.排序：调用sort方法，传入 Comparator对象，使用泛型，按照name排序，name相同按照生日排序

 */
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 20000, new MyDate(2000, 11, 11)));
        employees.add(new Employee("jack", 12000, new MyDate(2001, 12, 12)));
        employees.add(new Employee("hsp", 50000, new MyDate(1980, 10, 10)));

        System.out.println(employees);

        System.out.println("=======对雇员进行排序======");
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //先按照name排序，如果name相同，则按生日日期的先后排序。【即：定制排序】
                //先对传入的参数进行验证
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("类型不正确...");
                    return 0;
                }
                //比较name
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }
               return emp1.getBirthday().compareTo(emp2.getBirthday());
            }

        });

        System.out.println("=====排序后的结果=====");
        System.out.println(employees);
    }
}

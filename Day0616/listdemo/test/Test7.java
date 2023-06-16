package Day0616.listdemo.test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        /*
        需求：
        定义集合，存入三个用户
        属性为id，name，pwd

        定义方法，根据id查询用户信息
        如果存在，返回索引
        不存在，返回-1
         */

        //1.创建集合
        ArrayList<User> list = new ArrayList<>();

        //2.创建3个对象
        User u1 = new User("001", "zs", "123456");
        User u2 = new User("002", "ls", "1234567");
        User u3 = new User("003", "ww", "12345678");

        //3.把用户对象添加到集合中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        //4.查找索引
        int index = getIndex(list, "001");
        int index2 = getIndex(list, "002");

        //5.打印结果
        System.out.println(index);
        System.out.println(index2);

    }

    public static int getIndex(ArrayList<User> list,String id) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            String uid = u.getId();
            if (uid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}

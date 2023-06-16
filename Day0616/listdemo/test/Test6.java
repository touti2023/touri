package Day0616.listdemo.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {

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

        //4.调用方法查看是否存在
        boolean flag = contains(list, "005");
        //5.打印结果
        System.out.println(flag);


    }

    /*
        我要干啥？ 根据id 查用户
        需要什么才能完成？ list，id
        是否需要返回结果？ 返回
         */
        public static boolean contains(ArrayList<User> list,String id) {
            for (int i = 0; i < list.size(); i++) {
                User u = list.get(i);
                String uid = u.getId();
                if (uid.equals(id)) {
                    //找到就返回真
                    return true;
                }
            }
            return false;//这里不能写else，全遍历完没找到直接返回false。
        }
}

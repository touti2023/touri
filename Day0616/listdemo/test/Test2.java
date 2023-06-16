package Day0616.listdemo.test;

import java.util.ArrayList;
//添加数字，int自动转换Integer
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//int x

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);
    }
}

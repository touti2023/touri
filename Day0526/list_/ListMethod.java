package Day0526.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");

        //void add(int index, Object ele):在index位置，插入ele元素
        //在index = 1 的位置插入一个字符串。（即在张三丰之后）
        list.add(1,"刘备");
        System.out.println(list);

        //boolean addAll(int index, Object ele):从index位置，插入多个元素
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1,list2);
        System.out.println(list);

        //int indexOf(Object obj):返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));//2

    }
}

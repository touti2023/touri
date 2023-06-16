package Day0616.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        /*
        增  boolean add(E e)

        删  boolean remove(E e)  /  E remove(int index)

        改  E set(int index,E e)

        查  E get(int index)
        获取长度  int size( )
         */

        //1.创建集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //.删除元素
        list.remove("aaa");
        System.out.println(list);


        //修改元素
        list.set(1,"ddd");//索引
        System.out.println(list);

        //查询元素
       String str = list.get(0);//索引
        System.out.println(str);

        //长度遍历：快捷键；list.for+i
        System.out.println("===================");
        for (int i = 0; i < list.size(); i++) {
            //i为索引
            //list（i）为元素
            String str2 = list.get(i);
            System.out.println(str2);
        }

    }
}

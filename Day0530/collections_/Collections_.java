package Day0530.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Collections 是一个工具类
//演示常用方法
@SuppressWarnings({"all"})
public class Collections_ {
    public static void main(String[] args) {
        //创建一个 ArrayList 集合，用于测试。
        ArrayList list = new ArrayList();//ArrayList list 本身为有序集合
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        list.add("tom");

        //reverse 反转 List 中的元素顺序
        Collections.reverse(list);
        System.out.println(list);

        //shuffle（List）:对 list 集合元素进行随机排序
        System.out.println("------------");
//        for (int i = 0; i < 5; i++) {//循环5次演示随机排序，抽奖游戏常用
//            Collections.shuffle(list);
//            System.out.println(list);
//        }

        //sort（List）：根据元素的自然顺序对指定 List 集合元素安升序排
        Collections.sort(list);
        System.out.println("自然排序后" + list);//字母排序

        //sort（List Comparator）：根据指定的 Comparator 产生的顺序对 list 集合元素
            //我们希望按照 字符串长度由小到大来排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("按照字符串长度由小到大排序后" + list);

        //swap（List，int，int）；将指定 List 集合中的 o 处元素和 j 处元素进行交换
        //比如
        Collections.swap(list,0,1);
        System.out.println("交换后的情况");
        System.out.println(list);

        //Object max(Collection):根据元素的自然顺序，返回给定集合中的最大元素
        System.out.println("自然顺序的最大元素是 " + Collections.max(list));//自然顺序即字母优先顺序//tom

        //Object max(Collection,Comparator):根据 Comparator 指定的顺序，返回给定集合中的最大元素
        //比如，我们要返回长度最大的元素
        Object maxObject = Collections.max(list, new Comparator () {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).length() - ((String) o2).length();
            }
        });
        System.out.println("长度最大的元素是 " + maxObject);

        //Object min(Collection)
        //Object min(Coiiection,Comparator)
        //上面两个方法，求最小元素可以参考上面。

        //int frequency(Collection,Object):返回值定集合中指定元素的出现次数
        System.out.println("tom出现的次数是 " + Collections.frequency(list,"tom"));

        //void copy(List dest,List src):将src中的内容复制到dest中
        ArrayList dest = new ArrayList();
        //为了完成一个完整拷贝，需要先给 dest 赋值，大小和list.size() 一样。
        for (int i = 0; i < list.size(); i++) {
            dest.add("");
        }
        //拷贝
        Collections.copy(dest,list);
        System.out.println(dest);

        //replaceALL（List list，Object oldVal，Object newVal）：使用新值替换 List 对象的所有旧值
        //例如；如果list中，有tom，就替换成 汤姆
        Collections.replaceAll(list,"tom","汤姆");
        System.out.println("替换后的list：" + list);


    }
}

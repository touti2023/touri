package Day0530;

import java.util.Comparator;
import java.util.TreeMap;

@SuppressWarnings({"all"})
public class TreeMap_ {
    public static void main(String[] args) {

        //使用默认的构造器，创建TreeMap,是无序的
        /*
        要求：按照传入的k（Streing）的大小进行排序
         */
        //TreeMap treeMap = new TreeMap();//移除无参构造器
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照传入的k（Streing）的大小进行排序
               // return ((String) o1).compareTo((String) o2);
                //rg
                //如果按照k（Streing）字符串长度从小到大进行排序。    //从大到小o2 - o1
                return ((String) o1).length() - ((String) o2).length();
            }
        });

        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯缇娜");
        treeMap.put("smith", "史密斯");

        System.out.println(treeMap);

    }
}

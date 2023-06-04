package Day0526.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//2种遍历方式
public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("北京烤鸭");
        list.add("降龙十八掌");

        //1.迭代器 快捷键：itit
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }

        //2.增强for 快捷键：I
        System.out.println("增强for--------");
        for (Object o : list) {
            System.out.println(o);
        }

    }
}

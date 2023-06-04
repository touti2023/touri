package Day0526.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //List集合类中 元素有序，添加和取出顺序一致，且可重复。
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("lufei");
        list.add("lufei");//可重复
        System.out.println(list);

        //2.List集合中的每个元素都有其对应的顺序索引，即支持索引
        System.out.println(list.get(0));//jack

    }
}

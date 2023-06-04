package Day0527.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Set 接口
public class SetMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(("john"));
        set.add("lucy");
        set.add("john");
        set.add("jack");
        set.add(null);
        set.add(null);

        System.out.println(set);
        //set 接口的实现类的对象不能存放重复的元素，可以添加null，存放数据是无序的。
        //取出的顺序是一定的，不会改变

        //遍历
        //方式1:使用迭代器
        System.out.println("=====使用迭代器=====");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }

        //方法2： 增强for
        System.out.println("=====增强for=====");

        for (Object o :set) {
            System.out.println("o" + o);

        //set不能索引

        }

    }
}



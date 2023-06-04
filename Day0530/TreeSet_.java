package Day0530;

import java.util.Comparator;
import java.util.TreeSet;
@SuppressWarnings({"all"})
public class TreeSet_ {
    public static void main(String[] args) {

        //1.当我们使用无参构造器，创建TreeSet时，仍然是无序的
        //2.老师希望添加的元素，按照字符串大小来排序
        //3.使用TreeSet 提供的一个构造器，可以传入一个比较器（匿名内部类），并指定排序规则

        // TreeSet treeSet = new TreeSet();//注销无参构造器
        TreeSet treeSet = new TreeSet(new Comparator() {//创建一个有参构造器
            @Override
            public int compare(Object o1, Object o2) {
                //调用String的 compareTo 方法，进行字符串比较
                return ((String) o1).compareTo((String) o2);
            }
        });
        //添加数据
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("a");

        System.out.println(treeSet);
    }
}

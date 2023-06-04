package Day0526.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("小李飞刀","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));

        //使用增强for循环,增强for就是简化版的 迭代器遍历,快捷键：I
        for(Object book : col) {
            System.out.println("book" + book);
        }





    }
}

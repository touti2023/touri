package Day0526.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("小李飞刀","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));

        //遍历集合
        //1.先得到col 对应的 迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环遍历
        while (iterator.hasNext()) {
            //返回下一个元素，类型是Object
            Object obj = iterator.next();
            System.out.println(obj);
        //*当退出while循环后，迭代器会只指向最后的元素。
        //3.如果希望再次遍历，需要重置迭代器到最初的位置。
        iterator = col.iterator();
            System.out.println();
            while (iterator.hasNext());
            System.out.println(obj);
        }
    }
}
class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

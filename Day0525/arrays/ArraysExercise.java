package Day0525.arrays;

import java.util.Arrays;
import java.util.Comparator;

/*

     */
public class ArraysExercise {
    public static void main(String[] args) {

        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("新金瓶梅", 90);
        books[2] = new Book("青年文摘20年", 5);
        books[3] = new Book("java从入门到放弃~", 300);

        //(1)price o从高到底排

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book)o1;
                Book book2 = (Book)o2;
                //要求按照署名的长度来进行排序
                //return book.getName().length() - book2.getName().length();
                double priceVal = book2.getPrice() - book1.getPrice();//这里需将int转换为double，不然报错。
                if (priceVal > 0) {
                    return 1;//如果发现结果相反，就互换1 和 -1 的位置。
                } else if (priceVal < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", price=" + price +
                '}';
    }
}

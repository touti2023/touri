package Day0525.stringbuilder_;

public class StringBuilder01 {
    public static void main(String[] args) {

        /*
        1.StringBuilder 继承 AbstractStringBuilder 类
        2.实现了 Serializable，说明 StringBuilder 对象可以串行化
        3.StringBuilder 是final 类，不能被继承
        4.StringBuilder 对象字符序列仍然是存放在其父类 AbstractStringBuilder 的 char[] value;因此在堆中
        5.StringBuilder 的方法，没有做互斥处理，即没有 关键字 synchronized，因此在单线程的情况下使用 StringBuilder
         */
        StringBuilder stringBuilder = new StringBuilder();

    }
}

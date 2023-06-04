package Day0526.collection_;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        /*
        1.集合主要是两组（单列集合，双列集合）
        2.接口Collection 有两个重要的子接口 List Set，他们的实现子类都是单列集合。
        3.接口Map 的实现子类是 双列集合，存放的k-v
         */
        ArrayList arrayList = new ArrayList();//单列集合
        arrayList.add("jcak");
        arrayList.add("tom");

        HashMap hashMap = new HashMap();//双列集合
        hashMap.put("NO1","pekin");
        hashMap.put("NO","shanghai");

    }
}

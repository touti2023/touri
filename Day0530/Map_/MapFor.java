package Day0530.Map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put("邓超",new Book("",100));
        map.put("邓超" ,"孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘灵甫",null);
        map.put(null,"sl");
        map.put("鹿晗","关晓彤");

        //第一组：先去除所有的Key，通过Key，取出对象的Value
        Set keyset = map.keySet();
        //1.增强for
        System.out.println("========第一种方式=======");
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        //2.迭代器
        System.out.println("========第二种方式=======");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //第二组：把所有的values取出
        Collection values = map.values();
        //1.增强for
        System.out.println("========取出所有的value=======");
        for (Object value : values) {
            System.out.println(value);
        }

    }
}

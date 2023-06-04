package Day0530.Map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"all"})
public class MapSource_ {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("no1", "hsj");
        map.put("no2", "zwj");
        map.put(new Cat(),new Person());
        
        /*
        1.k-v最后是 HashMap$Node node = newNode(hash,key,value,null)
        2.k-v为例分别程序员遍历，还会 创建 EntrySet 集合，该集合存放的元素类型 Entry，而一个Entry对象
          就有k，v：EntrySet<Entry<k,v>> 即: transient Ste<Map.Entry<K,V>> entrySet;
        3.entrySet中，定义的类型是Map.Entry , 但是实际上存放的还是 HashMap¥Node
          这时因为  HashMap¥Node calss Node<K,V> implements Map.entry<K,V>
        4.当把 HashMap¥Node 对象 存放在 entrySet 就方便我们的遍历，因为Map.Entry 提供类重要方法
          K getKey();V getBalue();
         */

        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object obj : set) {


            //System.out.println(obj.getClass());
            //为了从 HashMap¥Node 取出 k-v
            //1.先做一个向下转型
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());

        }

        Set set1 = map.keySet();
        System.out.println(set1.getClass());
        Collection values = map.values();
        System.out.println(values.getClass());

    }
}
class Cat {

}

class Person {

}
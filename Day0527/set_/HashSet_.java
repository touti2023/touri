package Day0527.set_;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"all"})
public class HashSet_ {
    public static void main(String[] args) {
        //1.构造器走的源码
        /*
            public HashSet() {
                map = NEW HASHMAP<>();
            }
          2.HashiSet 可以存放null，但是只能有一个null，即元素不能重复
          3.HashSet不保证存放元素的顺序和取出顺序一致
         */
        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet" + hashSet);
    }
}

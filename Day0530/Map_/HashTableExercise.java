package Day0530.Map_;

/*
HashTable基本介绍

1.存放的元素是键值对：即k-v
2.hashtable的键和值都不能为null，运行会抛出异常
3.使用方法基本与HashMap一样
4.hashTable是线程安全的，hashMap是线程不安全的
 */

import java.util.Hashtable;

//看一下案例
@SuppressWarnings({"all"})
public class HashTableExercise {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("john",100);
        //table.put(null,100);//异常
       // table.put("john",null);//异常
        table.put("lucy",100);
        table.put("lic",100);
        table.put("lic",88);//替代
        System.out.println(table);
    }
}

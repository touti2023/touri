package Day0530.Map_;

import java.util.Properties;
@SuppressWarnings({"all"})
/*
  Properties 的基本使用
  1.Properties 类 继承了 Hashtable
  2.可以通过k-v存放数据，但不能为null
  3.如果k相同，则v会被替换
 */
public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("john",100);//k-v
        //properties.put(null,100);
        //properties.put("john",null);
        properties.put("lucy",100);
        properties.put("lic",100);//被替换
        properties.put("lic",88);//替换

        System.out.println(properties);

        //如何通过k 获取对应值:properties.get()
        System.out.println(properties.get("lic"));

        //删除值 properties.remove()
        properties.remove("lic");
        System.out.println(properties);

        //修改值
        properties.put("john","约翰");
        System.out.println(properties);

        //查找
        System.out.println(properties.get("john"));

    }
}

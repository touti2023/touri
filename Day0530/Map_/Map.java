package Day0530.Map_;

import java.util.HashMap;

@SuppressWarnings({"all"})
public class Map {
    public static void main(String[] args) {
        //Map 接口实现类的特点，使用实现类HashMap
        //1.Map与Collection并列存在。用于保存具有映射关系的数据：k-v（双列元素）
        //2.Map中的k和v可以是任何引用类型的数据，会封装到HashCode对象中
        //3.Map中的k不允许重复，如有重复，新的替换旧的。
        //4.Map的k可以为null，但只能有一个，v可以有多个null

        HashMap hashMap = new HashMap();
        hashMap.put("no1", "hsp");//k-v
        hashMap.put("no2", "zwj");//k-v
        hashMap.put("no1", "zsf");//k-v //k重复，张三丰替换韩顺平
        hashMap.put("no3", "zsf");//k-v //k不重复，张三丰可以添加。
        hashMap.put(null,null);
        hashMap.put(null,"abc");


        System.out.println(hashMap);


    }
}

package Day0530.Map_;


import java.util.HashMap;
@SuppressWarnings({"all"})
public class MapMethod {
    public static void main(String[] args) {
        //演示map接口 常用的方法

        HashMap map = new HashMap();
        map.put("邓超",new Book("",100));
        map.put("邓超" ,"孙俪");
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘灵甫",null);
        map.put(null,"sl");
        map.put("鹿晗","关晓彤");

        System.out.println(map);

        //remove ：删除映射关系
        map.remove(null);
        System.out.println(map);
        //get:获取值
        Object val = map.get("鹿晗");
        System.out.println(val);
        //size:获取元素个数
        System.out.println(map.size());
        //isEmpty：判断个数是否为0
        System.out.println(map.isEmpty());//F
        //clear：清除
        map.clear();
        System.out.println(map);
        //containsKey：查找键是否存在



    }
}
class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
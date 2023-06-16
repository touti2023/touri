package Day0616.listdemo.test;

import java.util.ArrayList;
//字符串
public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("点赞类吗？");
        list.add("收藏了吗？");
        list.add("投币了吗？");
        list.add("转发类吗？");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1)  {
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");
    }
}

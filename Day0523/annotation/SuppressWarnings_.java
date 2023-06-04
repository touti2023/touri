package Day0523.annotation;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarnings_ {

    //1.当我们不希望看到这些警告的时候，可以使用 SuppressWarnings 来抑制这些警告信息。
    //2.在{""}中，可以写入你希望抑制（不显示）警告信息。
    
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(1);
    }
}



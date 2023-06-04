package Day0525.date_;

import java.time.LocalDateTime;

//第三代日期
public class localDate_ {
    public static void main(String[] args) {

        //1.使用now() 返回表示当前日期时间的 对象
        LocalDateTime ldt = LocalDateTime.now();//
        System.out.println(ldt);
        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonth());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());
    }
}

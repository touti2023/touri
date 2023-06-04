package Day0525.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args) throws ParseException {

        //1.获取当前系统时间
        //2.这里的Date 类是在java.util包
        //3.默认欧美日期输出格式，通常需要格式转换。
        Date d1 = new Date();//获取当前系统
        System.out.println("当前日期是：" + d1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);//转换成指定字符串格式
        System.out.println("当前日期是：" + format);

        //1.把一个格式化的String 转成对应的 Date
        //2.得到Date 仍然在输出时，还是按照国外的形式，需要转型。
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println("parse=" + parse);
    }
}

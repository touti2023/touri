package Day0525.wrapper;
//包装类型和String类型的相互转换
//以Integer 和 String 转换为例，其他类似
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类Integer ->  String
        Integer i = 100;//自动装箱
        //方式1
        String str1 = i + "";
        //方式2
        String str2 = i.toString();
        //方式3
        String str3 = String.valueOf(i);

        //String -> 包装类Integer
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);


        System.out.println("ok");

    }
}

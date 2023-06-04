package Day0526;

public class Homework04 {
    public static void main(String[] args) {
        String str = "abcdHsp U 1234";
        countStr(str);
    }

    /*
    输入字符串，判断里面有多少个大写字母，多少个小写字母，多少个数字。

    思路分析：
    1.遍历字符串，如果 char 在‘0‘ 到’9‘，就是一个数字
    2.如果 char 在’a‘到’z‘，就是一个小写字母
    2.如果 char 在’A‘到’Z‘，就是一个大写字母
    4.使用三个变量来记录，统计结果
     */

    public static void countStr(String str) {
        if (str ==null) {
            System.out.println("输入不能为null");
            return;
        }
        int strLen =str.length();
        int numCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        for (int i = 0; i < strLen; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                numCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                lowerCount++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upperCount++;
            }
        }

        System.out.println(" 数字有: " + numCount);
        System.out.println(" 小写字母有: " + lowerCount);
        System.out.println(" 大写字母有: " + upperCount);
    }
}

package Day0525.homework_;

public class Homework01 {
    public static void main(String[] args) {
        String str ="abcdef";
        System.out.println("------交换前------");
        System.out.println(str);
        str = reverse(str, 1, 4);
        System.out.println("-----交换后-----");
        System.out.println(str);

    }
        /*
        将字符串中指定部分进行反转。
         */

    public static String reverse(String str, int start, int end) {
            char[] chars = str.toCharArray();
            char temp = ' ';
        for (int i = start, j = end; i < j; i++,j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;

        }
        return new String(chars);
    }
}


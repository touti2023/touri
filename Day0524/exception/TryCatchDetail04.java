package Day0524.exception;

import java.util.Scanner;

//try - catch 异常处理
//如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止。
public class TryCatchDetail04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = " ";
        while(true) {

            System.out.println("请输入一个整数:");
            try {
                inputStr = scanner.next();
                num = Integer.parseInt(inputStr);//这里是可能抛出异常。
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是整数。");
            }

        }
        System.out.println("你输入的值是=" + num);
    }
}

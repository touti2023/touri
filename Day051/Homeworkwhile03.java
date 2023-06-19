
/*
2.实现判断一个年是否为闰年.
 */

import java.util.Scanner;
public class Homeworkwhile03 {
	
	public static void main(String[] agrs) {
		 Scanner myScanner =new Scanner(System.in);
		 System.out.println( "请输入年份");
		 int n = myScanner.nextInt();
		 if(( n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
			 System.out.println(n + "年 是 闰年");
		 }else {
			 System.out.println(n + "年 不是 闰年");
		 }
		
		
	}
}
		
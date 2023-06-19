
/*
2.判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
例如:153 = 1*1*1 + 3*3*3 +5*5*5

思路分析:
1.输入一个整数 用Scanner 取个对象myScanner接收。
2.先得到接收数的百位，十位，个位的数字，在使用if判断立方和是否和接收数字相等。
3.百位数 = my / 100
4.十位数 = my % 100 / 10
5.个位数 = my % 10
 */

import java.util.Scanner;
public class Homeworkwhile04 {
	
	public static void main(String[] agrs) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个3位数整数");
		int n = myScanner.nextInt();
		int n1 = n / 100;
		int n2 = n % 100 / 10;
		int n3 = n % 10;
		
		if(n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == n ) {
			System.out.println(n +" 是 水仙花数");
		}else  {
			System.out.println(n +" 不是 水仙花数");
		}
		
		
	}
}
/*
 * Switch 快速入门
 * 
 * 案例：
 * 1.请编写一个程序，该程序可以接受一个字符， 比如：a,b,c,d,e,f,g
 * 2.a表示星期一,b表示星期二...
 * 3.根据用户的输入显示相应的信息，要求使用switch语句完成。
 * 
 */

import java.util.Scanner;
public class Switch01 {

	public static void main(String[] agrs) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（a-g)");
		
		char c1 = myScanner.next().charAt(0);
		
		//在java中，只要是有值返回，就是一个表达式。
		//switch的语法：Switch（表达式），因此，下面的c1可以作为一个表达式。
		switch(c1)  {
			case 'a' :
				System.out.println("今天是星期一");
				break;
				
			case 'b' :
				System.out.println("今天是星期二");
				break;
				
			case 'c' :
				System.out.println("今天是星期三");
				break;
			
			case 'd' :
				System.out.println("今天是星期四");
				break;
				
			case 'e' :
				System.out.println("今天是星期五");
				break;
				
			case 'f' :
				System.out.println("今天是星期六");
				break;
				
			case 'g' :
				System.out.println("今天是星期日");
				break;
				
			default:
				System.out.println("你输入的字符不正确，没有匹配");
		}
				
		System.out.println("退出了switch，继续执行程序");
	}
	
}
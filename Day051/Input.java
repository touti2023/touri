/* 键盘输入语句

 介绍：
 在编程中，需要接受用户输入的数据，就可以使用键盘输入语句来获取。
 Input.java，需要一个扫描器（对象），就是Scanner。
  步骤：
  1.倒入该类的所在包，java。util.*
  2.创建该类对象（声明变量）
  3.调用里面的功能。

*/

//案例演示：
//演示接收用户的输入
//要求：可以从控制台接受不了用户信息，【姓名，年龄，薪水】。

import java.util.Scanner;//表示吧java.util下的Scanner类导入

public class Input {
	
	public static void main(String[] agrs) {
	
		Scanner myScanner = new Scanner(System.in);//new创建一个对象，myScanner就是Scanner的对象。
		System.out.println("请输入名字");
		String name = myScanner.next();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水");
		double sal = myScanner.nextDouble();
		System.out.println("人的信息如下");
		System.out.println("名字=" + name + "年龄"+ age + "薪水" + sal);
			
		
		
		
		

		
		
		
		
	      }
	}
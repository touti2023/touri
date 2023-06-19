/*
 * 应用案例 02
 出票系统：根据淡旺季的月份和年龄，打印票价
 4-10月为旺季
 成人（18-60）：60元
 未成年人（《18） ： 半价
 老人（>60):1/3元
 
 
 淡季：
 成人40元
 未成年人，老人：20元
 
 */

import java.util.Scanner;
public class Nestedlf02 {
	public static void main(String[] agrs) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.print("请输入您想进入游泳馆的月份");

		int month = myScanner.nextInt();
		
		if(month >= 4 && month <= 10) { 
			
			System.out.println("请输入您的年龄");
			
			byte age = myScanner.nextByte();
			
			if(age >= 18 && age <60) {
				
			System.out.println("您的票价为 60元");
			
			}else if(age < 18) {
			
				System.out.println("您的票价为 30元");
			
			}else if(age >= 60) {
				
				System.out.println("您的票价为 20元");
			}
		
		}else if(month < 4 && month > 10) {
		
			System.out.println("请输入您的年龄");
			byte age = myScanner.nextByte();
			if(age >= 18 && age < 60) {
			System.out.println("您的票价为 40元");
		}else {
			System.out.println("您的票价为 20元");
		     }			
		  }
	   }		
	}
		
	
	                                    
	


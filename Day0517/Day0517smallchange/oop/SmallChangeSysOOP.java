package Day0517smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
该类是完成零钱通的各个功能的类
使用OOP（面向对象编程）
将每个功能对应一个方法
 */

public class SmallChangeSysOOP {

	//属性可以复制过来
	//定义相关的变量
			boolean loop = true;
			Scanner scanner = new Scanner(System.in);
			String key = "";
			
			//2.完成零钱通明细
			//1.可以吧收益入账和消费保存到数组。2.可以使用对象。3.可以使用简单地String拼接。这里选第三种完成，较简单。
			String details = "-----------零钱通明细-----------";
			
			
			//3.完成收益入账，完成功能，增加新的变量和代码。
			//定义新的变量
			double money = 0;
			double balance = 0;
			Date date = null;//date 是java.util.Date类型，表示日期
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			
			//4.消费
			//定义新变量，保存消费途径。
			String note = "";
	
	//1.先完成显示菜单，并可以选择。
	public void mainMenu() {
do {
			
			System.out.println("\n---------------零钱通菜单---------------");
			System.out.println("\t\t\t1 零钱通明细");
			System.out.println("\t\t\t2 收益入账");
			System.out.println("\t\t\t3 消费");
			System.out.println("\t\t\t4 退     出");
			
			System.out.print("请选择1-4");
			key = scanner.next();
			
			//使用swutch 分支控制
			switch(key) {
			case "1" :
				this.detail();
				break;
			
			case "2" :
				this.income();
				break;
				
			case "3" :
				this.pay();
				break;
				
			case "4" :
				this.exit();
				break;
			default:
				System.out.println("选择有误，请重新选择。");
			}
		}while (loop);
	}
	
	
	//2.完成零钱通明细
	public void detail() {
		System.out.println(details);
	}
	
	//3.完成收益入账
	public void income() {
		System.out.println("收益入账金额:");
		money = scanner.nextDouble();	
		//money 的值应该校验。
		//找出**不正确**的金额条件，给出提示，直接return。（找正确的条件会累死）
		if(money <= 0) {
			System.out.println("收益入账金额 需要 大于 0");
			return;
		}
		
		//余额
		balance += money;
		//拼接收益入账信息到 details
		date = new Date();//获得当前日期
		details += "\n收益入账\t+" + money + "\t" + sdf.format(date) +"\t" + balance;
	}
	
	//4.消费
	public void pay() {
		System.out.println("消费金额:");
		money = scanner.nextDouble();	
		//money 的值应该校验。
		//找出**不正确**的金额条件，给出提示，直接break。（找正确的条件会累死）
		if(money <= 0 || money > balance) {
			System.out.println("你的消费金额 应在 0 -" + balance + "之内");
			return;
		}
		System.out.println("消费说明:");
		note = scanner.next();
		balance -= money;
		
		//拼接消费信息到 details
		date = new Date();//获得当前日期
		details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
	}
	
	//退出
	public void exit() {
		String choice = "";
		while(true) {
			System.out.println("你确定要退出吗？ y/n");
			choice = scanner.next();
			if("y".equals(choice) || "n".equals(choice)) {
				break;
			}
		}
		//当用户退出while 后，进行判断
		if(choice.equals("y")) {
		loop = false;
		}
	}
	
}

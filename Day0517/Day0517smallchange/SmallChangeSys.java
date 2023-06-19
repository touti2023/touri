package Day0517smallchange;
import java.text.SimpleDateFormat;
//零钱通
/*
1.先完成显示菜单，并可以选择菜单，给出对应提示
2.完成零钱通明细
3.完成收益入账
4.消费
5.退出时，给出提示y/n
6.在入账和消费时，判断金额是否合理，并给出相应的提示。

 */
import java.util.Date;
import java.util.Scanner;
public class SmallChangeSys {

	public static void main(String[] args) {
		
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
				System.out.println(details);
				break;
			
			case "2" :
				System.out.println("收益入账金额:");
				money = scanner.nextDouble();	
				//money 的值应该校验。
				//找出**不正确**的金额条件，给出提示，直接break。（找正确的条件会累死）
				if(money <= 0) {
					System.out.println("收益入账金额 需要 大于 0");
					break;
				}
				
				//余额
				balance += money;
				//拼接收益入账信息到 details
				date = new Date();//获得当前日期
				details += "\n收益入账\t+" + money + "\t" + sdf.format(date) +"\t" + balance;
				
				break;
				
			case "3" :
				System.out.println("消费金额:");
				money = scanner.nextDouble();	
				//money 的值应该校验。
				//找出**不正确**的金额条件，给出提示，直接break。（找正确的条件会累死）
				if(money <= 0 || money > balance) {
					System.out.println("你的消费金额 应在 0 -" + balance + "之内");
					break;
				}
				System.out.println("消费说明:");
				note = scanner.next();
				balance -= money;
				
				//拼接消费信息到 details
				date = new Date();//获得当前日期
				details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
				break;
				
			case "4" :
				//用户输入4 退出时，给出提示“你确定要退出吗？y/n”，必须输出正确的y/n，否则循环输入指令，直到输出y 或者 n。
				//1.定义一个变量 choice，接受用户输入
				//2.使用while + break,来处理接收到的输入是y 或者 n
				//3.退出while后，在判断choice是y还是n，就可以决定是否退出。
				
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
				break;
			default:
				System.out.println("选择有误，请重新选择。");
			}
		}while (loop);
		System.out.println("你已退出 零钱通项目。");
		
	}
}

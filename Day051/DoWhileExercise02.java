
/*

 4.如果张三不还钱，则老韩一直使出五连鞭，直到张三说还钱为止 DoWhileExercise02
   【System.out.println("老韩问:还钱吗？"); 
 
 思路:
 1.不停地问还钱吗？
 2.使用char ansnswer 接收 回答。定义一个Scaaner对象
 3.在Do-while 的while 判断如果不是yes，就继续循环。
 */
import java.util.Scanner;
public class DoWhileExercise02 {
	
	public static void main(String[] agrs) {
		 Scanner myScanner = new Scanner(System.in);
		
		 char answer = ' ';
		do {
			System.out.println("马保国使出五连鞭");
			System.out.println("保国问;还钱吗？？！！！");
			
			answer = myScanner.next().charAt(0);
			System.out.println("张三的回答是" + answer);
		}while(answer != '还');
		System.out.println("张三还钱了，意外触发剧情，获得了传说级别武器【青龙偃月刀】！！！！！");
		}
 }

//if快速入门

//编写一个程序，可以输入人的年龄，如果该人的年龄大于18岁，
//则输出“你年龄大于18岁，要对自己的行为负责，送入监狱”

//思路分析
//1.接受输入的年龄，应该定义一个Scanner 对象
//2.把年龄保存到一个变量int age
//3.用if判断
//4.输出独对应信息
import java.util.Scanner;
public class If01 {
	
	public static void main(String[] agrs) {
		
		Scanner myScanner = new Scanner(System.in); 
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		if(age >=18) {
			System.out.println("你的年龄大于18岁，要对自己的行为负责，送入监狱");
			}else{
			System.out.println("满18后再进去");
		}
		
		
		
	}
}
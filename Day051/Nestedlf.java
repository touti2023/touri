
/*
 * 应用案例
 * 参加歌手比赛，
 * 如果初赛成绩大于8.0进入决赛，否则提示淘汰。
 * 并且根据性别提示进入男子组或女子组。
 * 输入成绩和性别
 * 进行判断
 * 输出信息
 */




import java.util.Scanner;
public class Nestedlf {
	
	public static void main(String[] agrs) {
	
	Scanner myScanner = new Scanner(System.in);
	//System.out.println("请输入歌手成绩和性别");
	System.out.println("请输入歌手成绩");
	
	double score = myScanner.nextDouble();
	
	
	/*
	 if(score >= 8.0 && gender == '男') {
		System.out.println("恭喜你进入男子组决赛");
	}else if(score >= 8.0 && gender == '女' ) {
		System.out.println("恭喜你进入女子组决赛");
	}else {
		System.out.print("很遗憾，你被淘汰了");
	}
	*/
	if(score >= 1 && score <= 10) 
	   if(score >= 8.0) {
		System.out.println("请输入性别");
		char gender = myScanner.next().charAt(0);
		if(gender == '男') {
			System.out.println("恭喜你，进入男子组决赛！");
		}else if(gender == '女') {
			System.out.println("恭喜你，进入女子组决赛！");
		}else {
			System.out.println("性别错误，请退出系统，并重新输入 男或女");
		}
	    }else {
		System.out.println("很遗憾，你被淘汰了。");
	}else {
		System.out.println("输入有误，请退出重新输入：）");
	}
	   }   
	     }

import java.util.Scanner;
public class SwitchExercise {
	
	public static void main(String[] agrs) {
		
		//使用switch，把小写类型的char型转化为大写（键盘输入）。只转换a,b,c,d,e.  其他的输出"other"。
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入a-e");
		char c1 = myScanner.next().charAt(0);
		switch(c1) {
		    case 'a' :
		    	System.out.println("A");
		    	break;
		    	
		    case 'b' :
		    	System.out.println("B");
		    	break;
		    	
		    case 'c' :
		    	System.out.println("C");
		    	break;
		    	
		    case 'd' :
		    	System.out.println("D");
		    	break;
		    case 'e' :
		    	System.out.println("E");
		    	break;
		    	
		    default:
		    	System.out.println("你的输入有误");
		}
		
		
	//对学生成绩大于60分的，输出“合格”。低于60分的，输出“不合格”。
	//注：输入的成绩不能大于100），提示 成绩/60
	//思路分析：
	//1.这道题，可以使用 分支来完成，但是要求使用switch
	//2.这里我们需要进行一个转换，编程思路：
	//如果成绩在【60，100】，（int）(成绩/60) = 1
	//如果成绩在【0，60），（int）（成绩/60） = 0 
		
		double score = 88.5;
		switch ((int)(score / 60)) {
		    case 0 :
		    	System.out.println("你的成绩不合格");
		    	break;
		    	
		    case 1 :
		    	System.out.println("你的成绩合格");
		    	break;
		default :
			    System.out.println("输入有误");
		}
	}
}
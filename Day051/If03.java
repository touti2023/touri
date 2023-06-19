
/*

案例演示1
输入保国同志的芝麻信用分：
如果：
1.信用分为100分时，输出 信用极好；
2.信用分为81-99时，输出 信用优秀；
3.信用分为60-80时，输出 信用一般；
4.其他情况，输出 信用不良；
请从键盘输入保国的芝麻信用分，并加以判断。

*/
import java.util.Scanner;
public class If03 {
	
	public static void main(String[] agrs) {
	
	Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入信用分(1-100)：");
		int grade = myScanner.nextInt();
		
		if(grade >= 1 && grade <= 100) {
		
		if(grade == 100){
		        System.out.println("信用极好");
		        
		}else if( 80 < grade && grade <=99){
		        System.out.println("信用优秀");
		        
		}else if( 60 < grade && grade <=80) {
		        System.out.println("信用一般");
		        
		}else {
		        System.out.println("信用不良");}
		
		}else {
			    System.out.println("输入有误，请重新输入：）");
		}
		
		
	
	    }
	}
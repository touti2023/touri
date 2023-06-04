
//1.打印出1-100之间能被3整除的数
//2.打印40-200之间所有的偶数
public class WhileExercise {

	public static void main(String[] agrs) {
	
		int i = 1;
		int n = 100;
		int t = 3;
		while(i <= n)  {
		 if(i % t ==0) {	
			System.out.println("1-100之间能被3整除的数有:" + i);
		 }
		i++;	
		}
		
	//2
		int count = 0;
		int start = 40;
		int end = 200;
		while(start <= end) {
			if(start % 2 == 0) {
				System.out.println("start=" + start);
				count++;
				
			}
			start++;
		}
		System.out.println("个数为:" + count);
   }
}
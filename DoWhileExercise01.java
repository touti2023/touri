
// 1.打印1-100
// 2.计算1-100之和
// 3.统计1-200之间能被5整除但不能被3整除的个数 DoWhileExercise01

public class DoWhileExercise01 {
	
	public static void main(String[] agrs) {
		int sum = 0;
		int i = 1;
		int count = 0;
		do {
			System.out.println("1-200=" + i);
			
			sum += i;
			if (i % 5 ==0 && i % 3 != 0) {
			count++;
			}
			i++;
		} while (i <= 200);
		System.out.println("总和为:" + sum);
		System.out.println("1-200之间能被5整除但不能被3整除的个数为:" + count);	
	}
 }
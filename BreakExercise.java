
/*
课堂练习
1.   1-100以内的数求和，求出 当和第一次大于20的当前数【for+break】

*/

public class BreakExercise {
	
	public static void main(String[] agrs) {
		
		//思路分析
		//1.循环1-100，求和 sum
		//2.当 sum > 20时，记录下当前数，然后break。
		
		int sum = 0;//累积和
		for(int i = 1; i <= 100; i++ ) {
			sum += i;//累积
			if(sum > 20) { 
				System.out.println("和 > 20的时候，当前数i=" + i);
				break;
			}
		}
	}
}
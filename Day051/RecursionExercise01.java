
public class RecursionExercise01   {
	
	public static void main(String[] agrs) {
	/*
	请使用递归的方式求出斐波那契数1，1，2，3，5，8，13......给你一个整数n，求出他的值是多少。	
	思路分析；
	1. 当n = 1，斐波拉契数为 1
	2. 当n = 2，斐波拉契数为 1
	3. 当n >= 3，斐波拉契数为 前两数之和
	4. 这就是一个递归思路
	 */
		T1 t1 = new T1();
		int n = 3;
		int res = t1.fibonacci(n);
		if(res != -1) {
			System.out.println("当n=" + n + "对应的其波那契数=" + res);
		}
	}
}

class T1 {
	public int fibonacci(int n) {
		if(n >= 1) {
		if( n == 1 || n ==2) {
			return 1;
		}else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}else {
		System.out.println("要求输入 n>=1 的 整数");
		return -1;
	}
	}
}
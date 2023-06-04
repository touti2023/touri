
//1.打印1～100之间所有的是9的倍数的整数，统计个数 及 总和。【化繁为简，先死后活】
//完成下面的表达式输出
//1.化繁为简：将复杂的需求，拆解成简单的需求，逐步完成。
//2.先死后活：先考虑固定值，然后转成可以灵活变化的值。

public class ForExercise {
	public static void main(String[] agrs) {
		 
		int count = 0;
		int sum = 0;
		int start = 1;
		int end = 100;
		int t = 9;
		for(int i = start;i <= end; i++) {
			if(i % t == 0) {
				System.out.println("i=" + i);
				count++;
				sum += i;
			}
		}
		System.out.println("统计个数为=" + count);
		System.out.println("总和为：=" + sum);
	}
}
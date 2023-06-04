/*
输出1-100之间的不能被5整除的数，每一行5个。

 思路分析:
 1.先输出1-100的所有数；
 2.然后过滤出 不能被5整除的数
 3.设置计数器变量 int count = 0；统计个数，当 count % 5 = 0就说明输出了5个，这是输出一个换行即可。
 
 */



public class Homeworkwhile06 {
	
	public static void main(String[] agrs) {
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 5 != 0) {
				count++;
			System.out.print(i + "\t"); //注意print不换行，制表位对其
			
			if(count % 5 ==0) {
				System.out.println();//换行
			}
		}
		}
		
	}
}
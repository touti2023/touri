/*
输出小写的a-z以及大写的Z-A。

 思路分析:
 1.‘b’ = 'a' + 1   //'c' = 'a' + 2 查 阿克斯吗表得知
 2.使用 for 搞定

 */



public class Homeworkwhile07 {
	
	public static void main(String[] agrs) {
		for(char c1 = 'a'; c1 <= 'z'; c1++) {
			System.out.print(c1 + " ");
		}
		
			System.out.println();

		for(char c2 = 'Z'; c2 >= 'A'; c2--) {
			System.out.print(c2 + " ");
		}
	}
}
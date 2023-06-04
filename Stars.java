/*

多重循环控制
实心金字塔

*/

public class Stars {
	
	public static void main(String[] agrs) {
		
		for(int i = 1; i <= 5; i++ ) {  //层数
			
			for(int k = 1; k <= 5 - i; k++) { //在输出*之前，输出对应 空格 =总层数5 - 当前层 i
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++) { //星星数
			System.out.print("*");
			}
			System.out.println();//每打完一层*后，换行。
		}
		
	}
}
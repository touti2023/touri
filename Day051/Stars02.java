/*

多重循环控制
空心金字塔

*/

public class Stars02 {
	
	public static void main(String[] agrs) {
		
		int totalLevel = 15;//层数
		for(int i = 1; i <= totalLevel; i++ ) {  //变量层数
			
			for(int k = 1; k <= totalLevel - i; k++) { //在输出*之前，输出对应 空格 =总层数5 - 当前层 i
				System.out.print(" ");
			}
			for(int j = 1; j <= 2 * i - 1; j++) { //星星数
				if(j == 1 || j == 2 * i - 1 || i == totalLevel ) { //第一个位置或后最后一个位置都打*，最后一行全打*。
			    System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();//每打完一层*后，换行。
		}
		
	}
}
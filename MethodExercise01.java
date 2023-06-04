
//练习
//编写一类AA新方法：判断一个数时奇数还是偶数，返回boolean
public class MethodExercise01   {
	
	public static void main(String[] agrs) {
		
		AAS a = new AAS();
		a.print(4,4,'#');
		
		if(a.isOdd(1)) {
		System.out.println("是奇数");
	}else {
		System.out.println("是偶数");
	}
}
}
//思路：
//1.方法返回类型；boolean
//2.方法名；isOdd
//3.方法形参；(int num)
//4.方法体 判断
class AAS {
	public boolean isOdd(int num) {
	//	if(num % 2 != 0) {
	//		return true;
	//	}else {
	//		return false;
	//	}
		
	//	return num % 2 != 0 ? true; false;
		return num % 2 != 0;
	}
	
	//根据行，列，字符打印  对应行数和列数的字符，
	//例如；行：4，列；4，字符#，则打印相应的效果
	
	/*
	 ####
	 ####
	 ####
	 ####
	 */
	
	//思路：
	//1.方法返回类型；void
	//2.方法名；print
	//3.方法形参；(int row, int col,char c)
	//4.方法体 循环
	public void print(int row, int col, char c) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(c);
			}
			System.out.println();
	
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

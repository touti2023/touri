
//打印出九九乘法表

public class MulForExercise02 {
	public static void main(String[] agrs) {
		for(int i = 1; i <= 9; i++) {
		for(int j = 1; j <= i; j++) {
			
			System.out.print(j + "*" + i + "=" + i * j + "\t");
			
		}
	}
	}
}
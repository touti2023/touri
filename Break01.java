
//跳转控制语句 break
//快速入门:

public class Break01 {
	
	public static void main(String[] agrs) {
		
		for(int i = 0; i < 10; i++) {
			if( i == 3) {
				break;
			}
			System.out.println("i=" + i);
		}
		
	}
}
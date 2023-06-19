
public class Return01 {
	
	public static void main(String[] agrs) {
		
		for(int i = 1; i <= 5;i++) {
			
			if(i == 3) {
				
				System.out.println("游戏王" + i);
				
				return;//continue; break;
				
			}
			System.out.println("你好，世界");
		}
		System.out.println("继续");
	}
}
		
		
		
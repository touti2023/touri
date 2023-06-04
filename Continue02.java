


public class Continue02 {
	
	public static void main(String[] agrs) {
		
		
		label1:
			for(int j = 0; j < 4; j++) {
				label2:
					for(int i = 0; i < 10; i++) {
						if(i == 2) {
							//continue label1//0101
							continue;//013456789*4
						}
						System.out.println("i=" + i);
					}
			}
	}
}
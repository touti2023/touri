package Day0511;

public class Homework07 {
	
	int count = 9;
	public void count1() {
		count = 10;
		System.out.println("count=" + count);
	}
	public void count2() {
		System.out.println("count1=" + count++);
	}
	
	public static void main(String[] agrs) {
		new Homework07().count1();
		Homework07 h1 = new Homework07();
		
		h1.count2();
		h1.count2();
	}
}


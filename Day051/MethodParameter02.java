
public class MethodParameter02   {
	
	public static void main(String[] agrs) {
		BS b= new BS();
		int[] arr = {1,2,3};
		b.test100(arr);
		System.out.println("main的arr数组");
		
		//遍历数组
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}

class BS {
	public void test100(int[] arr) {
		arr[0] = 200;
		System.out.println("test100的arr数组");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
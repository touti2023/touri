
public class MethodParameter01   {
	
	public static void main(String[] agrs) {
 		
 		int a = 10;
 		int b = 20;
 		
 		//创建AA对象
 		AAR obj = new AAR();
 		obj.swap(a, b);//调用swap方法
 		
 		System.out.println("住"
 				+ "主方法 a=" + a + "b=" +b);
	}
}

class AAR {
	public void swap(int a,int b) {
		
		
		System.out.println("\na和b交换前的值 \na=" + a + "\tb=" +b);
		//完成了a和b的交换
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("\na和b交换后的值 \na=" + a + "\tb=" +b);
	}
}

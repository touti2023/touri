
public class ForceConvert {
	
	public static void main(String[] agrs) {
		
		//演示强制类型转换,强制转换符为（ ）
		
		int n1 = (int)1.9;//1 精度损失，自动略掉0.9   
		System.out.println("n1=" + n1);
		
		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1=" + b1);//造成数据溢出
		
		
	}
}
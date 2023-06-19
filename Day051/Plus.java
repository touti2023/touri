public class Plus {
	
	public static void main(String[] agrs) {
	
		System.out.println(100 + 98);//198
		System.out.println("100" + 98);//10098
		
		System.out.println(100 + 3 + "hello");//103hello
		System.out.println("hello" + 100 + 3);//hello1003
		
	}
}
//1.当+号左右两边为数值型事，做加法运算；
//2.当+号两边有一方为字符串，即“x”时，做拼接运算。
//3.运算顺序：从左往右。
//*第三个指令第一次猜答案时认识错误，注意为：先加后接。
//*第四个指令由于运算顺序，所以结果和第三个不同，要注意。
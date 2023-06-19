
public class ForceConvertDetail {
	
	public static void main(String[] agrs) {
		
		
		//演示强制类型转换
		//强转符号只针对最近的操作数有效，往往会使用小括号提升优先级。
		//int x = (int)10 * 3.5 + 6 * 1.5;//编译错误：double不可---》int  
		int x = (int) (10 * 3.5 + 6 * 1.5);
		System.out.println(x);//44正确
		
		//char类型可以保存int的常量值，不能保存int的变量值，需要强转。
		char c1 = 100;//ok
		int m = 100;//ok
		//char c2 = m;//错误，此为int变量。
		char c3 = (char)m;//ok,强转int为char
		System.out.println(c3);//d。ASCII表：int100 -->d,因为char输出字符，因此不是100.
	}
}
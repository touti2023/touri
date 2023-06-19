

//演示字符串转基本数据类型的细节
public class StringToBasicDetail {
	
	public static void main(String[] agrs) {
		
	//在将Spring类型转成基本数据类型时，要确保String类型能够转成有效数据。比如我们可以吧“123”转成整数123，但不能把“hello”转成一个整数。
		
		String str = "123";
		//转换成int
		int n1 = Integer.parseInt(str);
		System.out.println(n1);
		
		
		
		
		
	}
}
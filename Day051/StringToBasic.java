
public class StringToBasic {
	
	public static void main(String[] agrs)  {
		
		//基本数据类型转化为 ---》String  语法： + “”
		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + s2 +s3 +s4);
		
		
		//Spring类型转换---》基本数据类型   语法：通过基本类型的包装类调用parseXX方法即可。
		String s5 = "123";
		
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		long num4 = Long.parseLong(s5);
		short num5 = Short.parseShort(s5);
		byte num6 = Byte.parseByte(s5);
		boolean b = Boolean.parseBoolean("true");
		
		System.out.println(num1);//123
		System.out.println(num2);//123.0
		System.out.println(num3);//123.0
		System.out.println(num4);//123
		System.out.println(num5);//123
		System.out.println(num6);//123
		System.out.println(b);//true
		
		//字符串转化值符char，只会得到第一个字符。  
		//解读 s5.charAt（0） 得到s5字符串的第一个字符“1”。
		System.out.println(s5.charAt(0));//结果为123的1
		
		
		
		
	}
}
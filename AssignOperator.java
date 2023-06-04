
public class AssignOperator {
	
	public static void main(String[] agrs) {
		
		//赋值运算符
		//"+=  ,-=  , *-  ,/=  ,%="
		
		int n1 = 10;
		n1 += 4;//n1 = n1 + 4
		System.out.println(n1);
		
		n1 /= 3;//n1 = n1 / 3; = 4
		System.out.println(n1);
		
		/*
		 赋值运算符的特征
		 1.赋值运算符顺序是从右往左 int num = a + b + c
		 2.赋值运算符的左边只能是变量，右边可以是变量，表达式，常量值。
		 如： int num = 20；  int num2 = 78 * 34 - 10； int num3 = a；
		 3.复合赋值运算符等价于下面的效果
		 比如：a += 3;  等价于a = a + 3;其他类推。
		 4.符合赋值运算符会进行类型转换
		 byte b = 2;  b += 3; b++;   
	
		 
		 */
		
	   byte b = 3;
	   b += 2;//b = b + 2;运算结果本身默认是int，此处会自动转换为byte ；即 b = (byte)(b + 2);
	   b++; // 同理，int  自动转换为  b = (byte)(b + 1);
	   
	   
	   
		
		
		
	}
}

public class TernaryOperatorDetail {
	
	public static void main(String[] agrs) {
	
	
	//三元运算符细节：
	//1.表达式1和表达式2要为可以赋给接收变量的类型（或可以自动转换）
		
		int a = 3;
		int b = 8;
		int c = a > b ? a : b;//可以。
     // int c = a > b ? 1.1 :3.4;  //不可以，因为double 不能对应int		
		int d = a > b ? (int)1.1 :(int)3.4;//可以，强转double为int，有精度损失。//1和3
		double d2 = a > b ? a : b + 3;//可以，double兼容int。
		
		
	//2.三元运算符可以转成if--else语句。
		if(a > b ) {int res = a++; 
		}else {
			int res = --b;
		}
		
		}
	
	     }
	
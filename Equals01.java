package Day051603obkect_;

/*
	== 和equals对比
	==是一个比较运算符
	1. == ：即可以判断基本类型，又可以判断引用类型
	2. == ；如果可以判断基本类型，判断的是值是否相等。示例：int i = 10; double d = 10.0; 
	3. == ；如果判断引用类型，判断的是地址是否相等，即判断是不是同一个对象。
	案例说明
 */
public class Equals01 {
	
	public static void main(String[] args) {
		A a = new A();
		A b = a;
		A c = b;
		System.out.println(a == c);
		System.out.println(b == c);
		
		B bj = a;
		System.out.println(bj == c);
		
		int num1 = 10;
		double num2 = 10.0;
		System.out.println(num1 == num2);
	}
}

class B{
	
}
class A extends B{
	
}
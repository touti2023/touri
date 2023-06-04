

//算术运算符 面试题1

public class ArithmeticOperatorExercise01 {
	
	public static void main(String[] agrs) {
		
		//int i = 1;
		//i = i++ ; //此处会出现临时变量，（1）temp = i = 1   （2）i = i + 1 = 2；   （3）i = temp = 1
		//System.out.println(i);//1
		
		//面试题2
		int n = 1;
		n = ++n ; //此处会出现临时变量，（1）n = n + 1 = 2 （2temp = n = 2  ；   （3）n = temp = 2
		System.out.println(n);//2
		
		//测试输出
		int i1 = 10;
		int i2 = 20;
		int i = i1++;
		System.out.print("i=" + i);//10
		System.out.println("i2=" + i2);//20
		i = --i2;
		System.out.print("i=" + i);//19
		System.out.println("i2=" + i2);//19
		
		//
				
				
		
		
		
		
		
		
	}
}
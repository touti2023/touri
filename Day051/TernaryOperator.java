

public class TernaryOperator {
	
	public static void main(String[] agrs) {
		
		/*

		三元运算符
		语法：  条件表达式？ 表达式1:表达式2；
		运算规则：
		1.如果条件表达式为：T，则运算结果为表达式1；
		2.如果条件表达式为：F，则运算结果为表达式2；
		口诀：一真

		*/
		
		//案例演示：
		
		int a = 10;
		int b = 99;
		//解读
		//1.a > b is False
		//2.返回 b--；先返回b值，然后再自减b - 1；
		//3.返回的结果是99.不是98.先赋值，再自减 ;  如果是--b,则结果是98；
		int result = a > b ? a++ :b--;
		System.out.println("result=" + result);
		
		//稍微修改一点
	    int c = 10;
	    int d =99;
	    int r = c < d ? c++ : d--;
	    System.out.println("r=" + r);//为T，运算c++//10；
	    System.out.println("c=" + c);//因为自增，所以//11；
	    System.out.println("d=" + d);//为T，不变//99；
	
	}
}
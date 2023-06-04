

//演示算术运算符的使用

public class ArithmeticOperator {
	
	public static void main(String[] agrs) {
		
		//   /➗的使用
		System.out.println(10/4);//从数学来看是2.5，java中是2.（因为默认是整数，后面就被略掉）
		System.out.println(10.0/4);//java是2.5。保留了小数位。
		
		double d = 10 / 4;//java中 10/4=2，由于是double类型，2--》2.0
		System.out.println(d);//2.0
		double d1 = 10.0/4;//2.5
		System.out.println(d1);
		
		// % 取模；取余
		//取余的结果的正负与被取数一致。
		System.out.println(10/3);//1
		System.out.println(-10/3);//-1
		System.out.println(10/-3);//1
		System.out.println(-10/-3);//-1
		
		//作为独立语句使用，前++和后++完全一样。
		int i = 10;
		i++;//11
		
		++i;//11+1=12
		
		
		/*
		作为表达式使用
		前++：++x  先自增，再赋值
		后++：x++  先赋值，再自增	  
		 */
		
		int j = 8;
		int k = ++j; //j = j + 1 ; k = j  j = 9; k = 9
		System.out.println("k=" + k + "j=" + j);
		
		int z = 8;
		int q = z++;//q = z; z = z + 1  q = 8;z = 9
		System.out.println("q=" + q + "z=" + z);
		
		//  --类推++即可。
		
	}
}
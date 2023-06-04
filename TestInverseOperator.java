

public class TestInverseOperator {
	
	public static void main(String[] agrs) {
		
		
		//1
		
		int x = 5;
		int y = 5;
		if(x++ == 6 & ++y == 6){   //逻辑与
			x = 11;
		}
		System.out.println("x=" + x + ",y=" + y);//6,6
		
		//2
		int a = 5;
		int b = 5;
		if(a++ ==6 && ++b ==6) {
			a = 11;
		}
		System.out.println("a=" + a + "b=" + b);//6,5
		
		//3
		int c = 5;
		int d = 5;
		if(c++ ==5 | ++d ==5) {
			c = 11;
		}
		System.out.println("c=" + c + "d=" + d);//11,6
		
		
		//4
		int e = 5;
		int f = 5;
		if(e++ ==5 || ++f ==5) {
			e = 11;
		}
		System.out.println("e=" + e + "f=" + f);//11,5
		
		
		//5
		boolean m = true;
		boolean h = false;
		short z = 46;
		if((z++ == 46)&& (h=true)) z++;
		if((m = false) || (++z == 49) ) z++;
		System.out.println("z=" + z);//50
		
		
		
		
		
		
		
		
		
		
		
		
	     }
	}


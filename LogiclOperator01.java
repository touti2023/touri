
public class LogiclOperator01 {
	
	public static void main(String[] agrs) {
		
		//&&逻辑与  和   &短路与  案例演示
		
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok100");
		}
		
		//&使用
		if(age > 20 & age < 90);
		System.out.println("ok200");
		
		
		//区别
		int a = 4;
		int b = 9;
		//对于&&短路与而言，如果第一个条件为False，后面条件不在判断。
		//对于&逻辑与而言，如果第一个条件为False，后面条件仍然判断。
		if(a < 1 && ++b < 50) {
			System.out.println("ok300");//为False，不出现
		}
		System.out.println("a = " + a + "b=" + b);//a = 4 ； b = 9
		
		
		if(a < 1 & ++b < 50) {
		System.out.println("ok400");//为False，不出现
	}
	    System.out.println("a = " + a + "b=" + b);//a = 4 ； b = 10
	
		//开发中使用&&短路与。
	}
}
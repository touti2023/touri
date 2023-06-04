

//演示｜｜短路或  和 ｜逻辑或

public class LogicOperator02 {
	
	public static void main(String[] agrs) {
		
//只要一个条件为真，都为真。		
//区别：||短路或 只要第一个条件为真，后面不会判断。最终为True，效率高。
//		|逻辑与 不管第一个是否为真，都要判断第二个，效率低。
		
		int a = 4;
		int b = 9;
		if( a > 1 || ++b > 4) {
			System.out.println("ok300");
		}
		
	}
}
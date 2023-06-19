

//基本数据类型转换
//数据类型按精度（容量）大小排序为  背规则
//char--->int--->long--->floatp--->double
//byte--->short--->int--->long--->float--->double


public class AutoConvenrt {
	
	public static void main(String[] agrs) {
		
		//演示自动转换
		int num = 'a'; //ok  char-----> int
		double d1 = 80;//ok  int -----> double
		System.out.println(num);
		System.out.println(d1);
	
		
	}
}
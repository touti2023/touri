package Day0510;

public class OverLoadExercise {
     public static void main(String[] args) {
    	 
    	 //在主类的main ()方法中分别用参数区别调用三个方法。
    	Methods method = new Methods();
    	method.m(10);//100
    	method.m(10,20);//200
    	method.m("");//字符串信息
     }
}

/*
编写程序，类Methods中定义三个重载方法并调用。方法名为m。
三个方法分别接收一个int参数，两个int参数，一个字符串参数。分别执行平方运算，相乘，输出字符串信息，
并输出结果。
在主类的main()方法中分别用参数区别调用三个方法。
*/

class Methods {
	//分析1：
	//1.方法名 m
	//2.形参 （int）
	//3.返回形式：无。-》 void
	public void m(int n) {
		 System.out.println("平方=" + n * n);
	}
	    //分析2:
	    //1.方法名 m
		//2.形参 （int,int）
		//3.返回形式：无。-》 void
	public void m(int n1,int n2) {
		 System.out.println("相乘=" + n1 * n2);
}
      //分析3:
      //1.方法名 m
	  //2.形参 （String）
	  //3.返回形式：无。-》 void
public void m(String str) {
	 System.out.println("传入的str=" + str);
    }
}
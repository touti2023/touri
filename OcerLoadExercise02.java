package Day0510;

public class OcerLoadExercise02 {
    public static void main(String[] args) {
    	Methodss method = new Methodss();
    	
    	System.out.println(method.max(10,24));//24
    	System.out.println(method.max(1.3,2.4));//2.4
    	System.out.println(method.max(7.4,5.3,9.1));//9.1
    }
}

/*
定义三个重载方法max(),第一个方法，返回两个int值中的最大值，
第二个方法，返回两个double值中的最大值，
第三个方法，返回三个double值中的最大值，并分别调用三个方法。
 */

class Methodss {

	//分析1：
		//1.方法名 max
		//2.形参 （int,int）
		//3.返回形式：int
	public int max(int n1,int n2) {
		return n1 > n2 ? n1 : n2;
	}
	//分析2：
		//1.方法名 max
		//2.形参 （double,double）
		//3.返回形式：double
	public double max(double d1, double d2) {
		return d1 > d2 ? d1 : d2;
	}
	//分析3：
			//1.方法名 max
			//2.形参 （double,double,double）
			//3.返回形式：double
	public double max(double d1,double d2,double d3) {
		//求出n1和n2的最大值
		double max1 = d1 > d2 ? d1 : d2;
		return max1 > d3 ? max1 : d3;
	}
}

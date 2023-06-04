package Day0510;
public class OverLoad01  {
	public static void main(String[] args) {
		MyCalculator mc =  new MyCalculator();
		System.out.println(mc.calculate(1,2));
		System.out.println(mc.calculate(1.3,2));
	}
}


class MyCalculator {
	//两个整数的和
	public int calculate(int n1,int n2) {
		return n1 + n2;
	}
   //一个整数，一个double的和
	public double calculate(int n1,double n2) {
		return n1 + n2;
	}
	//一个double ,一个int和
	public double calculate(double n1,int n2) {
		return n1 + n2;
	}
	//三个int的和
	public double calculate(int n1,int n2,int n3) {
		return n1 + n2 + n3;
    }
	   
}
package Day0512;

public class Aserf{
	public static void main(String[] args) {
		Aserf aObj = new Aserf();
		aObj.m1();
	}
	//si四个属性,分别使用不同的访问修饰符
	public int n1 = 100;
	protected int n2 = 200;
	int n3 =300;
	private int n4 = 400;
	public void m1() {
		//该方法可以访问 四个属性
		System.out.println("n1=" + n1 + "n2=" + n2 + "n3=" + n3 + "n4=" + n4);
	}
}

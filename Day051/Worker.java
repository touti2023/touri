package Day051602;

public class Worker extends Employee {

	public Worker(String name, double salary) {
		super(name, salary);
		
	}
	
	public void work() {
		System.out.println(" 普通员工 " + getName() + " 正在摸鱼。");
	}
	
	public double getAnnual() {//因为普通员工没有其他收入，直接调用父类方法即可。
		return super.getAnnual();
	}
}

package Day0512;
/*
创建程序，在其中定义两个类：Account 和 AccountTest 类，体会java的封装性。

Account类 要求具有属性：姓名（长度为2-4位），余额(>20),密码(必须是六位)，
如果不满足，则给出提示信息，并给默认值。

通过setXxx的方法给Account的属性赋值。
在AccountTest中测试
 */
public class Account {
	//为了封装，将3个属性设置为private
	private String name;
	private double balance;
	private String pwd;
	
	//提供两个构造器，控制输入信息
	public Account() {//1.空构造器 
		
	}
	
	public Account(String name,double balance,String pwd) {
		this.setName(name);
		this.setBalance(balance);
		this.setPwd(pwd);
	}
	
	public String getName() {
		return name;
	}
	//姓名长度；2-4位
	public void setName(String name) {
		if(name.length() >= 2 && name.length() <= 4) {
		this.name = name;
		}else {
			System.out.println("姓名长度；2-4位，默认为 山田太郎");
			this.name = "山田太郎";
		}
	}
	public double getBalance() {
		return balance;
	}
	//残高（必須＞20）
	public void setBalance(double balance) {
		if(balance > 20) {
		this.balance = balance;
		}else {
			System.out.println("余额必须>20,默认为0");
		}
	}
	public String getPwd() {
		return pwd;
	}
	//密码（必须是6位）
	public void setPwd(String pwd) {
		if(pwd.length() == 6) {
		this.pwd = pwd;
		}else {
			System.out.println("必须是6位密码，默认密码为 000000");
			this.pwd = "000000"; 
		}
	}
	//显示账号信息：
	public void showInfo() {
		//可以增加校验权限
		System.out.println("账号信息  姓名 " + name + "  余额 " +balance + "  密码 " + pwd);
	}
	
}
